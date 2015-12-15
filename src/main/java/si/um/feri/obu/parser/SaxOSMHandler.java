package si.um.feri.obu.parser;

import com.google.maps.DistanceMatrixApi;
import com.google.maps.DistanceMatrixApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import si.um.feri.obu.domain.xjc.GeoLocation;
import si.um.feri.obu.domain.xjc.Track;
import si.um.feri.obu.domain.xjc.TrackPoint;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SaxOSMHandler extends DefaultHandler {
    private HashMap<Long, TrackPoint> trackPointHashMap;
    private List<Track> trackList;

    private TrackPoint tempTrackPoint;
    private Track track;

    @Override
    public void startDocument() throws SAXException {
        trackPointHashMap = new HashMap<>();
        trackList = new ArrayList<>();
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equalsIgnoreCase("NODE")) {
            tempTrackPoint = new TrackPoint();
            tempTrackPoint.setTimestamp(Instant.parse(attributes.getValue(attributes.getIndex("timestamp"))).toEpochMilli());
            GeoLocation geoLocation = new GeoLocation();
            geoLocation.setLat(Float.parseFloat(attributes.getValue(attributes.getIndex("lat"))));
            geoLocation.setLon(Float.parseFloat(attributes.getValue(attributes.getIndex("lon"))));
            tempTrackPoint.setLocation(geoLocation);
            trackPointHashMap.put(Long.parseLong(attributes.getValue(attributes.getIndex("id"))), tempTrackPoint);
            //System.out.println(tempTrackPoint);
        }

        if (qName.equalsIgnoreCase("WAY")) {
            track = new Track();
        }

        if (qName.equalsIgnoreCase("ND")) {
            track.getTrackPoints().add(trackPointHashMap.get(Long.parseLong(attributes.getValue(attributes.getIndex("ref")))));
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws
            SAXException {

        if (qName.equalsIgnoreCase("WAY")) {
            if (track.getTrackPoints().size() > 100 && track.getTrackPoints().get(0).getTimestamp() !=
                    track.getTrackPoints().get(track.getTrackPoints().size() - 1).getTimestamp()) {

                GeoApiContext context;
                if(trackList.size()%2==0) {
                    context = new GeoApiContext().setApiKey("AIzaSyCXHzi-KPaNMhQwoEmPyLtEG25JsgDMu30");
                } else {
                    context = new GeoApiContext().setApiKey("AIzaSyD97Hl184CrZwdiGTl0E9J1FgCmkZMcqVE");
                }

                DistanceMatrixApiRequest request = DistanceMatrixApi.newRequest(context);
                request.mode(TravelMode.DRIVING);
                request.units(Unit.METRIC);
                request.origins(new LatLng(track.getTrackPoints().get(0).getLocation().getLat(), track.getTrackPoints().get(0).getLocation().getLon()));
                request.destinations(new LatLng(track.getTrackPoints().get(track.getTrackPoints().size() - 1).getLocation().getLat(),
                        track.getTrackPoints().get(track.getTrackPoints().size() - 1).getLocation().getLon()));

                try {
                    DistanceMatrixRow[] rows = request.awaitIgnoreError().rows;

                    for (int i = 0; i < rows.length; i++) {
                        DistanceMatrixElement[] elms = rows[i].elements;
                        for (int j = 0; j < elms.length; j++) {
                            if (elms[j].status == DistanceMatrixElementStatus.OK) {
                                //System.out.println("track id: " + track.getId());
                                //System.out.println("distance: " + elms[j].distance.inMeters + "m");
                                //System.out.println("duration" + (elms[j].duration.inSeconds / 60) + "min");
                                track.setDistance(elms[j].distance.inMeters);
                                track.setDuration(elms[j].duration.inSeconds);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                trackList.add(track);
                //System.out.println(track);
            }
        }


    }

    public List<Track> getTrackList() {
        return trackList;
    }
}

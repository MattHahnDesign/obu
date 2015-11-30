package si.um.feri.obu.parser;

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
            if (track.getTrackPoints().size() > 5) {
                trackList.add(track);
                //System.out.println(track);
            }
        }


    }

    public List<Track> getTrackList() {
        return trackList;
    }
}

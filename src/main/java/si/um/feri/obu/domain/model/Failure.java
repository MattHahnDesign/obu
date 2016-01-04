package si.um.feri.obu.domain.model;

import si.um.feri.obu.domain.xjc.GeoLocation;

public class Failure {

    private long datetime;
    private GeoLocation geoLocation;

    public Failure() {
        super();
    }

    public Failure(long datetime, GeoLocation geoLocation) {
        this.datetime = datetime;
        this.geoLocation = geoLocation;
    }

    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    @Override
    public String toString() {
        return "Failure{" +
                "datetime=" + datetime +
                ", geoLocation=" + geoLocation +
                '}';
    }
}

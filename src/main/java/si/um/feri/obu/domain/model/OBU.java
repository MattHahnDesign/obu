package si.um.feri.obu.domain.model;

import si.um.feri.obu.domain.xjc.CarError;
import si.um.feri.obu.domain.xjc.Track;

import java.util.List;

public class OBU {

    private String id;
    private Track currentTrack;
    private long trackStartedDateTime;
    private long trackEndDateTime;
    private List<String> drivenRoutesIds;
    private List<Notification> notificationsReceived;
    private List<CarError> carErrors;

    public OBU() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Track getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(Track currentTrack) {
        this.currentTrack = currentTrack;
    }

    public long getTrackStartedDateTime() {
        return trackStartedDateTime;
    }

    public void setTrackStartedDateTime(long trackStartedDateTime) {
        this.trackStartedDateTime = trackStartedDateTime;
    }

    public long getTrackEndDateTime() {
        return trackEndDateTime;
    }

    public void setTrackEndDateTime(long trackEndDateTime) {
        this.trackEndDateTime = trackEndDateTime;
    }

    public List<String> getDrivenRoutesIds() {
        return drivenRoutesIds;
    }

    public void setDrivenRoutesIds(List<String> drivenRoutesIds) {
        this.drivenRoutesIds = drivenRoutesIds;
    }

    public List<Notification> getNotificationsReceived() {
        return notificationsReceived;
    }

    public void setNotificationsReceived(List<Notification> notificationsReceived) {
        this.notificationsReceived = notificationsReceived;
    }

    public List<CarError> getCarErrors() {
        return carErrors;
    }

    public void setCarErrors(List<CarError> carErrors) {
        this.carErrors = carErrors;
    }

    @Override
    public String toString() {
        return "OBU{" +
                "id='" + id + '\'' +
                ", currentTrack=" + currentTrack +
                ", trackStartedDateTime=" + trackStartedDateTime +
                ", trackEndDateTime=" + trackEndDateTime +
                ", drivenRoutesIds=" + drivenRoutesIds +
                ", notificationsReceived=" + notificationsReceived +
                ", carErrors=" + carErrors +
                '}';
    }
}

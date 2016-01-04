package si.um.feri.obu.domain.model;

import si.um.feri.obu.domain.xjc.CarError;
import si.um.feri.obu.domain.xjc.CarParameter;
import si.um.feri.obu.domain.xjc.Track;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OBU {

    private String id;
    private Track currentTrack;
    private long trackStartedDateTime;
    private long trackEndDateTime;
    private List<String> drivenRoutesIds;
    private List<Notification> notificationsReceived;
    private List<CarError> carErrors;
    private Failure failure;
    private Map<CarParameter, Float> carParameters;

    public OBU() {
        this.failure = null;
        this.carParameters = new HashMap<>();
        this.carParameters.put(CarParameter.OIL, 0f);
        this.carParameters.put(CarParameter.ENGINE_TEMPERATURE, 0.00f);
        this.carParameters.put(CarParameter.TYRE_PRESSURE, 2.2f);
        this.carErrors = new ArrayList<>();
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

    public Failure getFailure() {
        return failure;
    }

    public void setFailure(Failure failure) {
        this.failure = failure;
    }

    public Map<CarParameter, Float> getCarParameters() {
        return carParameters;
    }

    public void setCarParameters(Map<CarParameter, Float> carParameters) {
        this.carParameters = carParameters;
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
                ", failure=" + failure +
                ", carParameters=" + carParameters +
                '}';
    }
}

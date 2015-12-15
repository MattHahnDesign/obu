package si.um.feri.obu.domain.model;

public class Notification {

    private long datetime;
    private String content;

    public Notification() {
        super();
    }

    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "datetime=" + datetime +
                ", content='" + content + '\'' +
                '}';
    }
}

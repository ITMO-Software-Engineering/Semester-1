package Environment;

public class Weather {
    Status[] status;

    public Weather() {
        this.status = new Status[]{Status.UNKNOWN};
    }

    public Weather(Status[] status) {
        this.status = status;
    }

    public enum Status {
        SUNNY,
        WARM,
        COLD,
        FOGGY,
        UNKNOWN;
    }

    public void changeStatus(Status[] newStatus) {
        this.status = newStatus;
    }

    public void getStatus() {

    }
}

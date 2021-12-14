package Environment;

public class Weather {
    public Status status;

    public Weather() {
        this.status = Status.UNKNOWN;
    }

    public Weather(Status status) {
        this.status = status;
    }

    public enum Status {
        WARM_AND_SUNNY,
        COLD_AND_FOGGY,
        UNKNOWN
    }

    public void changeStatus(Status newStatus) {
        this.status = newStatus;
    }

    public boolean isBadWeather(Weather weather) {
        return weather.status.equals(Status.COLD_AND_FOGGY);
    }

    public Status getWeather() {
        return this.status;
    }

    public String toString() {
        if(this.status.equals(Status.WARM_AND_SUNNY)) {
            return "warm and sunny";
        }
        if(this.status.equals(Status.COLD_AND_FOGGY)) {
            return "cold and foggy";
        }
        return "unknown";
    }
}

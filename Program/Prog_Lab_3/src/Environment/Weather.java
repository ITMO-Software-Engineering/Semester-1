package Environment;

public class Weather {
    Status[] status;

    public Weather() {
        this.status = new Status[]{Status.Unknown};
    }

    public Weather(Status[] status) {
        this.status = status;
    }

    public enum Status {
        Sunny,
        Warm,
        Cold,
        Foggy,
        Unknown,
    }

    public void changeStatus(Status[] newStatus) {
        this.status = newStatus;
    }

    public void getStatus() {
        System.out.print("The weather is ");
        for (Status s:this.status) {
            System.out.print(s);
        }
    }
}

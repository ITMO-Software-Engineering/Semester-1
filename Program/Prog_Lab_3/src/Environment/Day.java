package Environment;

public class Day {
    int day;
    public Day() {
        this.day = 1;
    }

    public Day(int date) {
        this.day = date;
    }

    public void goNextDay() {
        this.day++;
    }
}

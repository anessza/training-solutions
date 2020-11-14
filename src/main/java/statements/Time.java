package statements;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getInMinutes() {
        return (hours*60 + minutes);
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getInSeconds() {
       return getInMinutes()*60 + seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public boolean earlierThan(Time second){
        return (this.getInSeconds() < second.getInSeconds());
    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }
}

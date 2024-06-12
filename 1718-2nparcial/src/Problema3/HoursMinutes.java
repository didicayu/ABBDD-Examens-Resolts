package Problema3;

public final class HoursMinutes implements Comparable<HoursMinutes>{
    int hours, minutes;
    public HoursMinutes(int hours, int minutes){
        if(hours > 24 || minutes > 60 || hours < 0 || minutes < 0) { throw new IllegalArgumentException("(. )( .)"); }
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getHours(){
        return this.hours;
    }

    public int getMinutes(){
        return this.minutes;
    }

    @Override
    public int compareTo(HoursMinutes date) {
        // Compare hours first
        if (this.hours != date.getHours()) {
            return this.hours - date.getHours();
        }
        // If hours are the same, compare minutes
        return this.minutes - date.getMinutes();
    }
}

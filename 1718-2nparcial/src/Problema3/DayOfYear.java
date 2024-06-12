package Problema3;

public final class DayOfYear {
    int day, month, year;
    public DayOfYear(int day, int month, int year){
        if(day > 31 || month > 12 || day < 0 || month < 0 || year <= 0){ throw new IllegalArgumentException("3===D"); }
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

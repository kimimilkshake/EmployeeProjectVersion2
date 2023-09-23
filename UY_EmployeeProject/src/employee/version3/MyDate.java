package employee.version3;

public class MyDate {
    private int day;
    private int month;
    private int year;

    // Constructors
    public MyDate() {
        day = 0;
        month = 0;
        year = 0;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Setters and Getters
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
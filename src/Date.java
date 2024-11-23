public class Date {
    private int day;
    private int month;
    private int year;

    //Constructors
    //Main Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //Default Constructor
    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }
    
    //toString()
    public String toString() {
        String outputString = String.format("%2d/%2d/%4d",this.month,this.day,this.year);
    }

    //Getters
    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }

    //Setters
    public void setDay(newDay) {
        this.day = newDay;
    }
    public void setMonth(newMonth) {
        this.month = newMonth;
    }
    public void setYear(newYear) {
        this.year = newYear;
    }
}
public class Date {
    int day;
    int month;
    int year;
    int date;
    Date(int day, int month, int year){

    }
    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getYear(){
        return year;
    }
    void setDay(int day){
        this.day=day;
    }
    void setMonth(int month){
        this.month=month;
    }
    void  setYear(int year){
        this.year=year;
    }
    void setDate(int day, int month, int year){
        this.date=date;
    }
    public String toString() {
        return "17/10/2024";
    }
}

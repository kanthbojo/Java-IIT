/*
-> A constructor should have the class name.
-> But different constructors are possible with different arguments/different datatypes
 */
class Date{
    int day, month, year;
    String w_day, w_month;
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date(String w_day, String w_month, int w_year){
        this.w_day = w_day;
        this.w_month = w_month;
        this.year = w_year;
    }
    public void print(){
        System.out.println("Today is " + this.day + "/" + this.month + "/" + this.year);
    }
    public void printfull(){
        System.out.println("Today is " + this.w_day + "th of " + this.w_month + " in " + this.year);
    }
    public void printday(){
        System.out.println("Today is " + this.w_day);
    }
    public Date(String w_day){
        this.w_day = w_day;
        this.printday();
    }
}
public class constructoroverload {
    public static void main(String[] args) {
        Date d1 = new Date(17,11,2002);
        Date d2 = new Date("Seventeen","November",2002);
        Date d3 = new Date("Seventeen");  // -> 1st output
        d1.print(); // 2nd output
        d2.printfull(); // 3rd output
    }
}

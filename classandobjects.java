/*
    -> A class in Java is a set of objects which shares common characteristics/ behavior and common properties/ attributes.
    It is a user-defined blueprint or prototype from which objects are created.

    -> A constructor in Java is responsible for giving some value to the object at the time of object creation.
    Constructor is the first function that executes when an object is created.
 */
class Car{
    private String brand;
    private String model;
    private int year;
    private int price;
    public Car(String brand,String model,int year, int price){ //->  Constructors are special fn that are called when a object is created
         this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void price(){
        System.out.println("The price " + this.brand +" "+  this.model + " is "+ this.price);
    }
}

public class classandobjects {
    public static void main(String[] args) {
        Car c1 = new Car("Toyoto","Innova",2012,1800000); // new creates a new object of that class type
        Car c2 = new Car("BMW","X7",2018,11000000);
        c1.price();
        c2.price();
    }
}

package d21oop;

public class Car extends Vehicle {

    public String model = "Accord";
    public int year =2024;


    public Car(){
        this("Sport");
        System.out.println("Sedan");
    }

    public Car (String tip){  //3
        super("honda",2024,"Elektrikli");
        System.out.println("sport");

    }



}

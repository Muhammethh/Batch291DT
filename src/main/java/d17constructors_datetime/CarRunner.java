package d16methodcreation_overloading_varargs_passbyvalue;

import javax.swing.*;

public class CarRunner {

    public static void main(String[] args) {

        //4- Car class’indan bir object uretelim

        Car c1 = new Car();
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);

        c1.action();
        c1.stop();

        //5- Car class’a donup, constructor olusturalim








    }
}

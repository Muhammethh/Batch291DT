package d19stringbuilder_buffer_accessmodifier_static;

import java.util.Stack;

public class Student2Runner {

    public static void main(String[] args) {




        System.out.println(Student2.stdName); //static olduğu için ulaşabildik

        Student2 ali = new Student2(); //non-static olan age'e ulaşabilmek içinse obje üretmemiz lazım
        System.out.println(ali.age);

        Student2.staticMethod(); // static olduğu için Class ismi üzerinden ulaşabildik

        ali.nonStaticMethod();//non-static method olduğu için obje üzerinden ulaşabildik




    }
}

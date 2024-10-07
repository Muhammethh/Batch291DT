package d18datetime_stringbuilder;

import d19stringbuilder_buffer_accessmodifier_static.Student;

public class AnotherPackagaClass {

    public static void main(String[] args) {

        Student veli = new Student();
        System.out.println(veli.stdName);
        //Diğerlerine ulaşamayız sadece bu class çocuğu olsaydı ona ulaşırdık ama onu kurmadık,
        //ama toStrng metotunu açarsak bütün bilgilere burdan da ulaşırız
        //System.out.println(veli); yazarak

    }
}

package d22oop;

public class StudentRunner {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("s.getAge() = " + s.getAge()); //13
        System.out.println("s.isSuccessful() = " + s.isSuccessful()); //true

        s.setAge(25);
        System.out.println("s.getAge() = " + s.getAge());
        s.setSuccessful(false);
        System.out.println("s.isSuccessful() = " + s.isSuccessful());

        //ODEV: encapsulation da private ile gizlenen bir veri baska package’dan set method ile degistirilebilir mi?
            //evet değiştirilebilir ve get metotu ile okunabilir


    }
}

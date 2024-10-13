package d17constructors_datetime;

public class CarRunner {

    public static void main(String[] args) {

        //4- Car class’indan bir object uretelim

        //9- Default Car() icine parametre girelim

        Car c1 = new Car("BMW", "3.20",2024,false);
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);
        System.out.println(c1.hybrid);

        c1.action();
        c1.stop();

        //5- Car class’a donup, constructor olusturalim


        //10- Baska bir object uretelim ve direkt objeyi yazdiralim

        Car c2 = new Car("audi","A4",2018,false);
        System.out.println(c1); //reference alındı  //Car{brand='BMW', model='3.20', year=2024, hybrid=false}
        System.out.println(c2); //reference alındı  //Car{brand='audi', model='A4', year=2018, hybrid=false}

        //11- Reference durumunu duzeltmek icin Car class’a tostring methodu ekleyelim
        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.

        //16- Yeni bir object uretelim


        Car c3 = new Car("Tofaş","Şahin");
        System.out.println(c3); //Car{brand='Tofaş', model='Şahin', year=2023, hybrid=true}  //geri kalanı default olandan alıyor
        // biz döngü kodlarıyla defaultu silebiliriz.

























    }
}

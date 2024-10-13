package d20staticblock_instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {

        InstanceBlock3 obj1 = new InstanceBlock3();
       /* Araba rengi Siyah
        Araba yakıt türü Benzin*/

        InstanceBlock3 obj2 = new InstanceBlock3();
        /* Araba rengi Siyah
        Araba yakıt türü Benzin*/

        //Bir veya daha cok object(instance) daha uretsem, o da siyah ve benzin olur

        //Ancak constructor'larla ozellestirilebilir

        InstanceBlock3 obj3 = new InstanceBlock3("Kırmızı","Dizel");
        System.out.println("Araba rengi: " + obj3.color);
        System.out.println("Araba yakıt türü: " + obj3.fuelType);


        InstanceBlock3 obj4 = new InstanceBlock3();
        /* Araba rengi Siyah
        Araba yakıt türü Benzin*/ //yine orjinale döndü



    }
}

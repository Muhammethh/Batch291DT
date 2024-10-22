package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {

        //Engine e = new Engine(); //HATA, interface'lerden object uretilmez

        AudiA4 a4 = new AudiA4();
        a4.turbo(); //Audi A4 turbo motor kullanir
        a4.analog(); //Audi A4 analog klima kullanir
        a4.esp(); //Audi A4 esp fren sistemi kullanir

        //Engine.price = 5000; HATA, yeni deger atanamaz

        System.out.println(Engine.fiyat); //300
        System.out.println(AC.fiyat); //200
        System.out.println(Brake.fiyat); //100

        Engine.speed(); //Saatte 300km
        a4.power(); //200HP

    }
}
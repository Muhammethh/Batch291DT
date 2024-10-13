package d18datetime_stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        //capacity() methodu, ayrılmış olan ve henüz kullanılmayan karakter alanının büyüklüğünü ifade eder.
        // Buradaki “karakter” kavramıyla kastedilen şey, Java’daki char veri tipindeki karakterlerdir.
        // char veri tipi, Java’da Unicode karakterleri temsil etmek için kullanılır ve
        // her bir char 2 byte (16-bit) yer kaplar.

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length()); //0
        System.out.println(sb2.capacity()); //16 default capacity

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length()); //4 //19
        System.out.println(sb2.capacity()); //16 //34 (2 katının 2 fazlası)

        /*capacity Java'nin size verdigi data depolama yer sayisidir,
        length ise size verilen data depolama yerinin kullanilan kismidir

        ==>Java  baslangic olarak size capacity 16 olarak verir,
        Siz eger verilen bu capacity'i asarsaniz Java yeni capacity'i var olanin 2 katinin 2 fazlasi olacak sekilde ayarlar
        16==> 16*2+2 = 34,  34 ==> 34*2+2 = 70  …..*/

        //---------------

        //Default Capacity'yi (16 karakter) nasil degistirebiliriz?
        System.out.println("Default Capacity'yi (16 karakter) nasil degistirebiliriz?");

        StringBuilder sb3 = new StringBuilder(3); //Constructor kismina int yazilirsa capacity sayilir
        System.out.println(sb3.append("Ali"));
        System.out.println(sb3.capacity()); //2 katının 2 fazlası 8

        //-----------------
        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.length()); //0
        System.out.println(sb4.capacity()); //16

        sb4.append("Java");
        System.out.println(sb4.length());  //4
        System.out.println(sb4.capacity()); //16

        sb4.append("xxxxxxxxxxxxxxxxxxxx");
        System.out.println(sb4.length());   //24
        System.out.println(sb4.capacity()); //34 --- 16nın 2 katı artı 2


        //ALTTAKİ NOTLAR AYNI APPEND İÇİNE 20 X EKLENMESİ DURUMUNDA GERÇEKLEŞİR; AYRI APPENDDE LENGTH 64, CAPACITY,70 OLUR
        sb4.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(sb4.length());  //44
        System.out.println(sb4.capacity());//44  capacity'i length kadar arttırıyor


    }
}

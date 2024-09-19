package çalışmalar;

import java.util.Scanner;

public class DenemeStringMan6 {
    public static void main(String[] args) {

        //String Data Tipi (Class)
        //String data tipi, cumleler, kelimeler, semboller, rakamlar icerebilir.

        //Ornek 1: "s" String'inde kullanilan karakter sayisini bulunuz.
        //Example 1: Find the number of characters used in String "s".

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String weatherCon = input.nextLine();

         int character = weatherCon.length();
         System.out.println(character);

        //Ornek 2: "s" String'inde ilk ve son index'teki karakterleri aliniz.
        //Example 2: Get the characters in the first and last index of String "s".

        //charAt(int index) metodu, belirtilen index'te yer alan karakteri döndürmek için kullanılır.
        //Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.
        //Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
        // gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.

        char firstChar = weatherCon.charAt(0);
        System.out.println(firstChar);


        char lastChar = weatherCon.charAt(weatherCon.length()-1);
        System.out.println(lastChar);


        System.out.println("Kaçıncı indexi aralığını istiyon");
        int index = input.nextInt();
        // int index2 = input.nextInt();

        String sub1 = weatherCon.substring(index);
        System.out.println(sub1);








    }

}

package çalışmalar;

public class DenemelerStringMan {

    public static void main(String[] args) {

        String s = "Java is easy";

        //Ornek 1: "s" String'inde kullanilan karakter sayisini bulunuz.
        //Example 1: Find the number of characters used in String "s".

        int lenght = s.length();
        System.out.println(lenght);

        //Ornek 2: "s" String'inde ilk ve son index'teki karakterleri aliniz.
        //Example 2: Get the characters in the first and last index of String "s".

        //charAt(int index) metodu, belirtilen index'te yer alan karakteri döndürmek için kullanılır.
        //Indeks 0 tabanlıdır, yani ilk karakterin indeksi 0'dır, ikinci karakterin indeksi 1, ve böyle devam eder.
        //Java'da indexleme, genellikle diziler (arrays), dizeler (Strings) veya koleksiyonlar (collections)
        // gibi bir veri yapısındaki belirli bir elemana erişmek için kullanılan bir tekniktir.

        char firstLast = s.charAt(0);
        System.out.println(firstLast);

        char last = s.charAt(11);
        System.out.println(last);

        char last2 = s.charAt(s.length()-1);
        System.out.println(last2);

        //Ornek 3: “s” String’indeki ilk 4 karakteri aliniz.
        //Example 3: Get the first 4 characters of the string “s”.

        //substring(int beginIndex, int endIndex): Belirtilen indeks aralığındaki substring’i döndürür.
        //substring(0, 4) ==> “0” yani ilk index dahil, “4" yani ikinci index haric dir. [0,4)

        String first4 = s.substring(0,4);
        System.out.println(first4);

        //Ornek 4: “s” String’indeki “is” kelimesini aliniz.
        //Example 4: Get the word “is” in String “s”.

        String is = s.substring(5,7);
        System.out.println(is);

        //Ornek 5: “s” String’indeki “easy” kelimesini aliniz.
        //Example 5: Get the word “easy” in String “s”.

        String last5 = s.substring(8);
        System.out.println(last5);


        //Ornek 6: "s" String'inde easy kelimesinin var olup olmadigini kontrol ediniz.
        //Example 6: Check if the word easy exists in the String "s".

        //contains() method'u herhangi bir karakterin veya karakterlerin String'de var olup olmadigini kontrol eder.
        //contains() methodu true veya false return eder. boolean

        boolean isTrue = s.contains("easy");
        System.out.println(isTrue);

        //Ornek 7: “s” String’inin belli bir harfle baslayip baslamadigini kontrol ediniz.
        //Example 7: Check if the string “s” starts with a certain letter.
        //startsWith() methodu bir Strig’in ilk karakterini/karakterlerini kontrol eder
        //startsWith() methodu boolean return eder.

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Ornek 8: "s" String'inin "easy" ile bitip bitmedigini kontrol ediniz.
        //Example 8: Check if the string "s" ends with "easy".

        //endsWith() methodu bir Strig'in son karakterini/karakterlerini kontrol eder
        //endsWith() methodu boolean return eder.

        boolean son = s.endsWith("Y");
        System.out.println(son);










    }
}

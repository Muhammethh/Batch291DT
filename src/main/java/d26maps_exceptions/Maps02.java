package d26maps_exceptions;

import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {


        HashMap<String, Integer> stdAges = new HashMap<>();

        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Tom", 33);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);

        stdAges.put("Tom", 35);
        System.out.println(stdAges); //Tomu günceller ama bunun daha iyi bir yolu var

        //1) replace() methodu, value'lari key'leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdAges.replace("Tom", 39);
        System.out.println(stdAges);

        //2) replace() methodu, eski deger kontrolu yaparakta calisir

        stdAges.replace("Tom", 21, 45);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}
        //Degisiklik olmayacak cunku eski deger 21 degil

        stdAges.replace("Tom", 39, 45);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}
        //Degisiklik olacak cunku eski deger 39.


        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map’te yoksa Map’e ekler.
        // Key Map’te zaten varsa, metodun hiçbir etkisi olmaz.

        stdAges.putIfAbsent("Tom", 77);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}
        // Tom Keyi mapte olduğu için eklemedi.


        stdAges.putIfAbsent("Ayşe", 23);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Ayşe=23, Tom=45, Veli=63, Ali=18}

        //4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, ikisi de ayni isi yapar
        //key verirsiniz, size value verir. Ancak getOrDefault() metodu, anahtar bulunamadığında
        // bir varsayılan değer sağlama avantajına sahiptir.

        System.out.println(stdAges.get("Tom")); //45
        System.out.println(stdAges.getOrDefault("Tom", 18)); //45, Tom map'te var
        //Tom'un orjinal degerini verdi

        System.out.println(stdAges.get("Jerry")); //null
        System.out.println(stdAges.getOrDefault("Jerry", 18)); //18


        //5)containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
        //Boolean return ederler

        Boolean b = stdAges.containsValue(19);
        System.out.println(b); //true

        System.out.println(stdAges.containsKey("Tom")); //True
        System.out.println(stdAges.containsKey("TOM")); //False

        //------------------Buyuk kucuk harfe duyarsiz yapma

        Map<String,Integer> stdAges2 = new HashMap<>();

        stdAges2.put("Tom".toLowerCase(),25);

        System.out.println(stdAges2); //{tom=25}

        boolean b1 = stdAges2.containsKey("TOM".toLowerCase());
        System.out.println(b1); //true
        //---------------------------------

        String emoji = "\uD83D\uDE0A";
        System.out.println(emoji);

        String emoji2 = "\uFE0F";



    }
}

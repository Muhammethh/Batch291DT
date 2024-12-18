package d25collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {

        //1) Map’ler sozluk gibidir. Aciklamalidir. orn: Ali = 13 .Map’ler collections degildir. Ordan miras almaz
        //2) Sol taraf yani key’ler tekrarsizdir. Value tarafi tekrarli olabilir.
        //3) Key tarafi icin Set kullanilir. Values için ise genellikle Collection yapısı kullanılır.
        //4) Map’in elemanlarina komple ‘entry set’ (giris elemani) denir.

        //Map nasil olusturulur?

        //put():Bir key-value çiftini map’e ekler.

        //1) HashMap: Key-value çiftlerini rastgele bir sırayla depolayan bir Map türüdür.En hizlisidir.
        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Ali Can", 13);
        myMap.put("Veli Han", 18);
        myMap.put("Ayse Kaya", 15);
        myMap.put("Fatma Yilmaz", 19);
        myMap.put("Ali Can", 25); //key tekrarlı kullanıldığında son value aktif olur.
        System.out.println(myMap); //{Fatma Yilmaz=19, Ali Can=25, Veli Han=18, Ayse Kaya=15}

        //Sadece ‘key’ degerlerini nasil alabiliriz?
        //keySet(): Map’teki tüm key’lerin bir set’ini döndürür.Set’in sırası rastgeledir.

        Set<String> keySide = myMap.keySet();
        System.out.println(keySide); //[Fatma Yilmaz, Ali Can, Veli Han, Ayse Kaya]


        //Sadece ‘value’ degerlerini nasil alabiliriz?
        //values():Map’teki tüm value’ların bir collection’ını döndürür.Collection’ın sırası rastgeledir.

        Collection<Integer> values = myMap.values();
        System.out.println(values);//[25, 25, 18, 15]

        //get(): Bir key’e karşılık gelen değeri döndürür.key verirsiniz value’sunu getirir


        Integer age = myMap.get("Ali Can");
        System.out.println(age); //25

        //Ornek 1: myMap’deki kisilerin yaslarinin ortalamasi nedir?
        //Example 1: What is the average age of the people in myMap?

        Collection<Integer> values2 = myMap.values();

        int total = 0;

        for (Integer w : values2) {

            total = total + w;

        }
        System.out.println(total);

        int ort = total / values2.size();
        System.out.println(ort); //19

        System.out.println("----------------------");

        //entrySet() metodu, HashMap'in tüm degerlerini içeren (key-value) bir Set döndürür.
        // Dongu gibi ayri satirlarda yazdirir.Cunku Loop'lar direkt Map'ler ile kullanilamaz.
        //Bu yuzden ozel method gelistirilmis. Set'in icinde Map yapisi saklanir.

        System.out.println(myMap); //{Fatma Yilmaz=19, Ali Can=25, Veli Han=18, Ayse Kaya=15}

        Set<Map.Entry<String, Integer>> myEntrySet = myMap.entrySet();
        System.out.println(myEntrySet);

        System.out.println("------------------------");
        for (Map.Entry<String, Integer> w : myEntrySet) {

            System.out.println(w);
        }

        /* Fatma Yilmaz=19
        Ali Can=25
        Veli Han=18
        Ayse Kaya=15 */

        //--------------------------
        //Ornek 2: Verilen Map’deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz.
        //Example 2: Find the sum of the number of characters and the age of the person names in the given Map.

        //Java’da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
        // hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.

        HashMap<String, Integer> people = new HashMap<>();

        people.put("Ali",3);
        people.put("Can",5);
        people.put("Ayşe",2);

        int sum = 0;

        Set<Map.Entry<String,Integer>> mySet =  people.entrySet();
        System.out.println(mySet);

        for (Map.Entry<String,Integer> w: mySet ){

            sum = sum + w.getKey().length() + w.getValue();

        }
        System.out.println(sum); //20


    }
}

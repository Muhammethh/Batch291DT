package d12loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        /*
            1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
            2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
            bir String dizisi sadece String değerler saklayabilir.
            3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
            Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
            4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
            5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
            6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
            (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
*/

        //Array oluşturmak
        String[] stdNames1 = new String[3];
        //String stdName2[]= new String[4];  //C style

        System.out.println(Arrays.toString(stdNames1));

        //ornek 1: 5 elemanli notes adinda, int bir arrray olusturunuz ve console’a yazdiriniz

        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes)); //[0, 0, 0, 0, 0]

        //ornek 2: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz
        //Array’ler de non primitive (reference) veri tipleri de saklanabilir.

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers)); //[null, null, null, null, null, null, null, null, null, null]

        //ornek 3: 3 elemanli names adinda, String bir array olusturunuz ve console’a yazdiriniz

        String[] names = new String[3];
        System.out.println(Arrays.toString(names)); //[null, null, null]

        //Array’e eleman eklemek
        //index mantigiyla ekleniyor. 0 ilk index demektir

        names[0] = "Ali can";
        names[2] = "Veli Han";
        names[1] = "ayşe hanım";
        // names[3] = "hasan kaya"; hata verir 3. indeks yok

        System.out.println(Arrays.toString(names));

        //Bir veriyi gormek icin ise;
        System.out.println(names[1]); //ayşe hanım

        names[0] = "Omer can";
        System.out.println(Arrays.toString(names)); //[Omer can, ayşe hanım, Veli Han]

        //-------------------------------------------

        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //      icerdigi karakter sayilari toplamini ekrana yazdirin.
        //Example 1: Create a String array, add 5 elements to it, all elements have
        // display the sum of the number of characters it contains.

        String[] cities = new String[5];
        cities[0] = "Bayburt";
        cities[1] = "Sivas";
        cities[2] = "Denizli";
        cities[3] = "Adana";
        cities[4] = "Ankara";

        //1.yol for loops

        int totalChar = 0;
        for (int i = 0; i < cities.length; i++) { // burda ki lenght field dir method değildir
            totalChar = totalChar + cities[i].length(); //lenght() methoddur
        }
        System.out.println(totalChar);


        //2.Yol-------- For each yol

        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop’taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w’nun kullanilmasidir.

        //KALIBI

        /*        for (Datatype variable : array yada collections){
            calisacak kodlar
        }*/


        int sum = 0;
        for (String w : cities) {

            sum= sum + w.length();

        }
        System.out.println(sum); //30



    }
}

package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //0-100 arasinda rastgele bir sayi uretelim
        int rastgeleSayı = random.nextInt(101);
        System.out.println(rastgeleSayı);

        //Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim
        int denemeSayısı = 0;

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim.
        int tahminEdilen;    // int tahminEdilen = ""; olsa çalışırmıydı

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin bir
        //boolean degisken olusturalim
        boolean tahminDoğrumu = false;

        System.out.println("0-100 arasinda br sayiyi tahmin etmeye calisin");

        do {

            //Kullanıcıdan bir tahmin alalım
            System.out.println("tahmininizi yapınız");
            tahminEdilen = scanner.nextInt();

            //sayacı bir arttıralım

            denemeSayısı++;

            //tahmini kontrol edelim
            if (tahminEdilen<rastgeleSayı) {
                System.out.println("sayı daha büyük");
            } else if (tahminEdilen>rastgeleSayı) {
                System.out.println("sayı daha küçük");
            }else {
                tahminDoğrumu = true;
                System.out.println("Doğru sayı, tebrikler");
                System.out.println("Deneme sayısı: " + denemeSayısı);
            }

        }while (!tahminDoğrumu); //döngü doğru tahmin yapılıncaya kadar devam edecek
        scanner.close(); //random da kapatılıyor mu ??

        //ODEV: 20(dahil) ile 100(dahil) arasında random sayi isteseydik?





    }
}

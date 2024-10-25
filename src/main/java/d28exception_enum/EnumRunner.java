package d28exception_enum;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        //Cities c = new Cities(); HATA- enum'dan object uretilemez

        //1- Enum daki bir sabite nasil ulasabiliriz?

        Cities il = Cities.AMASYA;
        System.out.println(il); //AMASYA

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi); //Bursa

        //3- Ankara'nin posta koduna ulasalim
        String postaKodu = Cities.ANKARA.getPostalCode();
        System.out.println(postaKodu); //06000

        //4- Antalya’nin plaka koduna ulasalim
        System.out.println(Cities.ANTALYA.getPlateCode());

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        //values() methodu enum icindeki tum datalari bir Array icinde bize verir

        Scanner input = new Scanner(System.in);
        System.out.println("Plaka kodu giriniz");
        int plate = input.nextInt();

        Cities[] şehirler = Cities.values();
        //System.out.println(Arrays.toString(şehirler));

        if (plate < 1 || plate > 81) {

            System.out.println("Lğtfen 1-81 arasında bir rakam giriniz");

        } else {

            for (Cities w : şehirler) {

                if (plate == w.getPlateCode()) {

                    System.out.println("Girilen plaka " + w.getCityName() + " iline ait");
                    break;
                }
            }
        }

    }
}
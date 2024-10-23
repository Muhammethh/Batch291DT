package d28exception_enum;

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

    }
}
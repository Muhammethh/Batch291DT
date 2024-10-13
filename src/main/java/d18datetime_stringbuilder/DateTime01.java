package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime01 {

    public static void main(String[] args) {

        /*LocalTime Class'ta kullanilan tarih saat formatlari

                HH : mm ==> 24'lu saat sistemi
                hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
                hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
                HH : mm : ss ==> saniyeyi gosterir
                HH : MM ==> yanlis format cunku MM aylar icin kullanilir
                "mm" "minute" demektir. "MM" "month" demektir.

                dd-MM-yyyy ==> gun - ay - yil
                MMM ==> Aug
                MMMM ==> August  */

        //-------------
        //ornek 1:“DateTimeFormatter”, bir Class’tir ve tarih ve saat verilerini belirli bir
        // biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.
        //DateTimeFormatter, tarih ve saat nesnelerini “metin” yani String olarak biçimlendirmenize ve
        // metni tarih ve saat nesnelerine çözmenize olanak tanır.
        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini
        // biçimlendirmek için kullanılır.
        //format() method’u LocalTime’i String’e istedigimiz formatta cevirir

        LocalTime myCurrentTime = LocalTime.now();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm a");

        String formattedTime = dtf1.format(myCurrentTime);

        System.out.println(formattedTime);//11:14 ÖÖ

        //----------------------
        //Ornek 2: Tarih’i formatlayalim

        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);

        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
        String formattedDate = dtf2.format(myCurrentDate);
        System.out.println(formattedDate);

        //ornek 3: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

        //Tokyo’da ayin kaci?
        System.out.println("Tokyo’da ayin kaci?");
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdam’da ayin kaci?
        System.out.println("Amsterdam’da ayin kaci?");
        LocalDate dateInAmsterdam =LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyo’da saat kac?
        System.out.println("Tokyo’da saat kaç?");
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

        //Amsterdam’da saat kac?
        System.out.println("Amsterdam’da saat kaç?");
        LocalTime timeInAmsterdam = LocalTime.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(timeInAmsterdam);

        //Arastirma Odevi: Java bu bilgiyi internetten mi cekiyor?
        //-----------------------------------------------

        //Tüm zone'ları görelim

        /* Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        for (String w : zoneIds){

            System.out.println(w);

        }
        //Zaman dilimlerinin sayısını görelim
        System.out.println("Toplam zaman dilimi sayısı: " + zoneIds.size());
         */

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);  //2024-10-04T11:46:40.281256700

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd.MM.yyyy - hh : mm a");
        String formattedldt = dtf3.format(ldt);
        System.out.println(formattedldt);//04.10.2024 - 11 : 49 ÖÖ




    }
}

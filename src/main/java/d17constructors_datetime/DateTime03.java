package d17constructors_datetime;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {


        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.
        //Example 1: If the date you have received from the user is in the past, give the message “You have entered an invalid date”.
        //If the date you have received from the user is in the future, say “You can enter the time”.


        Scanner input = new Scanner(System.in);
        LocalDate givenDate = null;

        while (true) {
            System.out.println("Lütfen yılı giriniz");
            int year = input.nextInt();

            System.out.println("LÜtfen ayı giriniz");
            int month = input.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("Ay 1 ile 12 arasında olmalıdır. Tekrar deneyiniz");
                continue;
            }
            System.out.println("Lütfen günü giriniz");
            int day = input.nextInt();
            // Ayın kaç çektiğini bulalım,Yıl ve ay için YearMonth objesi oluşturalım
            YearMonth yearMonth = YearMonth.of(year, month);

            //Ayın maksimum sayısını bulalım
            int daysInMonth = yearMonth.lengthOfMonth();

            if (day < 1 || day > daysInMonth) {
                System.out.println(month + ". Ay " + daysInMonth + " gündür. Tekrar deneyiniz");
                continue;
            }
            givenDate = LocalDate.of(year, month, day); //girilen bilgilerle tarih oluştu

            if (givenDate.isBefore(LocalDate.now())) {
                System.out.println("Geçersiz, geçmiş tarih girildi Tekrar deneyiniz");
            } else {
                System.out.println("Zamanı girebilirsiniz");
                break; //geçerli tarih girildiği için döngü kırıldı
            }

        }

        //break'te buradaki kodlar calisir
        //return icinde bulundugu metodu sonlandirir. Burada main metodu sonlandirir ve
        //programin calismasi durur


    }
}

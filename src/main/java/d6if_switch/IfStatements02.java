package d6if_switch;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {

        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
        Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/
        
        /*Example 1: Write the code that decides whether it is Weekend or Weekday based on the day names given by the user.
        Monday ==> Weekday Saturday ==> Weekend*/

        //equals() iki String’in birbirinin aynisi olup olmadigini kontrol eder.
        //Bu method boolean return eder(true veya false).

        Scanner input = new Scanner(System.in);
        System.out.println("Gün ismini yazınız");

        String day = input.next();

        boolean isWeekendDay = day.equalsIgnoreCase("Cumartesi") ||
                day.equals("Pazar");

        boolean isWeekday = day.equalsIgnoreCase("Pazartesi") ||
                day.equalsIgnoreCase("Salı") ||
                day.equalsIgnoreCase("Çarşamba") ||
                day.equalsIgnoreCase("Perşembe") ||
                day.equalsIgnoreCase("Cuma");

        if (isWeekendDay)
        {
            System.out.println("Haftasonu");

        } else if (isWeekday)
        {
            System.out.println("Haftaiçi");

        } else {
            System.out.println("Geçerli bir veri giriniz");

        }


        //equalsIgnoreCase() iki String’in birbirinin aynisi olup olmadigini
        //buyuk kucuk harfi dikkate almadan kontrol eder

    }
}

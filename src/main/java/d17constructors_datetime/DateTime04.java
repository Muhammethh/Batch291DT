package d17constructors_datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DateTime04 {

    public static void main(String[] args) {

        //ornek 1: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        //example 1: Write the code that takes the date of birth from the user and finds the day name of the date entered.

        Scanner input = new Scanner(System.in);
        System.out.println("Doğum yılınızı, ayınızı ve gününüzü giriniz");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate bD = LocalDate.of(year, month, day);

        System.out.println(bD.getDayOfWeek());


    }
}

package d4operator_casting_scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {
        //Ornek 4: Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz

        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        //Example 4: Get the lengths of two sides of a rectangle from the user
        //i)Calculate the area ==> Short side * Long side
        //ii)Calculate its perimeter ==> 2*Short Side + 2*Long Side

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin Kısa kenarını girin");
        float shortSide = input.nextFloat();

        System.out.println("Dikdörtgenin uzun kenarını girin");
        float longSide = input.nextFloat();

        System.out.println("Area = " + (longSide * shortSide));
        System.out.println("Perimeter = " + (2 * longSide * 2 * shortSide));



    }
}

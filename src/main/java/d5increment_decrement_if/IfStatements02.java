package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {

        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        //Example 1: Create the code that prints whether a number received from the user is odd or even.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Bir sayı girin");
        int num = input.nextInt();


        //------------------1. Yol
        if (num % 2 == 0) {

            System.out.println("Çift Sayı");
        }

        if (num % 2 != 0) { // yada num % 2==1 de aynı işlevi görür

            System.out.println("Tek Sayı");

        }

        //---------------2. Yol
        //if - else Statements

        if(num % 2 == 0)
        {

            System.out.println("Çift");

        } else
        {

            System.out.println("Tek");

        }

    }



}

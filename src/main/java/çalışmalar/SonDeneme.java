package çalışmalar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SonDeneme {
    public static void main(String[] args) {

        int toplam = 0;

        for (int i = 100; i >= 0; i--) {


            if (i % 13 == 0) {
                System.out.println(i);
                toplam += i;

            }
        }

        System.out.println(toplam);

        System.out.println("--------------------------");

        /* TASK :
         Kullanıcıdan 5 adet sayı isteyiniz
         Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
         */

        /* Scanner input = new Scanner(System.in);

        int toplam2 = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("1 adet rakam giriniz");
            int sayı = input.nextInt();


            if (sayı >= 5 && sayı <= 10) {
                System.out.println("5-10 arasında ki rakamlar toplanmayacak");
                continue;
            }else {
                toplam2 += toplam2;
            }

        }
        System.out.println(toplam2);
        */

            //------------------------------------------

        Scanner input = new Scanner(System.in);

        /* int toplam2 = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("lütfen 1 adet sayı giriniz");
            int num = input.nextInt();

            if (num >= 5 && num <= 10) {
                System.out.println("aralık");
                continue;
            }
            toplam2 += num;


        }
        System.out.println("toplam = " + toplam2);

         */

        System.out.println("bir cümle girin");
        String line = input.nextLine();
        int total = 0;


        for (int i = 0; i <line.length() ; i++) {

                if (line.charAt(i)=='a'){
                    total++;
                }
                if (line.charAt(i)=='c'){
                    break;
                }

        }
        System.out.println(total);


        System.out.println("-----------------------------");

        for (int i = 0; i < 5 ; i++) {

            for (int j = 0; j <5 ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }


    }
}


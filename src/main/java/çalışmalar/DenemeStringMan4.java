package çalışmalar;

import java.util.Scanner;

public class DenemeStringMan4 {

    public static void main(String[] args) {

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(totalPrice);

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console'a yazdiriniz.
        //           "   ali cAN   " ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console.


        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.

        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna “method chain (zincir)” denir

        String isim = "   ali cAN   ";

        char isim2 = isim.trim().toUpperCase().charAt(0);
        System.out.println(isim2);

        char isim3 = isim.trim().toUpperCase().split("\\s+")[1].charAt(0);
        System.out.println(isim3);




    }
}

package çalışmalar;

import java.util.Scanner;

public class DenemeStringMan7 {

    public static void main(String[] args) {

        //Ornek 1: “s” String’indeki “money” kelimesini “dollar” kelimesine ceviriniz.
        //Example 1: Convert the word “money” in String “s” to “dollar”.

        //replace() methodu, 2.parametredekini 1.nin yerine koyar.
        //Kucuk buyuk harfe duyarlidir

        String s = "Learn java earn 12345 money";

        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz.
        //Example 2: Delete all "e" letters in the string "s".

        String s2 = s.replaceAll("e","");
        System.out.println(s2);

        //Ornek 1: s String'indeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz.
        //Example 1: Convert all digits (0, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9) in String s to "*"

        String s3 =s.replaceAll("[0-9]","*");
        System.out.println(s3);

        //Ornek 2: “s” String’indeki rakam sayisini bulunuz.
        //Example 2: Find the number of digits in String “s”

       int s4= s.replaceAll("[^0-9]","").length();
        System.out.println(s4);

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98

        //Example 1: Find the total price of the following products.
        //String tv = “$456.99”; String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        tv = tv.replace("$","");
        laptop = laptop.replace("$","");

        System.out.println(tv);

        double total = Double.valueOf(tv)+ Double.valueOf(laptop);
        System.out.println(total);

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console'a yazdiriniz.
        //           "   ali cAN   " ==> AC
        //Example 2: Take the first letters of the username, capitalize them and write them to the console.


        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.

        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna “method chain (zincir)” denir

        String isim = "   ali   cAN   ";

        char isim1 = isim.trim().toUpperCase().charAt(0);
        System.out.println(isim1);

        char isim2 = isim.trim().split("\\s+")[1].toUpperCase().charAt(0);
        System.out.println(isim2);



    }
}

package çalışmalar;

import java.util.Scanner;

public class Denemeler2 {

    public static void main(String[] args) {

        //---------------------------------------------------------
        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu yaziniz.
        Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/

        /* Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün giriniz");
        String day = input.next();

        boolean Weekend =  (day.equalsIgnoreCase("Cumartesi") ||
                            day.equalsIgnoreCase("Pazar"));

        boolean Weekday = (day.equalsIgnoreCase("Pazartesi")||
                day.equalsIgnoreCase("Salı")||
                day.equalsIgnoreCase("Çarşamba")||
                day.equalsIgnoreCase("Perşembe")||
                day.equalsIgnoreCase("Cuma"));

        if (Weekend) {
            System.out.println("Haftasonu");
        } else if (Weekday) {
            System.out.println("haftaiçi");
        } else {
            System.out.println("LÜtfen geçerli bir veri giriniz");
        }

         */

        //--------------------------------------------------------------------


        //nested : içiçe geçmiş demektir

        /*ornek 1:
        Kisi erkek ise;
          i)16 yasindan kucuk ise calismamali
          ii)16 - 65(dahil) arasi calismali
          iii)65 yasindan buyuk ise emekli olmali
        Kisi kadin ise;
         i)18 yasindan kucuk ise calismamali
         ii)18 - 60 (dahil) arasi calismali
         iii)60 yasindan buyuk ise emekli olmali
        Kisinin cinsiyetine ve yasina bakarak uygun mesaji console'a yaziniz*/

        /*Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz");
        String gender = input.next();
        System.out.println("Lütfen yaşınızı girin");
        int age = input.nextInt();

        if (gender.equalsIgnoreCase("Erkek")) {
            if (age<18){
                System.out.println("Çalışmamalı");
            } else if (age<66) {
                System.out.println("Çalışmalı");

            }else {
                System.out.println("Emekli olmalı");
            }

        } else if (gender.equalsIgnoreCase("Kadın")) {
            if (age<16){
                System.out.println("Çalışmamalı");
            } else if (age<61) {
                System.out.println("Çalışmalı");

            }else {
                System.out.println("Emekli olmalı");
            }

            //-----------------------------------------------

            /*Ornek 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
            Sunday==>1  . . .  Saturday==>7

            1.Yol : if - else if*/

            /*Scanner input = new Scanner(System.in);
            System.out.println("Lütfen günü yazınız");
            String günİsmi = input.next();

            if (günİsmi.equalsIgnoreCase("Pazar")) {
                System.out.println(1);
            } else if (günİsmi.equalsIgnoreCase("Pazartesi")) {
                System.out.println(2);
            } else if (günİsmi.equalsIgnoreCase("salı")) {
                System.out.println(3);
            } else if (günİsmi.equalsIgnoreCase("çarşamba")) {
                System.out.println(4);
            } else if (günİsmi.equalsIgnoreCase("perşembe")) {
                System.out.println(5);
            } else if (günİsmi.equalsIgnoreCase("cuma")) {
                System.out.println(6);
            } else if (günİsmi.equalsIgnoreCase("cumartesi")) {
                System.out.println(7);

            } else {
                System.out.println("lütfen geçerli bir değer girini");

            }


            switch (günİsmi) {
                case "Pazar":
                    System.out.println(1);
                    break;
                case "Pazartesi":
                    System.out.println(2);
                    break;
                case "Salı":
                    System.out.println(3);
                    break;
                case "Çarşamba":
                    System.out.println(4);
                    break;
                case "Perşembe":
                    System.out.println(5);
                    break;
                case"cuma":
                    System.out.println(6);
                    break;
                case "Cumartesi":
                    break;
                default:
                    System.out.println("Geçerli bir gün giriniz");

                 //------------------------------------------------------------------------------
                    /*Ornek 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip
                     12.aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.
                    8 ==> Agustos - Eylul - Ekim - Kasim - Aralik
                      */

        /* Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı ay olduğunu giriniz");

        Byte month = input.nextByte();

        switch (month) {
            case 1:
                System.out.println("Ocak");
            case 2:
                System.out.println("Şubat");
            case 3:
                System.out.println("Mart");
            case 4:
                System.out.println("Nisan");
            case 5:
                System.out.println("Mayıs");
            case 6:
                System.out.println("Haziran");
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Ağustos");
            case 9:
                System.out.println("Eylül");
            case 10:
                System.out.println("Ekim");
            case 11:
                System.out.println("Kasım");
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Lütfen geçerli bir değer giriniz");




        }

        //---------------------------------------------------

        /*Ornek 1:  Kullanıcıdan bir ay numarası girmesini isteyin (1 ile 12 arasında).
         Girilen ay numarasına göre mevsimi belirleyen ve sonucu konsola yazdıran bir program yazınız.*/


        Scanner input = new Scanner(System.in);
        System.out.println("Ay numarasını giriniz");

        byte month = input.nextByte();

        // 12-2 (kış) 3-5 (ilkbahar) 6-8 (yaz) 9-11(sonbahar)

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Aralık Ocak Şubat kış aylarıdır");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Mart nisan Mayıs İlkbahar aylarıdır");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Haziran Temmuz Ağustos sonbahar");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Kasım ");
                break;

            default:
                System.out.println("Lütfen geçerli bir değer giriniz");


                //2.yol ---------------------------------------------------------- */



        /* Scanner input = new Scanner(System.in);
        System.out.println("Ay numarasını giriniz");

        short month = input.nextByte();
        
        if (month<0) {
            System.out.println("Sıfırdan küçük ay olamaz");
            
        } else if (month<3) {
            System.out.println("Aralık Ocak Şubat Kış aylarıdı");
        } else if (month<6) {
            System.out.println("Mart Nisan Mayıs İlkbahar aylarıdır");
        } else if (month<9) {
            System.out.println("Haziran Temmuz Ağustos Yaz aylarıdır");
        } else if (month<12) {
            System.out.println("Eylül Ekim Kasım sonbahar aylarıdır");
        } else {
            System.out.println("Geçerli bir değer giriniz"); */

        }
    }
    }

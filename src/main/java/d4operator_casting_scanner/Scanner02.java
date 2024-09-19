package d4operator_casting_scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        /*Ornek 1:
        Kullanıcıdan;
        i)Adini ve Soyadini
        ii)Yaşını
        iii)Boyunu
        iv)Kilosunu
        v)Medeni durumunu girmesini isteyin.

        Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın

        Example 1:
        From the user;
        i) Name and Surname ii) Age
        iii)Height
        iv) Weight
        v) Ask him to enter his marital status.

        Then print them on separate lines in the console with a label*/

        Scanner input =new Scanner(System.in);
        System.out.println("Adınızı ve Soyadınız Giriniz");
        //nextLine() methodu ile birden fazla kelime girisi alabilirsiniz
        String fullName = input.nextLine();

        System.out.println("Yaşınızı Giriniz");
        byte age = input.nextByte();

        System.out.println("Boyunuzu Giriniz");
        float height = input.nextFloat();

        System.out.println("Kilonuzu Giriniz");
        short weight = input.nextShort();

        System.out.println("Medeni Durumunuz Nedir");
        //next() methodu ile tek kelimeli String girisi alabilirsiniz
        String maritalStatus = input.next();

        //Kullanici girdilerini konsola yazdiralim

        System.out.println("İsim Soyisim = " + fullName);
        System.out.println("Yaş = " + age);
        System.out.println("Boy = " + height);
        System.out.println("Kilo = " + weight);
        System.out.println("Medeni Durum = " + maritalStatus);






    }
}

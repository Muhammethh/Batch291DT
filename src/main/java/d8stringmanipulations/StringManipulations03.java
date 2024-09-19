package d8stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {
        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        /*Example 1: Check the password entered by the user according to the following rules.

        i) At least 8 characters
        ii)Space character should not be in password
        iii) At least one capital letter
        iv) At least one lowercase letter
        v)At least one number */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String pwd = input.nextLine();

        //En az 8 karakter olmalı

        boolean lengthControl = pwd.length() > 7;
        //System.out.println("lengthControl = " + lengthControl);

        // ii)Space karakteri password'de olmasin

        //1. yol
        // boolean spaceControl = pwd.replaceAll("[^ ]", "").length()==0;
        //2.yol
        //boolean spaceControl = pwd.replaceAll("[^ ]", "").isEmpty();
        //3.yol
        boolean spaceControl = !pwd.contains(" ");
        //System.out.println("spaceControl = " + spaceControl);

        //iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        //System.out.println("upperCaseControl = " + upperCaseControl);

        //iv)En az bir tane kucuk harf olsun

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);

        //v)En az bir tane rakam olsun 

        Boolean numberControl = pwd.replaceAll("[^0-9]", "").length() > 0;
        //System.out.println("numberControl = " + numberControl);


        if (!numberControl) {
            System.out.println("Şifre en az bir rakam içermelidir");
        }

        boolean symbolControl = pwd.replaceAll("[^\\p{Punct}]", "").length() > 0;
        System.out.println("symbolControl = " + symbolControl);

        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && numberControl;

        if (isValid) {
            System.out.println("Şifre geçerlidir");

        } else {
            System.out.println("Şifre geçersizdir");
        }

    }
}

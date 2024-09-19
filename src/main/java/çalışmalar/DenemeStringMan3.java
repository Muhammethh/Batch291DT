package çalışmalar;

import java.util.Scanner;

public class DenemeStringMan3 {

    public static void main(String[] args) {

         /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi girin");

        String pwd = input.nextLine();

        boolean lengthControl = pwd.length() > 7;

        boolean spaceControl = !pwd.contains(" ");

        if (!spaceControl) {
            System.out.println("Şifre boşluk içermemeli");
        }

        boolean upperCase = pwd.replaceAll("[^A-Z]", "").length() > 0;

        if (!upperCase) {

            System.out.println("Şifre en az bir büyük harf içermeli");
        }

        boolean lowerCase = pwd.replaceAll("[^a-z]", "").length() > 0;

        if (!lowerCase) {
            System.out.println("şifre en az bir küçük harf içermelidir");
        }

        boolean numControl = pwd.replaceAll("[^0-9]", "").length() > 0;

        if (!numControl) {
            System.out.println("Şifre en az bir rakam içermelidir");
        }

        boolean symbolControl = pwd.replaceAll("[^\\p{Punct}]", "").length() > 0;

        if (!symbolControl) {
            System.out.println("Şifre noktalama işareti içermelidir");
        }

        if (lengthControl && spaceControl && upperCase && lowerCase && numControl && symbolControl) {
            System.out.println("şifre başarılı");
        }

        if (!lengthControl) {
            System.out.println("Şifre en az 7 karakter olamalıdır");
        } else if (!spaceControl) {
            System.out.println("Şifre boşluk içermemeli");
        }


    }
}

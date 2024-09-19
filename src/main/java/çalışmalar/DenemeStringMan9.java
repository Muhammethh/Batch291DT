package çalışmalar;

public class DenemeStringMan9 {
    public static void main(String[] args) {

        //Ornek 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini ‘*’ kullanarak görünmez yapın
        //      1234 6789 1234 6789 ==> **** **** **** 6789

        String num = "1234 5678 9000 0000";

        String num2 =num.substring(0,15).replaceAll("[0-9]","*");
        String num3 = num.substring(15);

        System.out.println(num2+num3);

        /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

        1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        3- Başında ve sonunda boşluk olmamalıdır.*/

        //Not: isEmpty() metodu sadece hicligi kontrol eder (true verir).
        //isBlank() metodu ise hem hicligi hem de space’i kontrol eder(true verir)

        String pwd = " ";

        boolean isblank = pwd.isEmpty();
        boolean isSpace = pwd.isBlank();
        boolean space = pwd.trim().equals(pwd);

        System.out.println(isblank);
        System.out.println(isSpace);
        System.out.println(space);

        if (isblank) {
            System.out.println("parola hiçbişey girmeden geçilemez");
        }
        if (isSpace){
            System.out.println("parola boşluk içermemeli");
        }
        if (!space) {
            System.out.println("parola başında ve sonunda boşluk içermemeli");
        }



    }
}

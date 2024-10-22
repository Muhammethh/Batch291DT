package d25collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.
        //Interview Question
        //Example 1 : Store student email addresses in natural order.

       // email adresleri unique olduğu için set kullanacağımızı anlarız, natural order dediği için de treeset

        long t1 = System.nanoTime();

        //-------------1.yol: Yavas - Her adimda siralama yapar
        TreeSet<String> emails = new TreeSet<>();

        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails); //alfabetik sıralama, natıral order


        //TreeSet'ler cok yavas, biraz hizlandirabilir miyiz?
        //Elemanlari eklerken en hizli olandan (HashSet) yardim alalim.

        long t2 = System.nanoTime();
        //----------2.Yol Daha hızlı - tavsiye edilir
        HashSet<String> emailsHs =new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("u@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("x@gmail.com");
        System.out.println(emailsHs); //karışık sıralama

        //Boş bir TreeSet oluşturalım ve constructerına HashSeti yazalım

        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs); //sıralamamız şimdi natural order yani alfabetik olmuş oldu.
        //Yani eklemeyi hızlı olanla yapıp düzenlemeyi yavaş olanla yapıp yazdırdık.
        long t3 = System.nanoTime();

        System.out.println(t2 - t1); //TreeSet
        System.out.println(t3 - t2); //HashSet


    }
}

package çalışmalar;

public class Denemeler4 {
    public static void main(String[] args) {

        //-4 ==> -1*-4, 4 ==> 4, 0 ==> 0

        //Bir gerçek sayının sayı doğrusundaki yerinin başlangıç noktasına (sıfıra) olan uzaklığına
        // o sayının mutlak değeri denir. Sifirin mutlak degeri de sifirdir.

        // (condition) ? (true) : (false)   ----- kalıbı bu

        /* int a = -7;

        int result = a < 0 ? -1 * a : a;
        System.out.println(a);

        //Ornek 2: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        // “Farkli isaretli sayilari carpamiyorum” mesaji veren kodu yaziniz.

        int b = -5;
        int c = -3;

       Object result2 = (b>0) && (c>0) || (b<0) && (c<0)? b*c : "Farklı işaretli sayıları çarpamıyorum";
        System.out.println(result2);


        /*Ornek 1:  Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz.
        Example 1: Write the code to check if the given year is a "Leap Year".

        1) Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil */

        // (c) ? (  (c) ? (t) : (f)  ) : (   (c) ? (t) : (f)   )

        /* int year =2004;

        Object sonuc = (year%100==0) ? ((year%400==0) ? ("leap year"): ("leap year değil")): ((year%4==0) ? ("Leap year") :("leap year değil") );
        System.out.println(sonuc);


        //----------------------------------------  */

        //iki sayı arasından büyük olanı bulma

        int a = 20;
        int b = 15;

        int big = a>b ? a : b;
        System.out.println(big);


        int z = -500;

        String result = (z > 99 && z < 1000)  ? "Uc basamaklidir" : "Uc basamakli degildir";
        System.out.println(result);






    }
}

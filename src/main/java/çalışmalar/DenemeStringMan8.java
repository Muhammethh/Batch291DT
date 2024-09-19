package çalışmalar;

public class DenemeStringMan8 {

    public static void main(String[] args) {

        //Ornek 1: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        //Example 1: Starting from a specific character of a String up to a specific character
        // take all characters as dynamic.

        //1.yol: Hard coding, tavsiye edilmez

        String a = "ab.c@gmail.com";

        String mail = a.split("@")[1].split("\\.")[0];
        System.out.println(mail);

        int start = a.indexOf("@");
        int end =a.lastIndexOf(".");
        System.out.println(a.substring(start+1,end));

        //Ornek 1: Bir String’deki tekrarsiz character’leri ekrana yan yana yazdiriniz.
        // yusuf ==> ysf

        String isim = "yusuf";

        for (int i = 0; i < isim.length() ; i++) {


            char karakter = isim.charAt(i);
            boolean tekrarsız = true;

            for (int j = 0; j < isim.length(); j++) {

                if (i != j && karakter == isim.charAt(j)) {
                    tekrarsız =false;
                    break;
                }
            }
            if (tekrarsız) {
                System.out.print(karakter);
            }

            System.out.println();


        }





    }
}

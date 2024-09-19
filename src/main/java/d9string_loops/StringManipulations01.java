package d9string_loops;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Ornek 1: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        //Example 1: Starting from a specific character of a String up to a specific character
        // take all characters as dynamic.

        //1.yol: Hard coding, tavsiye edilmez

        String a = "abc@gmail.com";
        System.out.println(a.substring(4, 9));

        //2. yol: dinamik

        String company1 = a.split("@")[1].split("\\.")[0];
        System.out.println(company1);


        //3.yol: Dinamik
        //indexOf() method'u spesifik bir karakterin ilk gorunumunun index'ini verir
        //Bu method olmayan karakterler icin -1 verir

        int startingINdex = a.indexOf("@"); // @ den sonrasına da +1 yazılabilir
        int endingIndex = a.indexOf(".");  //lastindexof olursa ab.c@gmail.com olsa da hata vermiyor

        String companyName = a.substring(startingINdex+1, endingIndex);
        System.out.println(companyName);

    }
}

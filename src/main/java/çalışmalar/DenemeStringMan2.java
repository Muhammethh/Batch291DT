package çalışmalar;

public class DenemeStringMan2 {

    public static void main(String[] args) {

        //Ornek 1: “s” String’indeki “money” kelimesini “dollar” kelimesine ceviriniz.
        //Example 1: Convert the word “money” in String “s” to “dollar”.

        //replace() methodu, 2.parametredekini 1.nin yerine koyar.
        //Kucuk buyuk harfe duyarlidir

        String s = "Learn Java earn 12345 money";

        String s1 = s.replaceAll("money","dollar");
        System.out.println(s1);

        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz.
        //Example 2: Delete all "e" letters in the string "s".


        String s2 = s.replaceAll("e","");
        System.out.println(s2);

        String s3 = s.replaceAll("[0-9]","*");
        System.out.println(s3);

        int s4 = s.replaceAll("[^0-9]","").length();
        System.out.println(s4);






    }
}

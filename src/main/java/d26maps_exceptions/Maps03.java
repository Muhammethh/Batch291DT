package d26maps_exceptions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Maps03 {

    public static void main(String[] args) {

        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)
        //example 1: Given a String, count the number of times each word is used in that String
        // write the code that displays.(Case insensitive)

        String s = "Ali nasilsin Ali.";

        s = s.replaceAll("[\\p{Punct}]", "").toLowerCase();

        String[] list = s.split(" ");
        System.out.println(Arrays.toString(list));

        HashMap<String, Integer> myMap = new HashMap<>();

        for (String w : list) {

            Integer isThere = myMap.get(w); //ilk döngüde w'nun içinde ali var, mapda ali olmadığından null gelecek

            if (isThere == null) {
                myMap.put(w, 1);
            } else {
                myMap.put(w,isThere+1); //map'te varsa 1 arttır
            }

        }
        System.out.println(myMap); //{nasilsin=1, ali=2}

        //ODEV: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //example 2: Write the code that shows how many times each letter in a given String is used in that String.
        //           "Hello" ==> H=1, e=1, l=2, o=1

        String s2 = "Hello";

       String[] s3 =  s2.split("");


        HashMap<String,Integer> s3Map = new HashMap<>();

        for (String w: s3){

            Integer contains = s3Map.get(w);

            if (contains == null){
                s3Map.put(w,1);

            }else {
                s3Map.put(w,contains +1);
            }

        }
        System.out.println(s3Map); // {e=1, H=1, l=2, o=1}

    }
}

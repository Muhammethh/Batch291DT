package d31lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Lambda05 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("AliX");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        removeIfLengthGreaterThanFive(myList);
        //removeIfElementsStartsWithZorEndsWithf(myList); //[Ali, Mustafa]
        //removeIfElementsContainsX(myList); //[Elif, Yusuf, Elif, Zeynep, Mustafa]
    }

    //1) Karakter sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    //1) Create a method that deletes elements with more than 5 characters.


    public static void removeIfLengthGreaterThanFive(List<String> myList) {

        //removeIf() metodu, koleksiyonlardaki (özellikle List, Set gibi) elemanları belirli bir koşula göre
        // kaldırmak için kullanılır.removeIf metodu Collection arayüzünde tanımlıdır,
        // stream kullanilmadan cagirilir

        myList.removeIf(t -> t.length() > 5);
        System.out.println(myList);


    }


    //2) ‘Z’ ile başlayan yada ‘f’ ile biten elemanları silen bir method oluşturun.
    //2) Create a method that deletes elements that start with ‘Z’ or end with ‘f’.


    //-----1.Yol
    public static void removeIfElementsStartsWithZorEndsWithf(List<String> myList) {


        myList.removeIf(t -> t.charAt(0) == 'z' || t.charAt(t.length() - 1) == 'f');
        System.out.println(myList); //[Ali, Mustafa]




    }

    //-----2.Yol
    public static void removeIfElementsStartsWithZorEndsWithf2(List<String> myList){

        myList.removeIf(t -> t.startsWith("Z") || t.endsWith("f"));
        System.out.println(myList);
    }



    //3 ) “X” karakteri iceren elemanları silen bir method oluşturun.
    //3 ) Create a method that deletes elements containing the “X” character.

    public static void removeIfElementsContainsX(List<String> myList){

        myList.removeIf(t->t.contains("X"));
        System.out.print(myList); //[Elif, Yusuf, Elif, Zeynep, Mustafa]

    }


}

package d14multidimensionalarrays_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList03 {
    public static void main(String[] args) {

        //Ornek 1: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
        //Example 1: From a list with repeated elements, obtain a list with non-repeated elements.
        //           [J, a, v, a, v] ==> [J, a, v]

        //Bir interface, bir class’a nasıl davranması gerektiğini tanımlayan bir sözleşmedir.
        // Bir class, bir interface’i implement ettiğinde, interface’deki tüm yöntemleri implement etmelidir.

        //List'i kullanmak, kodunuzun daha esnek ve uyumlu olmasını sağlar.
        //List tipinde bir değişken tanımladığınızda, bu değişkenin farklı List implementasyonlarını
        // (örneğin ArrayList, LinkedList, Vector vb.) tutabilmesi mümkündür.

        ArrayList<String> arr = new ArrayList<>();

        arr.add("j"); //0
        arr.add("a"); //1
        arr.add("v"); //2
        arr.add("a"); //3
        arr.add("v"); //4

        System.out.println(arr);

        ArrayList<String> newarr = new ArrayList<>();

        for (String w : arr) {

            if (!newarr.contains(w)) {

                newarr.add(w);

            }


        }
        System.out.println(newarr);

    }
}
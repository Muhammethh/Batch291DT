package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {

    public static void main(String[] args) {

        //Ornek 1: Bir tane Integer List olusturunuz.Bu List’te birbirine en yakin iki tamsayiyi yaziniz.
        // Example 1: Create an Integer List.Write the two closest integers in this List.
        //      [12, 23, 10, 19] ==> 12 ve 10


        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        nums.add(8);
        nums.add(5);
        nums.add(9);




       //Collections.sort(nums);  /- bu diğer koleksiyonlarla da kullanılır
        nums.sort(null); //arraylistin içinde sıralama yapıyor

        System.out.println(nums);  //[10, 12, 19, 23]

        int minDiff = nums.get(1)-nums.get(0);  //12-10 = 2


        for (int i = 1; i < nums.size() ; i++) {

            minDiff = Math.min(minDiff, nums.get(i)-nums.get(i-1));

        }


        System.out.println(minDiff); //2, minimum farkı bulduk bu farkı hangi iki sayıdan elde ettiğimizi bulalım

        //--------------------

        for (int i = 1; i < nums.size() ; i++) {


            if (nums.get(i)-nums.get(i-1)==minDiff){

                System.out.println(nums.get(i) + " ve " + nums.get(i-1));

            }
        }



        // ODEV Bu soru tek for'la veya for eachle cozulebilir miydi?






    }
}

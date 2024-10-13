package d13array;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //INTERVIEW SORUSU
        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz(Interview Sorusu)
        //Example 4: In the array [0, 2, 3, 0, 12, 0], place all zeroes at the end.
        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]
        
        int[] arr = {0, 2, 3, 0, 12, 0};

        int[] newarr = new int[arr.length];

        System.out.println(Arrays.toString(arr)); //[0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(newarr)); //[0, 0, 0, 0, 0, 0]

        int firstIndex = 0; //indekslere yükleme yaptıkça bunu arttıracağız

        for (int w : arr) {

            if (w != 0) {

                newarr[firstIndex] = w; //boş arrayin ilk indexine sıfır olmayan sayıyı yükledik

                firstIndex++;//ilk index'e yukleme yapildigi icin, bir sonraki sifir harici sayi ilk index'e
                                //yuklenmesin diye 1 artirdik
            }

        }
        System.out.println(Arrays.toString(newarr)); //[2, 3, 12, 0, 0, 0]

    }
}

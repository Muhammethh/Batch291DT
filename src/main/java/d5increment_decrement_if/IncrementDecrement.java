package d5increment_decrement_if;

public class IncrementDecrement {

    public static void main(String[] args) {

        //---------------Increment

        int a = 5;

        a = a + 2; // a iki defa yazılmış. Tekrardan kurtulabiliriz
        System.out.println(a); //7

        a += 2; // a= a + 2; nin aynısıdır
        System.out.println(a);

        //--------Decrement

        int c = 10;
        c = c - 3;
        System.out.println(c);

        //yada

        c -= 4;  //c = c - 4; ün aynısıdır
        System.out.println(c);


        //-----------------Çarpma

        int d = 6;
        d = d * 2;
        System.out.println(d);

        //Yada

        d *= 2;
        System.out.println(d);

        //----------------Bölme

        int e = 24;
        e = e / 2;
        System.out.println(e);

        //Yada

        e /= 2;
        System.out.println(e);

        //------------ 1 ile increment

        int f = 13;

        f = f + 1;

        //yada

        f += 1;

        //yada

        f++;
        System.out.println(f); //16

        //------------ 1 ile decrement

        int h = 15;

        h = h-1;

        //yada

        h-=1;

        //yada

        h--;

        System.out.println(h); //12

       // -------------- Post Incerement (i++), Pre Increment (++i)

        int i = 10;

        int k = i++;

        System.out.println(k); //10
        System.out.println(i); //11

        int m = 15;
        int n = ++m;

        System.out.println(n); //16
        System.out.println(m); //16

        int p = 17;
        int r = p--;

        System.out.println(r); //17
        System.out.println(p); //16

        int s = 20;
        int t = --s;

        System.out.println(s); //19
        System.out.println(t); //19




    }
}

package d28exception_enum;

public class E11 {
    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        int[] c = {3, 5, 7, 9};
        bring(c,a,b);
    }

    public static void bring(int[] c, int a,int b){

        try {
            int idx = a/b;
            int element = c[idx];
            System.out.println(element);
        }finally {
            System.out.println("Datebase bağlantısı kesilmelidir");
        }

        System.out.println("Finally sonrası app çalışıyor");

    }

}

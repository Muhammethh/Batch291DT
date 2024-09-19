package çalışmalar;

public class DenemeForLoops01 {

    public static void main(String[] args) {

        //ornek 1: Console'a 4 kere 'Hi!' yazdirin

        for (int i = 0; i < 4; i++) {
            System.out.println("Hi");
        }

        //Ornek 2: 20(dahil) den 3(dahil) e kadar tum tamsayilari console’a yazdiriniz.

        for (int i = 20; i > 2 ; i--) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
        //Ornek 3: 3'den 20'ye kadar tum cift sayilari console’a yazdiriniz(20 dahil)

        for (int i = 3; i <21 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }

        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
                ==> "Tramvay"==> "Tr"*/
        /*Example 1: Write all characters before the first letter 'a' in a given String to the console*/

        //charAt() methoduna index verince size karakteri getirir.
        //break keyword’u, bir döngüyü veya bir switch ifadesini erken bir şekilde sonlandırmak için kullanılır.


        String word = "Muhammet";

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i)=='a') {
                break;
            }
            System.out.print(word.charAt(i));
        }

    }
}

package çalışmalar;

import java.util.Scanner;

public class DenemeStringMan5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir cümle yazınız");
        //String line = input.nextLine();

        //String reversed = new StringBuilder(line).reverse().toString();
        //System.out.println(reversed);

        //String[] lenght = line.trim().split("\\s+");
        //System.out.println(lenght.length);

        //char karakter = input.next().charAt(0);
        //String lenght = line.toUpperCase();
        // System.out.println(lenght);

        String cumle = input.nextLine();
        // String karakter = input.next();

        int boslukSayisi = 0;
        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i) == ' ') {
                boslukSayisi++;
            }
        }

        System.out.println("Boşluk sayısı: " + boslukSayisi);
    }
}

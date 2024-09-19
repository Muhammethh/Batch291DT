package çalışmalar;

import java.util.Scanner;

public class denemeler3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long bakiye = 1000;

        System.out.println("Yapmak istediginiz islemi secin: 1-Hesap Görüntüle, 2-Para Yatir, 3-Para Cek  ");
        byte islem = input.nextByte();

        if (islem == 1) {
            System.out.println("Hesap bakiyeniz: " + bakiye);
        } else if (islem == 2) {
            System.out.println("Ne kadar para yatırmak istiyorsunuz?: ");
            long ekle = input.nextLong();
            System.out.println("Yeni bakiyeniz: " + (ekle + bakiye));
        } else if (islem == 3) {
            System.out.println("Ne kadar para cekmek istiyorsunuz?: ");
            long cek = input.nextLong();
            if (cek > bakiye) {
                System.out.println("Yeterli bakiye mevcut değil!");
            } else {
                System.out.println("Yeni bakiyeniz: " + (bakiye - cek));
            }
        } else {
            System.out.println("Gecerli bir secim yapiniz!");

        }
    }
}

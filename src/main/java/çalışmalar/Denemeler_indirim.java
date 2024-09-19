package çalışmalar;

import java.util.Scanner;

public class Denemeler_indirim {

    public static void main(String[] args) {

        System.out.println("Yapılan Alışveriş Tutarını Giriniz");
        Scanner input = new Scanner(System.in);
        double cost = input.nextDouble();
        double percent5 = cost - (cost * 0.05);
        double percent10 = cost - (cost * 0.10);
        double percent15 = cost - (cost * 0.15);

        if (cost < 0) {
            System.out.println("Tutar sıfırdan küçük olamaz");

        } else if (cost < 100) {
            System.out.println("İndirim kazanamadınız. Ödenecek Tutar:"+ cost);
        }else if (cost < 201) {
            System.out.println("%5 İndirim tutarı kazandınız, öedeyeceğiniz tutar;" + percent5);
        } else if (cost < 501) {
            System.out.println("%10 İndirim kazandınız, ödeyeceğiniz tutar;" + percent10);
        }
        else {
            System.out.println("%15 indirim kazandınız,ödeyeceğiniz tutar;" + percent15);
        }


    }
}

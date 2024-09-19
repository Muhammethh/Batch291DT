package çalışmalar;

public class DenemeStringMan9 {
    public static void main(String[] args) {

        //Ornek 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini ‘*’ kullanarak görünmez yapın
        //      1234 6789 1234 6789 ==> **** **** **** 6789

        String num = "1234 5678 9000 0000";

        String num2 =num.substring(0,15).replaceAll("[0-9]","*");
        String num3 = num.substring(15);

        System.out.println(num2+num3);

    }
}

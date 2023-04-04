import java.util.Scanner;
public class sinifi_gecme_durumu {
    public static void main(String[] args) {
        int mat, fiz, tur, kim, muz, say = 5;
        double orta;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fiz = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        tur = input.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kim = input.nextInt();
        System.out.print("Muzik notunuzu giriniz:");
        muz = input.nextInt();

        orta = (mat + fiz + tur + kim + muz) / say;
        System.out.println("ortalamaniz:" + orta);

        if (orta <= 100 && orta >= 0) {
            if (orta < 55) {
                System.out.println("Geçemediniz");
            }
            else {
                System.out.println("Geçtiniz");


            }
        }

        else {
            System.out.print("Hatalı giriş! Not ortalaması 0'dan büyük ve 100'den küçük olmalı");
        }



    }
}

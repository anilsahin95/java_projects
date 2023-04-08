import java.util.Scanner;
public class min_max_sayi {
    public static void main(String[] args) {
        int kacsayi,kucuksayi,buyuksayi,sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz ?");
        kacsayi= input.nextInt();

        System.out.println("1. sayıyı giriniz");
        sayi= input.nextInt();
        kucuksayi=sayi;
        buyuksayi=sayi;

        for (int i =1 ;i < kacsayi ;i++ ){
            System.out.println(i+1 + ". sayıyı giriniz");
            sayi= input.nextInt();

            if(sayi < kucuksayi){
                kucuksayi=sayi;
            }else if (sayi > buyuksayi){
                buyuksayi=sayi;
            }

        }
        System.out.println("En büyük sayı : "+ buyuksayi);
        System.out.println("En küçük sayı : " + kucuksayi);

    }
}

import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        int sonuc=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=inp.nextInt();

        for(int i=1;i<sayi;i++){
            if(sayi%i==0) {
                sonuc+=i;
            }
        }
        if(sonuc==sayi){
            System.out.println("Mükemmel sayıdır.");
        }
        else System.out.println("Mükemmel sayı değildir.");

    }
}

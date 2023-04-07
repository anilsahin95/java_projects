import java.util.Scanner;
public class basamak_sayilari_toplami {
    public static void main(String[] args) {
        int a, sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("sayı girin :");
        a = input.nextInt();
        int temp,sayi;
        temp = a;
        while (temp != 0 ){
            sayi = temp%10;
            sum += sayi;
            temp/=10;

        }

        System.out.println(sum);
    }
}

import java.util.Scanner;
import java.util.Arrays;
public class ClosestSmallBig {
    public static void main(String[] args) {
        int[] numbers = {15,12,788,1,-1,-778,2,0};
        int closestSmall = 0;
        int closestBig = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("sayi girin");
        int sayi = input.nextInt();
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++) {
            if (sayi < numbers[i]) {
                closestBig = numbers[i];
                closestSmall = numbers[i - 1];
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + closestSmall);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + closestBig);
        


    }
}

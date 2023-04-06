import java.util.Scanner;
public class FaktorielAndCombination {
    public static void main(String[] args) {
        int a, sum=1 , count=1, b;
        double sonuc;
        Scanner input = new Scanner(System.in);
        System.out.println("kaçın kombinasyonu :");
        a = input.nextInt();

        System.out.println("kaça kombinasyonu :");
        Scanner inpu = new Scanner(System.in);
        b = inpu.nextInt();

        for (int i = a; i>1 ; i--)
        {
            sum *= i;
        }


        for (int j = b; j>1 ; j--){
            count *= j;
        }
        int c = a - b;
        int fak = 1;
        for (int k = c; k>1 ; k--){
            fak *= k;
        }



        sonuc = sum / (count * fak);

        System.out.println("konbinasyon sonucu : " + sonuc);
    }
}

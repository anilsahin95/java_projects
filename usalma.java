import java.util.Scanner;
public class usalma {
    public static void main(String[] args) {
        int a, sum=1 ,b;
        Scanner input = new Scanner(System.in);
        System.out.println("üssü alınıcak sayı :");
        a = input.nextInt();

        System.out.println("üs bilgisi girin :");
        b = input.nextInt();

        for (int i = b; i>=1 ; i--)
        {
            sum *= a;
        }

        System.out.println(sum);
    }
}

import java.util.Scanner;
public class harmonicnumber {
    public static void main(String[] args) {
        int a;
        double sum = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("n sayısı girin :");
        a = input.nextInt();

        for (double i = 1; i <= a; i++){
            sum += 1.0/i;
        }


        System.out.println(sum);
    }
}

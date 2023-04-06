import java.util.Scanner;
public class girilensayidankucuk_4_ve_5in_katlari {
    public static void main(String[] args) {
        int a, sum=0 , count=0;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz :");
        a = input.nextInt();

        for (int i = 1; i<=a; i*=5)
        {
            System.out.println("besin kuvettleri : " + i);
        }


        for (int k = 1; k<=a; k*=4){
            System.out.println("dordun kuvettleri : " + k);
        }


    }
}

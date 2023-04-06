import java.util.Scanner;
public class teksayitoplam {
    public static void main(String[] args) {
        int a, sum=0 , count=0;
        double average;
        Scanner input = new Scanner(System.in);


        do {

            System.out.println("Sayınızı giriniz :");
            a = input.nextInt();
            if ((a%2==0)&&(a%4==0)){
                sum += a;
            }



        }
        while (a%2==0);
        System.out.println("ortalama  " + sum);

    }
}

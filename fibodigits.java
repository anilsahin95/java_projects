import java.util.Scanner;
public class fibodigits {
    public static void main(String[] args) {


        int a, b=0, c=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        a = input.nextInt();
        System.out.print(a + " Elemanlı Fibonacci Serisi: ");
        for (int i=1; i<=a; i++){
            System.out.print(b + " ");
            int sum;
            sum=b+c;
            b=c;
            c=sum;
        }
        }

    }

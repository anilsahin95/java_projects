import java.util.Scanner;
public class uceVedordeBolunenSayilar {
    public static void main(String[] args) {
        int a, sum=0 , count=0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayınızı giriniz :");
        a= input.nextInt();

        for (int i = 0 ; i <= a ;i++){
            if ((i%3 == 0)&& (i%4 == 0)){
                sum += i;
                count++;

            }

        }
        average = sum /count;

        System.out.println("Ortalama :" + average);




    }
}

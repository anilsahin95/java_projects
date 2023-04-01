import java.util.Scanner;
public class ScoreAverage {
    public static void main(String[] args) {

        int math, hist, turkish, phys, che, music;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter math score: ");
        math = input.nextInt();

        System.out.print("Enter hist score: ");
        hist = input.nextInt();

        System.out.print("Enter turkish score: ");
        turkish = input.nextInt();

        System.out.print("Enter phys score: ");
        phys = input.nextInt();

        System.out.print("Enter che score: ");
        che = input.nextInt();

        System.out.print("Enter math music: ");
        music = input.nextInt();

        int sum = (math + hist + turkish + phys + che + music);
        double average = sum/6.0;

        System.out.println("your average :" + average);
        System.out.println(average >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");

    }
}

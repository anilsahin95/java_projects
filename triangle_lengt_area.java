import java.util.Scanner;
public class triangle_lengt_area {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int a, b, c;
        double u;
        System.out.print("enter first lengt: ");
        a = input.nextInt();

        System.out.print("enter second lengt: ");
        b = input.nextInt();

        System.out.print("enter third lengt: ");
        c = input.nextInt();

        u = (a + b + c)/2;

        System.out.print("length of triangle:"+ 2*u);
        System.out.print("\narea of triangle:"+ u * (u - a)* (u - b) * (u - c));


    }
}

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number : ");
        n1 = input.nextInt();

        System.out.print("enter second number : ");
        n2 = input.nextInt();

        System.out.print("1- addition\n2-suntraction\n3-multiplication\n4-division\n : ");
        System.out.print("your selection : ");
        select = input.nextInt();

        switch (select) {

            case 1:
                System.out.print("solution of addition :"+(n1+n2));
            break;
            case 2:
                System.out.print("solution of suntraction:"+(n1-n2));
            break;
            case 3:
                System.out.print("solution of multiplication:"+(n1*n2));
            break;
            case 4:
                System.out.print("solution of division:"+(n1/n2));
            break;
            default:
                System.out.print("wrong selection");

        }

    }
}

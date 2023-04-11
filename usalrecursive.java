import java.util.Scanner;




public class usalrecursive {

    static int usal(int c, int d){
        if (d == 0)
            return 1;

        return c * usal(c,(d-1));

    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("taban sayıyı girin :");
        int a = scan.nextInt();
        System.out.println("üs sayıyı girin :");
        int b = scan.nextInt();

        System.out.println("islem sonucu : " + usal(a,b));


        }

    }

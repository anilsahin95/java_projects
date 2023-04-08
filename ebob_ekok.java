import java.util.Scanner;
public class ebob_ekok {
    public static void main(String[] args) {
        int n1, n2;
        int ebob = 1, ekok = 1;
        int kat = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();
        kat = n1;

        while (0 <= kat) {
            kat--;
            if (n1%kat == 0 && n2%kat == 0) {
                ebob = kat;
                break;
            }
        }
        System.out.println("sayıların ebob'u: " + ebob);
        ekok = (n1 * n2) / ebob;
        System.out.println("sayıların ekok'u: " + ekok);
    }
}

import java.util.Scanner;
public class vucut_kilo_endex {
    public static void main(String[] args) {


        Scanner inp= new Scanner(System.in);
        double boy, kilo, endex;

        System.out.print("boyunuzu girin :");
        boy= inp.nextDouble();

        System.out.print("kilonuzu girin :");
        kilo= inp.nextDouble();

        endex = kilo / boy * boy;
        System.out.print("vucut kitle endexiniz : " +endex);











    }
}

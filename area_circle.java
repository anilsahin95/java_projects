import java.util.Scanner;
public class area_circle {
    public static void main(String[] args) {


        Scanner inp= new Scanner(System.in);
        double r,merkezAcisi,alan, pi = 1.14;

        System.out.print("yarciap degerini giriniz :");
        r= inp.nextDouble();

        System.out.print("merkez aci degerini giriniz :");
        merkezAcisi= inp.nextDouble();

        alan = pi * r * r * merkezAcisi / 360;
        System.out.print("Daire diliminin alani : " +alan);











    }
}

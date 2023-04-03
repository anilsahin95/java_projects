import java.util.Scanner;
public class manav_kasa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double armut,elma,domates,muz,patlican,toplam;

        System.out.print("Armut kaç kilo: ");
        armut=input.nextDouble();
        System.out.print(" Elma kac kilo: ");
        elma=input.nextDouble();
        System.out.print(" Domates kac kilo: ");
        domates=input.nextDouble();
        System.out.print(" Muz kac kilo: ");
        muz=input.nextDouble();
        System.out.print(" Patlican kac kilo: ");
        patlican=input.nextDouble();

        toplam=(armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5.0);
        System.out.print("Toplam tutar= "+ toplam);








    }
}

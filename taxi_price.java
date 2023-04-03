import java.util.Scanner;
public class taxi_price {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int dist;
        double strprc = 10, kmprc = 2.20;
        double total;
        System.out.print("enter distance: ");
        dist = input.nextInt();

        total =strprc + (kmprc * dist);
        total = (total < 20) ? 20 : total;

        System.out.println("total price" + total);











    }
}

import java.util.Scanner;
public class kucukten_buyuge_sıralama {
    public static void main(String[] args) {

        int a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        a = inp.nextInt();

        System.out.print("Enter the value of b : ");
        b = inp.nextInt();

        System.out.print("Enter the value of c : ");
        c = inp.nextInt();

        if((a < b) && (a < c)){
            if(b < c){
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        } else if ((b < a) && (b < c)) {
            if(a < c){
                System.out.println("b < a < c");
            } else {
                System.out.println("b < c < a");
            }
        } else {
            if (a < b){
                System.out.println("c < a < b");
            } else{
                System.out.println("c < b < a");
            }
        }
    }
}

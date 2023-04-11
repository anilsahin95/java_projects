import java.util.Scanner;




public class primeNumWithRecursive {

    public static boolean asalMi(int sayi, int bolen){
        if (sayi < 2) {
            return false;
        }
        if (sayi == 2){
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        if (bolen * bolen > sayi){
            return true;
        }
        return asalMi(sayi, bolen +1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı girin :");
        int a = scan.nextInt();

        if (asalMi(a,2)){
            System.out.println(a + " asal bir sayıdır.");
        } else {
            System.out.println(a + " asal bir sayı değildir.");
        }


        }

    }

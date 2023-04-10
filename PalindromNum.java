import java.util.Scanner;




public class PalindromNum {
    static boolean palindrom(int number) {

        int temp = number, rvnumber = 0, lastnum;

        while (temp != 0) {
            lastnum = temp % 10;
            rvnumber = (rvnumber * 10) + lastnum;
            temp /= 10;

        }

        if (number == rvnumber)
            return true;
        else
            return false;





    }

    public static void main(String[] args) {
        int n;
        System.out.println("sayi giriniz");
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        System.out.println(palindrom(n));

        }

    }

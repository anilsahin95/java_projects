import java.util.Scanner;
import java.util.Arrays;

public class SortElementOfArray {
    public static void main(String[] args) {
        System.out.println("dizi boyutu girin : ");
        Scanner inp = new Scanner(System.in);
        int boyut = inp.nextInt();
        int [] dizi = new int[boyut];
        System.out.println("diziye değer giriniz");

        for(int i=1 ; i <= boyut; i++){
            System.out.print(i + ". elaman : ");
            dizi[i-1] = inp.nextInt();
        }

        Arrays.sort(dizi);
        System.out.print("sıralaması : ");
        for( int b : dizi){
            System.out.print(b + " ");
        }


    }
}

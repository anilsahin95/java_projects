// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Fighter ali = new Fighter("ali" , 20 , 100, 95, 50);
        Fighter veli = new Fighter("veli" , 10 , 100, 100, 10);
        Ring r = new Ring(ali,veli , 90 , 100);
        r.run();

    }
}
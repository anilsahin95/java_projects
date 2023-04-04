import java.util.Scanner;
public class fly_ticket {
    public static void main(String[] args) {

        int distance, yas, tip;
        double price, total;
        System.out.println("mesafe giriniz");
        Scanner inp = new Scanner(System.in);
        distance = inp.nextInt();

        System.out.println("yas bilgisi giriniz");
        Scanner inpu = new Scanner(System.in);
        yas = inpu.nextInt();

        System.out.println("yolculuk tipi bilgisi giriniz");
        Scanner inpe = new Scanner(System.in);
        tip = inpe.nextInt();

        if (yas > 0 && distance > 0 && tip == 1 || tip == 2) {
            if (yas < 12) {
                price = distance * 0.10 * 0.5;
                if (tip == 2) {

                    price = (price * 0.8) * 2;
                }

            } else if (yas > 65) {
                price = distance * 0.10 * 0.7;
                if (tip == 2) {

                    price = (price * 0.8) * 2;
                }

            }

            else if (yas>=12 && yas<25) {
                price = distance * 0.10 * 0.9;
                if (tip == 2) {

                    price = (price * 0.8) * 2;
                }

            }
            else {
                price = distance * 0.10;
            }

            System.out.println("total price" + price);

        }
        else {

            System.out.println("hatalı sayı girdiniz");




        }
            
    }
}

public class bir_yuz_arasi_asal_sayi {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int n = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j  == 0) {
                    n++;
                }
            }
            if (n <= 2) {
                System.out.println(i);
            }
        }

    }
}

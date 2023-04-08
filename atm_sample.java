import java.util.Scanner;
public class atm_sample {
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right=3, select;
        double price, balance=20000;
        while (right>0){
            System.out.print("Kullanıcı Adınız: ");
            userName=scan.nextLine();
            System.out.print("Parolanız: ");
            password= scan.nextLine();
            if (userName.equals("anil")&&password.equals("asdfg1")){
                System.out.println("Sisteme giriş yapıldı.");
                do {
                    System.out.print("1- Para yatırma.\n" +
                            "2- Para çekme\n" +
                            "3- Bakiye sorgulama\n" +
                            "4- Kayıtlı kişi İBAN transfer\n" +
                            "0- Çıkış yap\n");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = scan.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para miktarı: ");
                            price=scan.nextDouble();
                            balance += price;
                            System.out.println("Güncel bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            price=scan.nextDouble();
                            if(balance<price){
                                System.out.println("Bakiye yetersizdir.");
                            }else {
                                balance -= price;
                                System.out.println("Güncel bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                }while (select!=4);
                System.out.println("Çıkış yapıldı.");
                break;
            }else {
                right--;
                if(right==0){
                    System.out.println("Hesabınız bloke edilmiştir. Lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.\nKalan hakkınız: " + right);
                }
            }
        }

    }
}

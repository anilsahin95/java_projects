import java.util.Scanner;
public class password_control {
    public static void main(String[] args) {
        String user="anil",password="besyol",new_pass,pass,username;
        int select;
        Scanner inp= new Scanner(System.in);

        System.out.println("please enter your username:");
        username= inp.nextLine();

        if(username.equals(user)){

            System.out.println("please enter your password:");
            pass=inp.nextLine();
            if (pass.equals(password)){
                System.out.println("Hello");
            }
            else {
                System.out.println("entered password is not correct. Would you want to change yor password:\n1)y\n2)n\n");
                select=inp.nextInt();
                switch (select){
                    case 1:
                        System.out.println("please enter your new password");
                        new_pass=inp.next();
                        if (password.equals(new_pass)){
                            System.out.println("new password cannot equals to old ");
                        }
                        else {
                            System.out.println("new password is "+new_pass);

                        }
                        break;
                    case 2:
                        System.out.println(" good bye see you later ");
                        break;
                    default:
                        System.out.println("invalid number");

                }
            }




        }
        else{
            System.out.println("there are not found" +user);
        }

    }
}

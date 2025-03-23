import java.util.Scanner;

public class CreateAnAccount {

    public  static void myAccount(){
        double account_balance = 100000;
        System.out.println("WELCOME AND MANAGE YOUR ACCOUNT.");
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("========Choose the options below========");
            System.out.println("Select 1 to check account info: ");
            System.out.println("Select 2 to withdraw amount from account: ");
            System.out.println("Select 3 to fund account: ");
            int option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Account balance is: "+account_balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double with_draw_amount = input.nextDouble();
                    System.out.print("You have with-drawn "+with_draw_amount+" remained balance "+(account_balance-with_draw_amount));
                    break;
                case 3:
                    System.out.print("Enter amount you want to fund account: ");
                    double fund_amount = input.nextDouble();
                    System.out.println("Hello you have funded "+fund_amount+" your total account balance is "+(account_balance+fund_amount));
                    break;
                default:
                    System.out.println("Entered value is out of range !!");

            }
        }
    }
}

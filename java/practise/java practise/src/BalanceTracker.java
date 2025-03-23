import java.util.Scanner;

public class BalanceTracker {

    public static void trackBalance(){
        Scanner sc = new Scanner(System.in);
        double balance = 100000;
        int days = 0;

        while (balance>0){
            System.out.print("Enter your expenditure for day "+(days + 1)+": ");
            double expenditure = sc.nextDouble();

            if(expenditure > balance){
                System.out.println("Sorry you have insufficient balance, Please recharge your total balance");
                break;
            }

            balance -= expenditure;
            days ++;
            System.out.println("Your remained balance is : "+balance);

            if(balance < 100){
                System.out.println("Your balance is too low, Please recharge your account.");
            }
        }
    }
}

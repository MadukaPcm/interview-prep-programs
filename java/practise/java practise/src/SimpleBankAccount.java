import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleBankAccount {
    private double balance;

    SimpleBankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void withDraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Hello you have with-drawn: "+amount+"\n");
        }else {
            System.out.println("Can't with draw your balance is not enough !!\n");
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Hello "+amount+" deposited to you account.\n");
        }else {
            System.out.println("Hello your amount is too low to deposit.\n");
        }
    }

    public void checkBalance(){
        System.out.println("Hello you account balance is "+balance+"\n");
    }

    public static void main(String[] args){
        SimpleBankAccount account = new SimpleBankAccount(100000);
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO YOUR BANK ACCOUNT WITH AVL BALANCE "+account.balance);
        while (true){
            System.out.println("ENTER OPTION OF YOUR CHOICE.");
            System.out.print("1 to with-draw from account :");
            System.out.print("\n2 to recharge account :");
            System.out.print("\n3 to check account balance :");
            System.out.println("\n4 to exit :");
            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.print("Enter amount to with-draw :");
                    double withDrawAmount = sc.nextDouble();
                    account.withDraw(withDrawAmount);
                    break;
                case 2:
                    System.out.print("Enter recharge amount :");
                    double rechargeAmount = sc.nextDouble();
                    account.deposit(rechargeAmount);
                    break;
                case 3:
                    System.out.println("Your total account balance is "+account.balance);
                    break;
                case 4:
                    System.out.println("Exiting from the account : Thank You !");
                    return;
                default:
                    System.out.println("Invalid option selected");
            }
        }
    }
}

import java.util.Scanner;

public class SwappNumbers {

  public static void main(String[] args){
    int a, b;


    Scanner input = new Scanner(System.in);
    System.out.println("Enter value of a: ");
    a = input.nextInt();
    System.out.println("Enter the value of b: ");
    b = input.nextInt();

    System.out.println("Before swapp: a = "+a+" ,b = "+b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("************ After swapping ****************");
    System.out.println("Value of a = "+a);
    System.out.println("Value of b = "+b);
  }
  
}

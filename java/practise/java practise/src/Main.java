import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // Occurance.occur(statement,c)
        Scanner sc = new Scanner(System.in);
        String statement = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(Occurance.occur(statement,c));

        // computeEvenOddPrimeNo
        int [] list = {2,3,4,5};
        EvenOddPrime.computeEvenOddPrimeNo(list);

    }
}

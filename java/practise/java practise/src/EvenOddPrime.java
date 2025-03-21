public class EvenOddPrime {

    public static void computeEvenOddPrimeNo(int [] list){
        int totalEven = 0;
        int totalOdd = 0;
        int totalPrime = 0;

        for (int n : list){
            // check even
            if(n % 2 == 0){
                totalEven += n;
            }else if(n % 2 == 1){
                totalOdd += n;
                if((3 <= (int)Math.sqrt(n)) && (int)Math.sqrt(n) % 3 != 0){
                    totalPrime += n;
                }
            }
            if(n == 2){
                totalPrime += n;
            }
        }

        System.out.println("Total even numbers are: "+totalEven);
        System.out.println("Total odd numbers are: "+totalOdd);
        System.out.println("The prime numbers are: "+totalPrime);
    }
}

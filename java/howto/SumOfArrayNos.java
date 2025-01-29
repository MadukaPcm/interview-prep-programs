
/**
 * SumOfArrayNos
 */
public class SumOfArrayNos {

  public static void main(String[] arge){

    int avg,sum=0;
    int[] numbers = {1,2,3,4,5};
    int length = numbers.length;

    for(int number : numbers){
      sum += number;
    }
    avg = sum/length;
    System.out.println("The sum of the array numbers is: "+sum);
    System.out.println("The AVG of the array numbers is: "+avg);
  }
}
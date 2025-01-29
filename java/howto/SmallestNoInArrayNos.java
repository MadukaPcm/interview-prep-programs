
class SmallestNoInArrayNos {

  public static void main(String[] args){

    int[] numbers = {20,80,7,90};
    int smallestNumber = numbers[0];

    for(int number : numbers){
      if(smallestNumber > number){
        smallestNumber = number;
      }
    }

    System.out.println("The smallest number in array is: "+smallestNumber);
  }
  
}

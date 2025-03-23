import java.util.Scanner;

public class PesticideBottles {

    public static void main(String[] args){
        int[] bottles = {20, 15, 10, 5, 3, 1};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter area to be covered in square meters :");
        int area = sc.nextInt();

        int remainingArea = area;
        for (int bottle : bottles){
            if(remainingArea >= bottle){
                int count = remainingArea/bottle;
                remainingArea %= bottle;
                System.out.println(bottle +" little of bottle "+ count+" bottles");
            }
        }

        if(remainingArea > 0){
            System.out.println("No exact bottle to math the remained area");
        }
    }
}

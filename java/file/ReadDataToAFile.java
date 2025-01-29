import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataToAFile {

    public static void main(String[] args){
        try{
            File readFile = new File("/home/maduka/Desktop/p/INTERVIEW/java/file/files/my_first_file.txt");
            Scanner read = new Scanner(readFile);

            while (read.hasNextLine()){
                String data = read.nextLine();
                System.out.println(data);
            }
            read.close();
            System.out.println("File read successfully.");
        }catch(FileNotFoundException e){
            System.out.println("An error occured :");
            e.printStackTrace();
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {

    public static void main(String[] args){
        try{
            FileWriter fileWriter = new FileWriter("/home/maduka/Desktop/p/INTERVIEW/java/file/files/my_first_file.txt");
            fileWriter.write("Bro Frank EE");
            fileWriter.close();
            System.out.println("File successfully updated");
        }catch (Exception e){
            System.out.println("An error occured during writting to a file");
            e.printStackTrace();
        }
    }
}

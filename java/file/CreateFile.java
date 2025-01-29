import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args){
        try{
            File file = new File("/home/maduka/Desktop/p/INTERVIEW/java/file/files/my_first_file_one.txt");
            if(file.createNewFile()){
                System.out.println("File  named ~ " + file.getName()+ " created successfully.");
            }else {
                System.out.println("File named ~" + file.getName()+" already exists ");
            }
        }catch (IOException e){
            System.out.println("An error occured during creating file ");
            e.printStackTrace();
        }
    }
}

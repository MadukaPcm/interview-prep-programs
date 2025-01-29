import java.io.File;

public class DeleteFileAndFolder {

    public static void main(String[] args){
        try {
            File file = new File("/home/maduka/Desktop/p/INTERVIEW/java/file/files/my_first_file_one.txt");
            if(file.exists()){
                file.delete();
                System.out.println("Successfully deleted the file");
            }else {
                System.out.println("Failed to delete file");
            }
        }catch (Exception e){
            System.out.println("An error occured ");
            e.printStackTrace();
        }
    }
}


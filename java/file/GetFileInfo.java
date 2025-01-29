import java.io.File;

public class GetFileInfo {

    public static void main(String[] args){
        File file = new File("/home/maduka/Desktop/p/INTERVIEW/java/file/files/my_first_file.txt");
        if(file.exists()){
            System.out.println("File name: "+file.getName());
            System.out.println("Absolute path: "+file.getAbsoluteFile());
            System.out.println("Writable: "+file.canWrite());
            System.out.println("Readable: "+file.canRead());
            System.out.println("File length: "+file.length());
        }else {
            System.out.println("File not found");
        }
    }
}

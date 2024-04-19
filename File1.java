import java.io.File;
/**
 * File1
 */
public class File1 {

    public static void main(String[] args) {
        File a = new File("namit.txt");
        try {
            a.createNewFile();
        } catch (Exception e) {
           System.out.println(e);
        }
        finally{
            System.out.println("File created without any error");
        }
    }
}
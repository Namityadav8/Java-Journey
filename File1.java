import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
public class File1 {
    public static void main(String[] args) {
        // code wo create a new file 
        File f1 = new File("C:\\Academics\\Java-Journey\\namit.txt");
        f1.exists();  // to check if a file is existing or not 
        try{
            f1.createNewFile();
        }catch(IOException e){
            System.out.println(e);
        }
        /// code to write in a file \
        try{
        FileWriter fq = new FileWriter(f1);
        fq.write("hi this is namit yadav");
        fq.close();
        }catch(Exception e ){
            System.out.println(e);
        }


        //reading a file 
    }
}
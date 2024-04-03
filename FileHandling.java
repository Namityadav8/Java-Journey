import java.io.File;
import java.io.IOException;
public class FileHandling {
    public static void main(String[] args) {
        try{
            File fo = new File("input.txt");
            if(fo.createNewFile()){
                System.out.println("File "+fo.getName()+" is created successflly.");
            }else{
                System.out.println("File is already exist in the directry.");
            }
        
    }catch(IOException exception){
        System.out.println("An unexpected error is occured.");
        exception.printStackTrace();
    }
    
}
}


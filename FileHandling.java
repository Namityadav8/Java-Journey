// import java.io.File;
// import java.io.IOException;
// public class FileHandling {
//     public static void main(String[] args) {
//     //     try{
//     //         File fo = new File("input.txt");
//     //         if(fo.createNewFile()){
//     //             System.out.println("File "+fo.getName()+" is created successflly.");
//     //         }else{
//     //             System.out.println("File is already exist in the directry.");
//     //         }
        
//     // }catch(IOException exception){
//     //     System.out.println("An unexpected error is occured.");
//     //     exception.printStackTrace();
//     //     }

//     // System.out.println();
       
        
//     }
// }


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class FileHandling {
    public static void main(String[] args) {
        // String basePath = "C:\\Local volume\\Programming\\Java\\IO\\";
        // String fileName = "input.txt";
        // File obj = new File(basePath + fileName);

        // try {
        //     if (obj.exists()) {
        //         int count = 1;
        //         do {
        //             fileName = "input" + count + ".txt";
        //             fileName = "input"   + count + ".txt";
        //             obj = new File(basePath + fileName);
        //             count++;
        //         } while (obj.exists());
        //     }

        //     if (obj.createNewFile()) {
        //         System.out.println("File " + obj.getName() + " is created successfully");
        //     } else {
        //         System.out.println("File already exists");
        //     }
        // } catch (IOException exception) {
        //     System.out.println("An unexpected error");
        //     exception.printStackTrace();
        // }

        // System.out.println("Path: " + obj.getAbsolutePath());
        // System.out.println("Writable: " + obj.canWrite());
        // System.out.println("Readable: " + obj.canRead());
        // System.out.println("Length in bytes: " + obj.length());
        // System.out.println("Length in bytes: " + obj.length());
        


        // try{
        //     File f1 = new File("input.txt");
        //     Scanner dataReader = new Scanner(f1);
        //     while(dataReader.hasNextLine()){
        //         String fileData = dataReader.nextLine();
        //         System.out.println(fileData);
        //     }
        //     dataReader.close();
        // }catch(FileNotFoundException exception){
        //     System.out.println("Unexpected error occured");
        //     exception.printStackTrace();
        //     }
        

        File f0 = new File("input.txt");
        if(f0.delete()){
            System.out.println(f0.getName()+"file is deleted successfully");
        }else{
            System.out.println("unexpected error found in deletion of the file .");
        }
    }
}
import java.io.*;
import java.util.*;
public class File1 {
    public static void main(String[] args) {
        File f1 = new File("practise.txt");
        try{
            f1.createNewFile();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            FileWriter fw = new FileWriter(f1);
            fw.write("Hello i am revising things in this ");
            fw.close();
            System.out.println("Content has been written in the file ");
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Now if you want to read what has been written in your file ");

        try{
            Scanner sc = new Scanner(f1);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(Exception e){
            System.out.println(e);
        }
        
        // deleting a file in java

        f1.delete();

        try{
            File obj=new File("nlp.txt");
            Scanner sc=new Scanner(obj);
            String larger="";
            String current;
            while (sc.hasNext()) {
            current=sc.next();
            if (current.length()>larger.length()){
            larger=current;
            }
            }
            System.out.println(larger);
            
            }
            catch(Exception e){
                System.out.println(e);
            }
    }
}
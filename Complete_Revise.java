import java.io.*;
import java.util.Scanner;


public class Complete_Revise {

    public static void main(String[] args) {
        File f1 = new File("moose.txt");
        // try{
        //     f1.createNewFile();
        // }catch(Exception e ){
        //     System.out.println("File isnt created due to this reason "+e);
        // }finally{
        //     System.out.println("File is been created .");
        // }

        System.out.println("Now writing inside the file ");
        // this is how we write inside the file 
        try{    
            FileWriter fw = new FileWriter(f1);
            fw.write("Hello this is been written in the file ");
            fw.close();
        }catch(IOException e){
            System.out.println(e);
        }finally{
            System.out.println("Content has been written in the file ");
        }


        try{
            Scanner sc = new Scanner(f1);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }}catch(Exception e){
                System.out.println(e);
            }
            finally{
                System.out.println("Content has been readed.");
            }
        
        } }

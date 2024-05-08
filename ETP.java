import java.util.*;
import java.io.*;
public class ETP {
    public static void main(String[] args) {
       
        
        File ok = new File("opg.txt");

        try{

            ok.createNewFile();

            FileWriter lo = new FileWriter(ok);

            lo.write("12\n");
            lo.write("11\n");
            lo.write("13\n");
            lo.close();

            Scanner sc = new Scanner(ok);
            int k = 0;
            int s = 0;
            while(sc.hasNextLine()){
            String c = sc.nextLine();
            Integer q = new Integer(c);
            k+=q;
            s++;
            }

            System.out.println(k/s);


            

        }
        catch(Exception e){
            System.out.println("inininininininin");
        }





    }
}

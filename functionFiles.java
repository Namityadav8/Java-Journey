import java.io.*;
import java.util.*;
public class functionFiles {

    public static void main(String[] args) {
        
        File f1 = new File("namit1.txt");
        try {
            f1.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
        }

        try {
            FileWriter fw = new FileWriter(f1);
            fw.write("Gender equality is the state where people of all genders have equal rights, opportunities, and expectations. \n This includes access to education, employment, healthcare, and political participation. \n It also means valuing the different experiences and perspectives of men, women, and non-binary individuals. \n  Achieving gender equality benefits everyone in society. \n It can lead to economic growth, reduced poverty, and a more peaceful world.");
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
      
        try{
       FileReader reader = new FileReader(f1);
            f1.read();
        }catch(Exception e){}

        String big = "";
        String small;
        try {
            Scanner sc = new Scanner(f1);
            while(sc.hasNextLine()){
                small=sc.nextLine();

                if(small.length()>big.length()){
                    big = small;
                }
            }
        System.out.println(big);
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
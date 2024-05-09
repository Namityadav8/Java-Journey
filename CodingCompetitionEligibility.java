import java.util.Scanner;
       
public class CodingCompetitionEligibility {


    public static int sum(int ...a){
        int result = 0 ;
        for(int i: a){
            result = result +i;
        }
            return result; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(sum(23,34,23,21,23,34,1));
        System.out.println(sum(23,34,23,34,1));
       
        
    }
}
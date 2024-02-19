/**
 * practise3
 */
import java.util.Scanner;
public class practise3 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x =a.nextInt();

        while(x>=10){
            x=x/10;
        }
        System.out.println(x);
    }
}
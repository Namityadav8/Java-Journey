import java.util.Scanner;

/**
 * practise3
 */
public class practise3 {
    
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a==3){
            throw new ArithmeticException();
        }
        else{
            System.out.println("Alright");
        }
       

    }
}
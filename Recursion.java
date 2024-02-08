import java.util.Scanner;
import java.util.*;
public class Recursion {

    static int factorial(int n){
            if(n==0 || n==1){
                return 1;
            }else if(n<0){
                return 0;
            }else{
                return n*factorial(n-1); // like this here we have called the function inside the 
                // function so it will be called again by itself .
            }

        }
    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of : ");
        int b = a.nextInt();
        System.out.println(factorial(b));
    }
}

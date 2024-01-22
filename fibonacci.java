import java.util.Scanner;

// was done by me 
public class fibonacci {
    static int fun(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fun(n-1) + fun(n-2);
        }

    }
    public static void main(String[] args) {
        int n;
        Scanner b = new Scanner(System.in);
        n=b.nextInt();
        int d = fun(n);
        System.out.println(d);

        
    }
}
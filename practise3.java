import java.util.*;
public class practise3 {
    public static void fib(int n){
        int a = 0;
        int b =1;

        System.out.print(a+" "+b+" ");

        for(int i=2;i<n;i++){
            int next = a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int y = a.nextInt();
        fib(y);
    }
}
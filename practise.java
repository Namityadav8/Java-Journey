import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int [] a ;
        a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = b.nextInt();
        }

        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        for(int bitch : a){
            System.out.println(bitch);
        }
    
        
    }
    
}
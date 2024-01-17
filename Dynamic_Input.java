import java.util.Scanner;

public class Dynamic_Input {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int m ;
        System.out.print("Enter the number you want to take in array \n");
        m  = a.nextInt();
        int [] b = new int[m];
        for(int i=0;i<m;i++){
            b[i] = a.nextInt();
        }
       for(int i=0;i<m;i++){
        System.out.println(b[i]);
       }

    }
}

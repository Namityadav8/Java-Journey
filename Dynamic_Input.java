import java.util.Scanner;

public class Dynamic_Input {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
       int m;
       System.out.println("Enter how many numbers you want in your array :");
       m=a.nextInt();
       int [] b = new int[m];
       for(int i=0;i<m;i++){
        b[i] = a.nextInt();
       }
       System.out.println("Entered using for loop");
       for(int i=0;i<m;i++){
        System.out.println(b[i]);
       }
       System.out.println("Entered using for each loop");
       for(int element : b){
        System.out.println(element);
       }



    }
}

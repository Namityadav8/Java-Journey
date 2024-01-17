import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        /*how to initialise an array */
        //there are three ways to create arrays in java 
        // int [] a = new int[5];
        // System.out.println(a[3]);
        // int [] a ;
        // a= new int[10];
        // a[0] = 2;
        // System.out.println(a[0]);
        // String [] students;
        // students = new[10];
        Scanner a = new Scanner(System.in);

        int [] b = new int[10];
        for(int i=0;i<5;i++){
            b[i] = a.nextInt();
        }

        for(int i=0;i<5;i++){
            System.out.println(b[i]);
        }

    }
}

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        /*how to initialise an array */
        Scanner b = new Scanner(System.in);
        int [] a = new int[5];
        for(int i =0;i<=5;i++){
            a[i] = Scanner.nextInt();
        }
        System.out.println(a);
    }
}

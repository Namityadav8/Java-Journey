import java.util.Scanner;
public class D2_Array {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        //declaration of an 2-D array
       int [][] a = new int[2][3];


       for(int i=0;i<a.length;i++){
        for(int j=0;j<a[i].length;j++){
            System.out.print(a[i][j]);
            System.out.print(" ");
        }
        System.out.println("");
       }
    }
}



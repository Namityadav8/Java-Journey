import java.util.Scanner;

public class practise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int a = sc.nextInt();
        int x [][] = new int[a][];
        for(int i=0;i<x.length;i++){
            System.out.println("Now Enter the number of elements you want in "+(i+1)+"th"    +  " row :");
            int j = sc.nextInt();
            x[i] = new int[j];
            for(int y =0;y<j;y++){
                x[i][y] = sc.nextInt();
            }
        }  
        System.out.println("Entered jagged array is :");
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }  

    }
}
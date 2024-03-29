import java.util.Scanner;

public class java_revise {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter the number of rows u want in your array");
        int a ;
        a=x.nextInt();
       
        int arr[][] = new int[a][];
        for(int i=0;i<a;i++){
            System.out.println("Now Enter the number of elements you want to add in your "+(i+1)+" row");
            int b=x.nextInt();
            arr[i] = new int[b];
            for(int j=0;j<b;j++){
                arr[i][j]=x.nextInt();
            }
        }
       
       
        System.out.println("Jagged Array formed is ");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
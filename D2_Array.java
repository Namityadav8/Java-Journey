import java.util.Scanner;

public class D2_Array {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the number of rows and columns you want to add in your array :");
        m=a.nextInt();
        n=a.nextInt();

        int [][] c = new int[m][n];

        for(int i=0;i<c.length;i++){  ///here c.length is used as in 2D array arrayname.length gives us the output of the numbrs of the rows in the array
            for(int j=0;j<c[i].length;j++){
                c[i][j] = a.nextInt();
            }
            System.out.println("");
        }

        //now after taking all the inputs in the 2d array now we have to print all the arrays 


        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
    
}
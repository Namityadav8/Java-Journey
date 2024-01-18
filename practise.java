import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int [][] b ;
        b = new int[3][5];

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
       
        
        
    }
    
}
import java.util.*;
public class Question {
        public static void main(String[] args) {
            Scanner x = new Scanner(System.in);
            System.out.println("Enter the numbers of rows you want in your jagged array: ");
            int rows = x.nextInt();
            int [][] jagged = new int[rows][];
            for(int i=0;i<rows;i++){
                System.out.println("Now tell me the numbers of elements you want in this row:  ");

                int cols = x.nextInt();
                jagged[i] = new int[cols]; // here creating the number of elements in each row 
                for(int j=0;j<cols;j++){
                    jagged[i][j]=x.nextInt(); // here taking input in nth row and inserting colums in it 
                }
            }

//now its time to print the jagged array having all the elements of diff size
            for(int i=0;i<jagged.length;i++){ // jagged.length return number of rows 
                for(int j=0;j<jagged[i].length;j++){ // here it will return numbers of elements in ith roq
                    System.out.print(jagged[i][j]+" ");
                }
                System.out.println("");
            }




        }
    
}
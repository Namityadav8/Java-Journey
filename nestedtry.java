import java.util.Scanner;
public class nestedtry {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        int [] marks = new int[4];
        marks[1] = 3;
        marks[2] = 4;
        marks[3] = 6;
        System.out.println("Enter the number you want to divide it by ");
        int b =a.nextInt();
        System.out.println("Enter the index value");
        int x = a.nextInt();
        try{
            System.out.println("welcome to level-1");
            try{
                System.out.println("welcome to level-2");
                System.out.println("Array divided by the number"+ marks[x]/b);
            }
            catch(Exception e){
                System.out.println("error in level-2");
            }
        }
        catch(Exception e){
            System.out.println("error in level-2");
        }

        System.out.println("happy ending ");
    
    }
}

import java.util.Scanner;

public class Question {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter number of subjects ");
        int b =a.nextInt();
        System.out.println("Enter marks in subjects :");
        int [] marks = new int[b];

        for(int i=0;i<b;i++){
            marks[i] = a.nextInt();
        }
        int result =0;
        for(int i=0;i<b;i++){
            result+=marks[i];
        }

        System.out.println("percentage scored is "+((result)/b)+"%");

    }
}
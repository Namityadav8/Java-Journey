// class Mythread extends Thread{
//     public void run(){
//         System.out.println("Hello");
        
//     }
// }

// class Mythread1 extends Thread{
//     public void run(){
//         System.out.println("hi ");
//         System.out.println("hi ");
        
// }
// public class practise {

//     public static void main(String[] args) {
//         Mythread a = new Mythread();
//         Mythread1 b = new Mythread1();
//         a.start();
//         b.start();
//     }
// }


/**
 * practise
 */


import java.util.*;
public class practise {

    public static void main(String[] args) {
        // int x,y,z;
        Scanner a = new Scanner(System.in);
        int b[][] = new int[3][4];

        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                b[i][j] = a.nextInt();
                System.out.print("");// we wont be taking space here as we are taking inputs not printing 
            }
            System.out.println("");
        }


       
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        // char b[] = new char[3] ;
        // for(int i=0;i<3;i++){
        //     b[i]=a.next().charAt(0);  // here charAt(0) is fixed to take an input in java
        // }
        // for(int i=0;i<3;i++){
        //     System.out.println(b[i]);
        // }
      
      
        // x=a.nextInt();
        // y=a.nextInt();
        // z=a.nextInt();
        // if(x>y && x>z){
        //     System.out.println(x+" X is the greatest");
        // }else if(y>z && y>x){
        //     System.out.println(y+" y is greatest");
        // }else{
        //     System.out.println(z+" is greatest");       // not like this use ternay operator .
        // }
        // int day;
        // day=a.nextInt();
        // String day = args[0];
        // switch (day) {
        //     case "1":
        //         System.out.println("monday");
        //         break;
        //     case "2":
        //     System.out.println("tuesday");
        //     break;

        //     case "3":
        //     System.out.println("wednesday");
        //     break;

        //     case "4":
        //     System.out.println("thursday");
        //     break;

        //     case "5":
        //     System.out.println("friday");
        //     break;

        //     case "6":
        //     System.out.println("saturday");
            
        //     break;

        //     case "7":
        //     System.out.println("sunday");
        //     break;
        //     default:
        //     System.out.println("itna nahi hota55");
        //         break;
        // }
        // // switch (day) {
        // //     case 1 -> System.out.println("Monday");
        // //     case 2 -> System.out.println("Tuesday");
        // //     case 3 -> System.out.println("Wednesday");
        // //     case 4 -> System.out.println("Thursday");
        // //     case 5 -> System.out.println("Friday");
        // //     case 6 -> System.out.println("Saturday");
        // //     case 7 -> System.out.println("Sunday");
        // //     default -> System.out.println("Invalid day");
        // // }
        //         float p = 23.326745f;
        //         int namit = (int) p;
        //         System.out.println(namit);
        //         System.out.println("Enter the number between 1-100: ");
        //         if (args.length < 1) {
        //             System.out.println("Please enter only one number.");
        //             return;
        //         }
        
        //         int number = Integer.parseInt(args[0]);  /// parsing method is done to convert it from string to int 
        //         if (number >= 96 && number <= 100) {
        //             System.out.println("Grade A+");
        //         } else if (number >= 91 && number <= 95) {
        //             System.out.println("Grade A+");
        //         } else if (number >= 86 && number <= 90) {
        //             System.out.println("Grade B+");
        //         } else if (number >= 81 && number <= 85) {
        //             System.out.println("Grade B");
        //         } else if (number >= 76 && number <= 80) {
        //             System.out.println("Grade B-");
        //         } else if (number >= 71 && number <= 75) {
        //             System.out.println("Grade C+");
        //         } else if (number >= 66 && number <= 70) {
        //             System.out.println("Grade C");
        //         } else if (number >= 61 && number <= 65) {
        //             System.out.println("Grade C-");
        //         } else if (number >= 56 && number <= 60) {
        //             System.out.println("Grade D+");
        //         } else if (number >= 51 && number <= 55) {
        //             System.out.println("Grade D");
        //         } else if (number >= 0 && number <= 50) {
        //             System.out.println("Grade F");
        //         } else {
        //             System.out.println("Please enter a number between 0-100.");
        //         }
             






    }
}
// using ternary function +
// int num1 = 10;
// int num2 = 20;
// int num3 = 15;

// int greatest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

// System.out.println("The greatest number is: " + greatest);

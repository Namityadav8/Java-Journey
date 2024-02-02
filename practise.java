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
        String day = args[0];
        switch (day) {
            case "1":
                System.out.println("monday");
                break;
            case "2":
            System.out.println("tuesday");
            break;

            case "3":
            System.out.println("wednesday");
            break;

            case "4":
            System.out.println("thursday");
            break;

            case "5":
            System.out.println("friday");
            break;

            case "6":
            System.out.println("saturday");
            
            break;

            case "7":
            System.out.println("sunday");
            break;
            default:
            System.out.println("itna nahi hota55");
                break;
        }
        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("Invalid day");
        // }
        
        






    }
}
// using ternary function +
// int num1 = 10;
// int num2 = 20;
// int num3 = 15;

// int greatest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

// System.out.println("The greatest number is: " + greatest);

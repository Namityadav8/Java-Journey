// import java.util.*;
// public class stack {
//     public static void main(String[] args) {
//         Stack<Integer> obj = new Stack<>();
//         obj.add(23);
//         obj.add(20);
//         obj.add(21);
//         obj.add(22);
//         obj.add(25);
//        System.out.println(obj);
//        obj.push(69);
//        System.out.println(obj);
//         while(!obj.isEmpty()){
//             System.out.println(obj.pop());
//         }
    
      
//     }
// }   

// obj.pop()   returns the topmost value of the stack 
// push adds items into it 
// pop returns the top most element
//esEmpty() checks if the stack is empty or not 
// peek() returns the first element in the stack 







import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Create two stacks
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Infinite loop to continuously prompt the user for operations
        for (;;) {
            // Display the menu options
            System.out.println("Press 1 for Push\n Press 2 for Pop\n Press 3 for Exit");

            // Read the user's choice
            int a = sc.nextInt();

            // Perform the chosen operation
            switch (a) {
                // Push operation
                case 1:
                    // Reverse the order of s1 by popping and pushing onto s2
                    while (!s1.empty()) {
                        s2.push(s1.pop());
                    }

                    // Add the new value to s1
                    s1.add(sc.nextInt());

                    // Reverse the order of s2 back onto s1
                    while (!s2.empty()) {
                        s1.push(s2.pop());
                    }

                    // Print the current state of s1 and its top element
                    System.out.println("Data in Stack is " + s1);
                    System.out.println("Top = " + s1.peek());
                    break;

                // Pop operation
                case 2:
                    // Pop the top element from s1
                    s1.pop();
                    System.out.println(s1);
                    break;

                // Exit the program
                case 3:
                    // Exit the program
                    System.exit(0);
                    break;

                // Default case: do nothing if the user enters an invalid choice
                default:
                    break;
            }
        }
    }
}
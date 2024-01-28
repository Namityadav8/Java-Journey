// import java.util.Scanner;
// import java.util.*; // will import all the libraries 

package namit.yadav;   // this is package inside a package which means yadav folder inside namit

public class packages {
    public static void main(String[] args) {
        java.util.Scanner a = new java.util.Scanner(System.in); // without importing
        int b = a.nextInt();
        System.out.println("this is my entered number from scanner " + b);
    }
}

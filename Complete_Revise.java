import java.util.Scanner;

public class Complete_Revise {


  public  int fun(int a , int b){
        return a+b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // we can format anything using string formatting 
    // double a = 3.4534;
    // String x = "Namit is here ";
    // System.out.println(x.charAt(4));
    Complete_Revise m = new Complete_Revise(); // if it is not mentioned as static it will ab accessed only by the object of main class other wise it can be accessed by any function or we can access it directly 
    
    System.out.println(m.fun(3,2));
    







  }

}
import java.util.*;
public class errors {
    public static void main(String[] args) {
     int [] marks = new int[3];
     marks[0] = 12;
     marks[1] = 24;
     marks[2] = 56;
    //   int c = a/b;
    //   System.out.println("the divide is "+c);          // it wont run as it is having error so it will 
        Scanner a = new Scanner(System.in)  ;  
        System.out.println("Enter the index you want");
        int b = a.nextInt();   
        System.out.println("enter the number you want to divide it by");
        int c = a.nextInt();                                        // stuck here and exit 
      try{   
        System.out.println("the divide is "+ marks[b]/c);
      }
      catch(ArithmeticException e){
    
        System.out.println("Arithmetic exception error aya hai lawde ");
        System.out.println(e);
      }
      catch(ArrayIndexOutOfBoundsException e){
        System.out.println("answer is out of bound");
        
      } // below one will be runned at last after all specific exceptions .
      catch(Exception e){  // we can use anything its not fixed to e or something else.
        System.out.println("We Failed to find division ");
        System.out.println(e); // here e is used to basically give the output why it isnt executed .
      }

      System.out.println("End of the program ");
    }
}

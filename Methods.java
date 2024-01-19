import java.util.Scanner ;
public class Methods {
     static int Sum(int a , int b){
        int c = a + b ;
        return c;
    }
    public static void main(String[] args) {
        int d = Sum(3,5);  // this can be used only if the methds is made static otherwise  
        //we can access it using objects only.
        System.out.println(d);

        // calling an function by creating object from the class
        Methods a = new Methods();
        int c = a.Sum(9,8);
        System.out.println(c);
        Methods object  = new Methods();// created an object named object.
        int e = object.Sum(4, 10);
        System.out.println(e);
        
    }
    
}
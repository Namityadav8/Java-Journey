import java.util.*;
class MyException extends Exception{

    @Override
    public String toString() {
        return super.toString()+ "Inside toString";
    }

    @Override
    public String getMessage() {
        
        return super.getMessage() + "Inside getMessage";
    }
}
public class exceptionClass {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b =a.nextInt();
        if(b>9){
        try{
            throw new MyException();
            throw new ArithmeticException("kar dia na error");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
        }
    }
    }
}


public class Expressions {

    public static void main(String[] args) {
        System.out.println("Hello Class ");
        int a =12,b=0,c;
        try {
            try {
                c=a/b;
            System.out.println(c);
            } catch ( ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
        } catch (ArithmeticException e ) {
            System.out.println(e);
        }
        
        System.out.println("END");
    }
}
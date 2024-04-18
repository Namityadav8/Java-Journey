/**
 * practise3
 */
public class practise3 {
    public static String getMessage(){
            return "it is a defined error";
    }
    public static void main(String[] args) {
        int a =1/0;
       
        try {
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.getMessage() );
          
        }

    }
}
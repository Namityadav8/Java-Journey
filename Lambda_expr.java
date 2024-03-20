import java.util.*;
@FunctionalInterface

interface a{
    void fun(String pal );
}


public class Lambda_expr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String y = sc.nextLine();
        a obj = (String pal ) -> {
            char[] m = y.toCharArray();
            for(int i=y.length()-1;i>=0;i--){
                System.out.print(m[i]);
            }
            System.out.println();
            String z = String.valueOf(m);
            if(z.equalsIgnoreCase(y)){
                System.out.println("It is a palindrome ");
            }
            else{
                System.out.println("it isnt a palindrome");
            }
        };
    
        obj.fun(y);
    }
} 

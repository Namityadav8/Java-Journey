@FunctionalInterface
interface a{
    void fun(int a );
}


public class Lambda_expr {
    public static void main(String[] args) {
        a obj = (int x ) -> {
            int a = 0, b = 1;
            System.out.println("First " + x + " Fibonacci numbers:");
            System.out.print(a + " " + b + " "); 
    
            for (int i = 2; i < x; i++) {
                int c = a + b; 
                System.out.print(c + " ");
                a = b; 
                b = c; 
            }
        };
        obj.fun(6);
    }
} 

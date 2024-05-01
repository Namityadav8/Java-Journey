import java.util.*;

public class CA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // same code that ran here but unable to run on the codetantra platform 
        ArrayList<String> a = new ArrayList<>();
        a.add("Java");
        a.add("Python");
        a.add("C++");
        System.out.println("Enter your Language :");
        String str = sc.next();
        if(a.contains(str)){
            System.out.println(str);
        }else{
           throw new ArithmeticException("Error");
        }

    }
}

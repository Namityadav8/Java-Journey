import java.util.*;

@FunctionalInterface
interface a {
    void fun(String pal);
}

public class Lambda_expr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        a obj = (String pal) -> {
            char[] m = pal.toCharArray();
            for (int i = pal.length() - 1; i >= 0; i--) {
                System.out.print(m[i]);
            }
            System.out.println();
            String z = String.valueOf(m);
            if (z.equals(pal)) {
                System.out.println("It is a palindrome ");
            } else {
                System.out.println("It isn't a palindrome");
            }
        };

        obj.fun(input);
    }
}

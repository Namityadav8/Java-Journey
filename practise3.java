import java.util.Scanner;

public class practise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        StringBuilder reversed = new StringBuilder(original).reverse();
        System.out.println("reversed string is "+reversed.toString());
    }
}

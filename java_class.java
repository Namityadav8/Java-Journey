import java.util.Scanner;

public class java_class {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String s = a.nextLine();

        char[] c = s.toCharArray();
        int m = c.length - 1;
        for (int i = m; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }
}

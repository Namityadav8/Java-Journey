/**
 * exception
 */
public class exception {
    public static void main(String[] args) {
        try {
            int a[]=new int[5];
            a[6]=3;
            System.out.println(a[6]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
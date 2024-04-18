/**
 * practise3
 */
public class practise3 {

    public static void main(String[] args) {
        int a =1/0;
        try {
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
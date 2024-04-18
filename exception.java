/**
 * exception
 */
public class exception {
    public static void main(String[] args) {
        try {
          int a =3 ;
          System.out.println(a);
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("There is no error in it and it has run successfully ");
        }
    }
}
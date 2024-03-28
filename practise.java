
public class practise {

    public static void main(String[] args) {
        int arr[] = {1,2,34,56,78};
        int v =arr[6];
        System.out.println(v);
        String a=null;
        System.out.println(a.length());
        String b = "Namit";
        int i = Integer.parseInt(b);

        try {
            System.out.println(v);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        catch(NullPointerException e){
            System.out.println(e);
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
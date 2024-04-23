import java.util.ArrayList;

public class collections {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(3);
        a.add(34);
        b.add(345);
        b.add(21);
        a.addAll(b);
        a.add(0,12); // adding any values to any particular index 
        System.out.println(a.contains(35));
     
        System.out.println(a);
        System.out.println(a.get(3));
        
        
    }
}

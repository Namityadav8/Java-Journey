import java.util.ArrayList;
import java.util.LinkedList;


interface a<T>{
    public void hi(T a );
}


public class collections {
    public static void main(String[] args) {
        // This is for arraylist functions done 
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
        

        // now linkedlist 
        LinkedList<Integer> x  = new LinkedList<>();
        
    }
}

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet<>();
        obj.add(23);
        obj.add(25);
        obj.add(26);
        obj.add(27);
        System.out.println(obj);
        obj.remove(25);
        System.out.println(obj);
        
    }
}

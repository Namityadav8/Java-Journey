import java.util.TreeSet;
class MyClass implements Comparable<MyClass>{
    private int value;
    public MyClass(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
    // @Override
    public int compareTo(MyClass other){
        return Integer.compare(this.value, other.value);
    }
}
public class ComparableClass {
    public static void main(String[] args) {
        TreeSet<MyClass> obj = new TreeSet<>();
        obj.add(new MyClass(5));
        obj.add(new MyClass(3));
        obj.add(new MyClass(8));
        System.out.println("Elements in Treeset :");
        for(MyClass obj1 : obj){
            System.out.println(obj1.getValue());
        }
    }
}

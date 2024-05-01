import java.util.*;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> obj = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add in list");
        int a = sc.nextInt();

        for(int i=0;i<a;i++){
            int x = sc.nextInt();
            obj.add(x);
        }
        System.out.println("The linked list made is :");
        for(int i=0;i<obj.size();i++){
            System.out.println(obj.get(i));
        }

    }  
}

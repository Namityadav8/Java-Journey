import java.util.*;

public class CA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        a.add("Java");
        a.add("Python");
        a.add("C++");
        System.out.println("Enter your Language :");
        String str = sc.nextLine();
        if(a.contains(str)){
            System.out.println(str);
        }else{
            System.out.println("It doesn't have it ");
        }

    }
}

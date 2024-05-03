import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating and sorting an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Scanner sc = new Scanner(System.in);
        // Searching for an element using binary search
        int key = sc.nextInt();
        int index = Collections.binarySearch(list, key);

        if (index >= 0) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the list.");
        }
    }
}

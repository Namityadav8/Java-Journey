import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>();
        obj.add(23);
        obj.add(20);
        obj.add(21);
        obj.add(22);
        obj.add(25);
       System.out.println(obj);
       obj.push(69);
       System.out.println(obj);
        while(!obj.isEmpty()){
            System.out.println(obj.pop());
        }
    
      
    }
}

// obj.pop()   returns the topmost value of the stack 
// push adds items into it 
// pop returns the top most element
//esEmpty() checks if the stack is empty or not 
// peek() returns the first element in the stack 
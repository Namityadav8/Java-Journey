/**
 * Variable_arguments
 */
public class Variable_arguments {
    static int vararg(int x,int ...a){
        int result = x ;
        for(int b : a){ // here a will take inputs of all the elements as a array but it isnt an actual array.
            result += b;
        }
       return result;
    }
    public static void main(String[] args) {
        System.out.println(vararg(1)); 
        System.out.println(vararg(2,3,4,5));
        System.out.println(vararg(3,4,5,5,6));
        
    }
}
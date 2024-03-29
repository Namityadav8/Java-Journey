// Functional interface
@FunctionalInterface
interface MyFunctionalInterface {
    void doSomething();
}

public class java_revise {
    public static void main(String[] args) {
        // Using lambda expression to implement the abstract method of the functional interface
        MyFunctionalInterface myFunc = () -> System.out.println("Doing something...");
        myFunc.doSomething(); // Output: Doing something...
    }
}

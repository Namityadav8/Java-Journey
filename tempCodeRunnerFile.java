public class practise3 {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci terms to generate
        System.out.println("Fibonacci Series:");
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}

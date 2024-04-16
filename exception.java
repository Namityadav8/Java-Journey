public class exception {
    public static void main(String[] args) {
        try {
            // Code that may throw exceptions
            int[] array = new int[5];
            array[4] = 1/0; // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            // Handle arithmetic exceptions
            System.err.println("An arithmetic exception occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds exceptions
            System.err.println("An array index out of bounds exception occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other exceptions
            System.err.println("An unexpected exception occurred: " + e.getMessage());
        }
        
    }
}

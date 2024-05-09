import java.util.Scanner;

// class InvalidProgrammingLanguageException extends Exception {
//     public InvalidProgrammingLanguageException(String message) {
//         super(message);
//     }
// }

public class CodingCompetitionEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read participant name
        System.out.print("Participant Name: ");
        String name = scanner.nextLine();

        // Read participant age
        System.out.print("Participant Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        
        // Read participant programming language
        System.out.print("Participant Programming Language: ");
        String programmingLanguage = scanner.nextLine();

        try {
            // Check age eligibility
            if (age < 16 || age > 25) {
                throw new IllegalArgumentException("Invalid Age");
            }

            // Check programming language eligibility
            if (!programmingLanguage.equalsIgnoreCase("Java") && !programmingLanguage.equalsIgnoreCase("Python") && !programmingLanguage.equalsIgnoreCase("C++")) {
                throw new Exception("Invalid Programming Language");
            }

            // Participant is eligible
            System.out.println("Participant Name: " + name);
            System.out.println("Participant Age: " + age);
            System.out.println("Participant Programming Language: " + programmingLanguage);
            System.out.println("Eligible to participate");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thanks for participating!");
        }
    }
}
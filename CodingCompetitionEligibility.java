import java.util.Scanner;

public class CodingCompetitionEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = "my name is namit";
        StringBuilder sb = new StringBuilder();
        sb.append(a);
       
        sb.insert(3,"amit ");
        System.out.println(sb);

    }
}
import java.util.Date;
import java.time.*;
public class Date_Time_ {
    public static void main(String[] args) {
        
        
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}

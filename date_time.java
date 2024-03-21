import java.time.LocalDate;
import java.time.Month;
public class date_time {
    public static void main(String[] args) {
        LocalDate a = LocalDate.now();
        System.out.println(a); // will be printing the current date and time .

        LocalDate b = LocalDate.of(1975,Month.APRIL,15);
        System.out.println(b.getDayOfYear());


        int year = b.getMonthValue();
        System.out.println(year);

        
    }
}
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
public class TimeExamples {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();                // current date
        LocalTime time = LocalTime.now();                // current time
        LocalDateTime dateTime = LocalDateTime.now();    // current date + time
        Instant timestamp = Instant.now();               // machine time (UTC)
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);
        System.out.println("Instant: " + timestamp);
    }
}
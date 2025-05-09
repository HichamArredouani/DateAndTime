import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class OwnFormatter {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        // Formaat 1: 2025-05-08
        DateTimeFormatter formatter1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(dateTime.format(formatter1));

        // Formaat 2: 08/05/2025
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dateTime.format(formatter2));

        // Formaat 3: Thursday 08 May 2025, 14:30
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy, HH:mm");
        System.out.println(dateTime.format(formatter3));
    }
}
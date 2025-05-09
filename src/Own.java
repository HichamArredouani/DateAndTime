import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.Period;

public class Own {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1953, 1, 1);

        LocalDate today = LocalDate.now();

     Period age = Period.between(birthDate, today);

        System.out.println("Birthdate: " + birthDate);
        System.out.println("Today's date: " + today);
        System.out.println("Leeftijd: " + age.getYears() + " jaar, " + age.getMonths() + " maanden en " + age.getDays() + " dagen.");
    }
}

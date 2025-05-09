import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;




public class OwnThree {
    public static void main (String[] args) {
        LocalDate startProject = LocalDate.of(2024,5, 1);
        Period duration = Period.ofDays(90);
        LocalDate endDate = startProject.plus(duration);

        long weeks = ChronoUnit.WEEKS.between(startProject, endDate);

        System.out.println("Project startDate: " + startProject);
        System.out.println("Project end date: " + endDate);
        System.out.println("Project spans: " + weeks + "weeks");
    }
}

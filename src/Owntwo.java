import java.time.LocalDateTime;
import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Owntwo {
    public static void main (String[] args) {
        LocalDateTime meetingTime = LocalDateTime.of(2024, 6, 1, 15, 0);
        LocalDateTime updatedMeetingTime = meetingTime.plusHours(2).plusMinutes(30);

        System.out.println(meetingTime);

        LocalDate a = LocalDate.of(2023, 1, 1);
        LocalDate b = LocalDate.of(2023, 2, 15);
        System.out.println(ChronoUnit.DAYS.between(a, b));
    }
}

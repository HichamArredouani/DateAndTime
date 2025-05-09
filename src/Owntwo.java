import java.time.LocalDateTime;
import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDate;

public class Owntwo {
    public static void main (String[] args) {
        LocalDateTime meetingTime = LocalDateTime.of(2024, 6, 1, 15, 0);
        LocalDateTime updatedMeetingTime = meetingTime.plusHours(2).plusMinutes(30);

        System.out.println(meetingTime);
    }
}

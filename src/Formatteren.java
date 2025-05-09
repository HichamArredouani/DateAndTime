import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Formatteren {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 5, 8);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatted = date.format(formatter);
        System.out.println("Formatted date: " + formatted); // 08/05/2025


        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy HH:mm");
        String result = now.format(formater);
        System.out.println("Datum en tijd: " + result);

        String input = "17-04-2024";
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(input, parser);
        System.out.println("Parsed: " + parsedDate); // 2024-04-17

        LocalTime time = LocalTime.of(14, 45);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(time.format(format));
    }
}

package menstrualApp;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstrualApp {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = dateFormatter.format(localDate);
        System.out.println(formattedDate);
        System.out.println(dateFormatter.format(localDate));
        System.out.println("After =========");
        LocalDate newDate = localDate.plusDays(28);
        System.out.println(dateFormatter.format(newDate));
    }
}

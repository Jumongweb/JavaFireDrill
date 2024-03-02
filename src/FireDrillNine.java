import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FireDrillNine {
    public static int returnAge(String inputDate){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDay = LocalDate.parse(inputDate, dateTimeFormatter);

        boolean dayCondition = birthDay.getDayOfMonth() == LocalDate.now().getDayOfMonth();
        boolean monthCondition = (birthDay.getMonth() == LocalDate.now().getMonth());
        if (!(dayCondition && monthCondition)) return LocalDate.now().compareTo(birthDay) - 1;

        return LocalDate.now().compareTo(birthDay);
    }

//    public static int drillEight(String userInput){
//        LocalDate dateBorn = LocalDate.parse(userInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        return Period.between(dateBorn, LocalDate.now()).getYear();
//    }
}

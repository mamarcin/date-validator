import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator {


    public boolean isValid(String date, DateTimeFormatter dateTimeFormatter) {
        try {
            LocalDate.parse(date, dateTimeFormatter);
        } catch (DateTimeParseException ex) {
            return false;
        }
        return true;
    }

}

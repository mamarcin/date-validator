import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateValidator validator = new DateValidator();

        System.out.println(validator.isValid("20210229", DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(validator.isValid("20200230", DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(validator.isValid("20200431", DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(validator.isValid("20211301", DateTimeFormatter.BASIC_ISO_DATE));

        System.out.println(validator.isValid("20210228", DateTimeFormatter.BASIC_ISO_DATE));
    }
}

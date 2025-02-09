import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ModifyFormattedDate {
    public static String modifyDate(OffsetDateTime date) {
        //Assegno ad una nuova variabile date le modifiche
        date = date.plusYears(1);
        date = date.minusMonths(1);
        date = date.plusDays(7);
        //formatto la data in Italiano
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.ITALY);

        return date.format(formatter);
    }
}

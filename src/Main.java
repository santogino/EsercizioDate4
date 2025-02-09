
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println("La data aggiornata è: " + ModifyFormattedDate.modifyDate(dateTime));
    }
}
//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        modifyDate(dateTime);
    }

    public static void modifyDate(OffsetDateTime date) {
        //Assegno ad una nuova variabile date le modifiche
        date = date.plusYears(1);
        date = date.minusMonths(1);
        date = date.plusDays(7);
        //formatto la data in Italiano
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy", Locale.ITALY);
        String ItalianFormatter = date.format(formatter);
        System.out.println("La data aggiornata è: " + ItalianFormatter);
    }
}
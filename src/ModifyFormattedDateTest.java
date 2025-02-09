import org.junit.Test;

import java.time.OffsetDateTime;

import static org.junit.Assert.*;

public class ModifyFormattedDateTest {

    @Test
    public void modifyDate() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        assertEquals("08/febbraio/2024", ModifyFormattedDate.modifyDate(dateTime));
    }
}
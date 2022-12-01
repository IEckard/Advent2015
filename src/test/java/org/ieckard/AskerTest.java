package org.ieckard;

import org.junit.jupiter.api.Test;
import static org.ieckard.Main.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AskerTest {

    @Test
    public void getsIntegerWhenWithinBoundsOfOneToTen() throws Exception {
        InputAsker asker = mock(InputAsker.class);
        when(asker.ask(anyString())).thenReturn(3);

        assertEquals(getInt(asker), 3);
    }

    @Test
    public void asksForNewIntegerWhenOutsideBoundsOfOneToTen() throws Exception {
        InputAsker asker = mock(InputAsker.class);
        when(asker.ask("Give a number between 1 and 10")).thenReturn(99);
        when(asker.ask("Wrong number, try again.")).thenReturn(3);

        getInt(asker);

        verify(asker).ask("Wrong number, try again.");
    }
}

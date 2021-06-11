
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Building;
import za.ac.cput.entity.Seat;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/* Wajedien Samuels
    216287820
 */

public class SeatFactoryTest {

    private Seat seat1;
    private Seat seat2;

    @BeforeEach
    void setUp() {
        Seat seat1 = new Seat.Builder().setSeatNo(100).build();
        seat2 = seat1;
    }

    @Test
    void testEquality(){

        assertEquals(seat2, seat1);
        System.out.println("This is equal");
    }

    @Test
    void testIdentity() {

        assertSame(seat2, seat1);
        System.out.println("This is identical");
    }

    @Test
    void testTimeout() {

        assertTimeout(Duration.ofMinutes(100), () -> {
            Thread.sleep(2000);

            System.out.println("Test Timed out");
        });
    }

    @Test
    @Disabled
    void testDisable() {

        assertEquals(seat2, seat1);
    }
}

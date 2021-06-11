
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Building;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/* Wajedien Samuels
    216287820
 */

public class BuildingFactoryTest {


    private Building building1;
    private Building building2;

    @BeforeEach
    void setUp() {
        Building building1 = new Building.Builder().setBuildCode("1000").build();
        building2 = building1;
    }

    @Test
    void testEquality(){

        assertEquals(building2, building1);
        System.out.println("This is equal");
    }

    @Test
    void testIdentity() {

        assertSame(building2, building1);
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

        assertEquals(building2, building1);
    }

}

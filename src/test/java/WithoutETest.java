import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutETest {

    private final String test1 = "Flatiron School rules!";
    private final String test2 = "YIPPEEEEE!";
    private final String test3 = "Flatiron School rocks!";

    @Disabled
    @Test
    void findETest() {
        assertEquals(1, WithoutE.findE(test1));
        assertEquals(5, WithoutE.findE(test2));
        assertEquals(0, WithoutE.findE(test3));
    }

    @Disabled
    @Test
    void withoutETest() {
        assertEquals("Flatiron School rul s!", WithoutE.withoutE(test1));
        assertEquals("YIPP     !", WithoutE.withoutE(test2));
        assertEquals("Flatiron School rocks!", WithoutE.withoutE(test3));
    }
}
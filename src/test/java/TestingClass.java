import espol.sd.Calculation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingClass {
    @Test
    public void testFindMax() {
        assertEquals(4, Calculation.findMax(new int[]{1, 3, 4, 2}));
        assertEquals(-1, Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
    }

    @Test
    public void modifiedTestFindMax() {
        assertEquals(9, Calculation.findMax(new int[]{9, -4, 7, 0}));
        assertEquals(8, Calculation.findMax(new int[]{8, 4, 8, -10}));
        assertEquals(1, Calculation.findMax(new int[]{1, -2, -9, -7}));
    }
}

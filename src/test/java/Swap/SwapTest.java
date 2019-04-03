package Swap;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Get the tests passing.
 */
public class SwapTest {
    @Ignore
    @Test
    public void testSwap() throws Exception {
        Double[] result = (Double[]) Swap.swap(0,1, 1.5, 2,3);
        Double[] expected = {2.0, 1.5, 3.0};
        Assert.assertArrayEquals(expected, result);
    }
}

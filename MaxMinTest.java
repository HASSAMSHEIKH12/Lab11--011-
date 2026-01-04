import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MaxMinTest {

    @Test
    public void testFindMax() {
        MaxMin obj = new MaxMin();
        int[] data = {12, 45, 3, 22, 89};
        assertEquals(89, obj.findMax(data));
    }

    @Test
    public void testFindMin() {
        MaxMin obj = new MaxMin();
        int[] data = {12, 45, 3, 22, 89};
        assertEquals(3, obj.findMin(data));
    }
}

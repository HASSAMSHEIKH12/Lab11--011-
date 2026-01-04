import static org.junit.Assert.*;
import org.junit.Test;

public class OddTest {

    NumberUtils obj = new NumberUtils();

    @Test
    public void testOdd() {
        assertTrue(obj.isOdd(5));
        assertFalse(obj.isOdd(4));
    }
}

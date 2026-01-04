import static org.junit.Assert.*;
import org.junit.Test;

public class EvenTest {

    NumberUtils obj = new NumberUtils();

    @Test
    public void testEven() {
        assertTrue(obj.isEven(10));
        assertFalse(obj.isEven(7));
    }
}

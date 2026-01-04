import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeTest {

    NumberUtils obj = new NumberUtils();

    @Test
    public void testPrime() {
        assertTrue(obj.isPrime(7));
        assertFalse(obj.isPrime(9));
    }
}

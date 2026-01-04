import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountATest {

    @Test
    public void testCountA() {
        JUnitTesting obj = new JUnitTesting();
        int result = obj.countA("AppleAndBanana");
        assertEquals(5, result);
    }
}


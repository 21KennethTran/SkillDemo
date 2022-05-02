import static org.junit.Assert.*;
import org.junit.*;

public class divisionTest {
    @Test
    public void divideToDouble() {
        assertEquals(2.5, division.divide(5, 2), 0.01);
    }
}

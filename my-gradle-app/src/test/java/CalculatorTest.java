import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(15, calculator.add(10, 5));
        assertEquals(5, calculator.add(-5, 10));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, calculator.multiply(10, 5));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-15, calculator.subtract(-5, 10));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(10, 5));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    public void testReverseString() {
        assertEquals("olleh", calculator.reverseString("hello"));
        assertEquals("", calculator.reverseString(""));
        assertEquals(null, calculator.reverseString(null));
    }
}

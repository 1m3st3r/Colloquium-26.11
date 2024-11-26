import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class FibonacciTest {

    @Test
    public void testGenerateFibonacci_ValidInput() {
        List<Integer> result = Fibonacci.generateFibonacci(5);
        assertEquals(List.of(0, 1, 1, 2, 3), result);
    }

    @Test
    public void testGenerateFibonacci_One() {
        List<Integer> result = Fibonacci.generateFibonacci(1);
        assertEquals(List.of(0), result);
    }

    @Test
    public void testGenerateFibonacci_Two() {
        List<Integer> result = Fibonacci.generateFibonacci(2);
        assertEquals(List.of(0, 1), result);
    }

    @Test
    public void testGenerateFibonacci_ZeroInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.generateFibonacci(0);
        });
        assertEquals("Input must be a natural number greater than 0.", exception.getMessage());
    }

    @Test
    public void testGenerateFibonacci_NegativeInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.generateFibonacci(-5);
        });
        assertEquals("Input must be a natural number greater than 0.", exception.getMessage());
    }
}

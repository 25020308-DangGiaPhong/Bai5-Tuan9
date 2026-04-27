import org.junit.jupiter.api.Test;
import static
org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        CalculatorService service = new CalculatorService();
        assertEquals(5, service.solve(2, 3, "add"));
    }
}
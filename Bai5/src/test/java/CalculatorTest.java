import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    CalculatorService service = new CalculatorService();
    @Test
    public void testAdd() {

        assertEquals(5, service.solve(2, 3, "add"));
    }
    @Test
    public void testSub() {

        assertEquals(5, service.solve(7, 2, "sub"));
    }
    @Test
    public void testMul() {

        assertEquals(6, service3.solve(2, 3, "mul"));
    }
}
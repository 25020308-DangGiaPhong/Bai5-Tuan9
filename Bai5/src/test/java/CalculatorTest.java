import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final CalculatorService service = new CalculatorService();

    @Test
    public void testAdd() {
        assertEquals(5, service.solve(2, 3, "add"), "Phép cộng phải hoạt động đúng");
    }

    @Test
    public void testSub() {
        assertEquals(1, service.solve(3, 2, "sub"), "Phép trừ phải hoạt động đúng");
    }

    @Test
    public void testMul() {
        assertEquals(6, service.solve(2, 3, "mul"), "Phép nhân phải hoạt động đúng");
    }

    @Test
    public void testDefault() {
        // Test trường hợp không khớp với bất kỳ phép toán nào để bao phủ dòng 'return 0'
        assertEquals(0, service.solve(2, 3, "unknown"), "Trường hợp không xác định phải trả về 0");
    }
}
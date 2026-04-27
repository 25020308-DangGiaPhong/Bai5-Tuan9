public class CalculatorService {
    public int solve(int a, int b, String op) {
        if (op.equals("add")) return a + b;
        if (op.equals("sub")) return a - b;
        if (op.equals("mul")) return a * b;
        return 0; // Chỗ này tí nữa ta sẽ không test để thấy coverage giảm
    }
}
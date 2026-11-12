
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SalaryCalculatorTest {

    SalaryCalculator s = new SalaryCalculator();

    // 1. PASS TEST
    @Test
    void testHRA() {
        assertEquals(6000, s.calculateHRA(30000));
    }

    // 2. FAIL TEST
    @Test
    void testDA() {
        assertEquals(5000, s.calculateDA(30000));
    }
}

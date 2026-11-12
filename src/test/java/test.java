
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    SalaryCalculator s = new SalaryCalculator();

    @Test
    void testHRA() {
        assertEquals(6000, s.calculateHRA(30000));
    }

    @Test
    void testDA() {
        assertEquals(3000, s.calculateDA(30000));
    }

    @Test
    void testGross() {
        assertEquals(39000, s.calculateGross(30000));
    }

    @Test
    void testDeduction() {
        assertEquals(1950, s.calculateDeduction(30000));
    }

    @Test
    void testNet() {
        assertEquals(37050, s.calculateNet(30000));
    }

    @Test
    void testNegativeSalary() {
        assertThrows(IllegalArgumentException.class,
                () -> s.validateSalary(-1000));
    }

    @Test
    void testZeroSalary() {
        assertEquals(0, s.calculateNet(0));
    }
}

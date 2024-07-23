import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.crido.BasicCalculator;

public class BasicCalculatorTest {
    
    @Test
    void testAdd() {
        BasicCalculator calc = new BasicCalculator();
        calc.add(2, 3);
        assertEquals(5, calc.getResult());
    }

    @Test
    void testSubtract() {
        BasicCalculator calc = new BasicCalculator();
        calc.subtract(4, 2);
        assertEquals(2, calc.getResult());
    }

    @Test
    void testMultiply() {
        BasicCalculator calc = new BasicCalculator();
        calc.multiply(5, 3);
        assertEquals(15, calc.getResult());
    }

    @Test
    void testDivide() {
        BasicCalculator calc = new BasicCalculator();
        calc.divide(10, 2);
        assertEquals(5, calc.getResult());
    }

}

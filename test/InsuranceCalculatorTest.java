import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsuranceCalculatorTest {

    @Test
    public void low(){
        assertEquals(1825, insuranceFor(5000));
    }

    @Test
    public void medium(){
        assertEquals(38600, insuranceFor(25000));
    }

    @Test
    public void high(){
        assertEquals(78500, insuranceFor(50000));
    }

    @Test
    public void veryHigh(){
        assertEquals(106400, insuranceFor(100000));
    }

    private double insuranceFor(double income){
        return new InsuranceCalculator().calculateInsurance(income);
    }

}
package pl.edu.agh.mwo.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.sum(5, 7));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(7, 2));
    }

    @Test(expected = Exception.class)
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        calc.divide(5,0);
    }

    @Test
    public void testAvg() {
        Calculator calc = new Calculator();
        calc.avg(5,0);
    }

    @Test
    public void testAvgMultiplyArgs() {
        Calculator calc = new Calculator();
        calc.avg(5, 5, 5, 0);
    }


}

package com.example.calculator;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class CalculatorTest{

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
        System.out.println("Test passed: 2 + 3 = " + result);
    }
    @Test
    public void rejectNonNumericInput() {
        Calculator calculator = new Calculator();
        assertThrows(NumberFormatException.class, () -> {
            calculator.add(Integer.parseInt("a"), 3);
        });
        System.out.println("Test passed: Non-numeric input correctly rejected");
    }

}

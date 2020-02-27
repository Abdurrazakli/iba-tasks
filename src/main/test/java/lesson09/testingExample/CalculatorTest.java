package lesson09.testingExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int a = 5;
        int b = 9;
        Calculator c = new Calculator();
        int expected = 15;
        int current = c.add(a,b);
        assertEquals(expected,current);
    }
}
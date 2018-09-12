import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumbersTest {
    FibonacciNumbers fibonacciNumbers;

    @Before
    public void prepare(){
        fibonacciNumbers = new FibonacciNumbers(5);
    }
    @Test
    public void gettersAndSettersNumberTest(){
        fibonacciNumbers.setNumber(20);
        assertEquals(20, fibonacciNumbers.getNumber());
    }
    @Test
    public void calculateNumberTest(){
        int actual = fibonacciNumbers.calculateNumber();
        assertEquals(5, actual);
    }
}

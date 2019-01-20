import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addTwoPlusFourReturnsSix() {

        // Arrange
        final int expected = 6;

        // Act
        final Calculator calc = new Calculator();
        final int actual = calc.add(2, 4);

        // Assert
        assertEquals(expected, actual);

    }

    @Test
    public void subtractTwoFromFiveReturnsThree() {

        // Arrange
        final int expected = 3;

        // Act
        final Calculator calc = new Calculator();
        final int actual = calc.subtract(5, 2);

        // Assert
        assertEquals(expected, actual);

    }

    @Test
    public void multiplyThreeTimesFourReturnsTwelve() {

        // Arrange
        final int expected = 12;

        // Act
        final Calculator calc = new Calculator();
        final int actual = calc.multiply(3, 4);

        // Assert
        assertEquals(expected, actual);

    }

    @Test
    public void divideTenByFiveReturnsTwo() {

        // Arrange
        final double expected = 2.0;

        // Act
        final Calculator calc = new Calculator();
        final double actual = calc.divide(10, 5);

        // Assert
        assertEquals(expected, actual, .1);

    }

    @Test(expected=IllegalArgumentException.class)
    public void expectExceptionWhenDivideByZero() {

        final Calculator calc = new Calculator();
        calc.divide(3, 0);

    }

    @Test
    public void divideTenByFiveReturnsInt() {

        //act
        final Calculator calc = new Calculator();
        final double actual = calc.divide(10, 5);

        // assert
        assertTrue(actual == (int) actual);
    }

    @Test
    public void divideTenByThreeReturnsDouble() {

        //act
        final Calculator calc = new Calculator();
        final double actual = calc.divide(10, 3);

        // assert
        assertFalse(actual == (int) actual);
    }



}
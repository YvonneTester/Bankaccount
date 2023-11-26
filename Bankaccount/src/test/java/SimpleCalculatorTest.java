import org.example.SimpleCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {
    SimpleCalculator calculator = new SimpleCalculator();

    @Test
    public void testAdd() {
        // Arrange

        int a = 10;
        int b = 20;
        int expectedResult = 30;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals("The add method should add two numbers", expectedResult, result);
    }


    @Test
    public void testSubtract() {
        // Arrange

        int a = 50;
        int b = 20;
        int expectedResult = 30;

        // Act

        int result = calculator.subtract(a, b);

        // Assert
        assertEquals("The subtract method should minus two numbers", expectedResult, result);
    }


    @Test
    public void testMultiply() {

        // Arrange

        int a = 12;
        int b = 3;
        int expectedResult = 36;

        // Act

        int result = calculator.multiply(a, b);

        // Assert

        assertEquals("The multiply method should X the two numbers", expectedResult, result);
    }

    @Test
    public void testDivide () {
        // Arrange

        int a = 20;
        int b = 5;
        double expectedresult = 4;

        //Act
        double result = calculator.divide(a, b);

        //Assert
        assertEquals("The divide method should divide the two numbers", expectedresult, result, 0.0001);
    }

    // 4.1.4 Ravza
    @Test
    public void testDivideThrow () {

        //Arrange
        int a = 20;
        int b = 0;

                // Act & Assert
                assertThrows(IllegalArgumentException.class, () -> {
                    calculator.divide(a, b);
                });
            }
        }




//        try {
//            // code that throws an exception
//            int divideByZero = 5 / 0;
//  System.out.println("Exception is thrown on previous line");
//        }
//        catch (ArithmeticException e) {
//            System.out.println("We got an ArithmeticException with message: " + e.getMessage());
//        }



        //assertThrows(expectedresult, result, 0,0001);
        //assertThrows("Zero can not divide", expectedresult, result);



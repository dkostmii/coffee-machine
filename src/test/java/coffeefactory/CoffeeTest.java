package coffeefactory;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CoffeeTest {

    @Test
    public void returnsRightToString() {

        // Arrange

        Coffee c = new Coffee();
        String message = "Coffee.toString() has word 'It's'";

        // Act
        boolean contains = c.toString().contains("It's");
        
        // Assert
        assertTrue(message, contains);
    }
}

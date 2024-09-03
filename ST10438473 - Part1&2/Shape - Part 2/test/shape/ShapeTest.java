/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package shape;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wesley
 */
public class ShapeTest {
    Square test = new Square();
    public ShapeTest() {
    }
    
    @Test
    public void testTrueIsCorrectSides() {
        assertTrue(test.isCorrectSides(4));
    }
    
    
    @Test
    public void testFalseIsCorrectSides() {
        assertFalse(test.isCorrectSides(6));
    }
    
}

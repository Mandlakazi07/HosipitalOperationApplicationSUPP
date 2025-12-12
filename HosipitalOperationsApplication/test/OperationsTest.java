/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hosipitaloperationsapplication;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MandlakaziS
 */
public class OperationsTest {
    
    private Operations ops;
    private int[] testData;
    
    @Before
    public void setUp() {
        // This runs before each test
        ops = new Operations();
        // Create test data: 320, 175, 380, 210, 125, 360
        testData = new int[]{320, 175, 380, 210, 125, 360};
    }
    
    @Test
    public void testTotalOperations_ReturnsValue() {
        // Test for TotalOperations method
        // Expected: 320 + 175 + 380 + 210 + 125 + 360 = 1570
        int expected = 1570;
        int actual = ops.TotalOperations(testData);
        
        assertEquals("Total operations should equal 1570", expected, actual);
    }
    
    @Test
    public void testAverageOperations_ReturnsValue() {
        // Test for AverageOperations method
        // Expected: 1570 / 6 = 261.67 (rounded to 2 decimal places)
        double expected = 261.67;
        double actual = ops.AverageOperations(testData);
        
        // Use delta for double comparison (0.01 allows small rounding differences)
        assertEquals("Average operations should equal 261.67", expected, actual, 0.01);
    }
    
    @Test
    public void testMaxOperations_ReturnsValue() {
        // Test for MaxOperations method
        // Expected: The largest number in the array is 380
        int expected = 380;
        int actual = ops.MaxOperations(testData);
        
        assertEquals("Max operations should equal 380", expected, actual);
    }
    
    @Test
    public void testMinOperations_ReturnsValue() {
        // Test for MinOperations method
        // Expected: The smallest number in the array is 125
        int expected = 125;
        int actual = ops.MinOperations(testData);
        
        assertEquals("Min operations should equal 125", expected, actual);
    }
}
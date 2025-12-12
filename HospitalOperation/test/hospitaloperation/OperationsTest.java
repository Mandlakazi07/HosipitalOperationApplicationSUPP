/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Studentvmcloudlabs
 */
package hospitaloperation;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OperationsTest {

    private Operations operations;

    @Before
    public void setUp() {
        operations = new Operations();
    }

    @Test
    public void testOperationsYearOne_ReturnsTotalOperations() {
        // Test for GetTotalOperationsForYearOne method
        // Expected: 300 + 150 + 700 = 1150
        int expected = 1150;
        int actual = operations.GetTotalOperationsForYearOne();

        assertEquals("Year 1 total operations should equal 1150", expected, actual);
    }

    @Test
    public void testOperationsYearTwo_ReturnsTotalOperations() {
        // Test for GetTotalOperationsForYearTwo method
        // Expected: 250 + 200 + 600 = 1050
        int expected = 1050;
        int actual = operations.GetTotalOperationsForYearTwo();

        assertEquals("Year 2 total operations should equal 1050", expected, actual);
    }
}

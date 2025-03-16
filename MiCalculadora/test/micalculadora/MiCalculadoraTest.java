/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package micalculadora;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author María
 */
public class MiCalculadoraTest {
    
    public MiCalculadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of cartesiano method, of class MiCalculadora.
     */
    @Test
    public void testCartesiano() {
        System.out.println("cartesiano");
        MiCalculadora instance = null;
        int expResult = 0;
        int result = instance.cartesiano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumatriple method, of class MiCalculadora.
     */
    @Test
    public void testSumatriple() {
        System.out.println("sumatriple");
        MiCalculadora instance = null;
        int expResult = 0;
        int result = instance.sumatriple();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of media method, of class MiCalculadora.
     */
    @Test
    public void testMedia() {
        System.out.println("media");
        MiCalculadora instance = null;
        float expResult = 0.0F;
        float result = instance.media();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mayordelostres method, of class MiCalculadora.
     */
    @Test
    public void testMayordelostres() {
        System.out.println("mayordelostres");
        MiCalculadora instance = null;
        int expResult = 0;
        int result = instance.mayordelostres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MiCalculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MiCalculadora.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

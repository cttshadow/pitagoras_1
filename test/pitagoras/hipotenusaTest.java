/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitagoras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class hipotenusaTest {
    
    public hipotenusaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hipotenusa method, of class hipotenusa.
     */
    @Test
    public void testHipotenusa() {
        System.out.println("hipotenusa");
        double lado = 7;
        double lado2 = 24;
        double expResult = 25;
        double result = hipotenusa.hipotenusa(lado, lado2);
        assertEquals(expResult, result, 0.0);
      
    }
    
}

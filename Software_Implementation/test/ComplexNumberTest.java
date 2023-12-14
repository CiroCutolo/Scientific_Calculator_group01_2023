/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import scientificcalculator_group01.common_resources.ComplexNumber;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Gaetano Frasca
 */
public class ComplexNumberTest {
    
    private static ComplexNumber number1;
    private static ComplexNumber n1;
    private static ComplexNumber n2;
    private static ComplexNumber n3;
    private static ComplexNumber n4;
    private static ComplexNumber n5;
    private static ComplexNumber n6;
    private static ComplexNumber n7;
    private static ComplexNumber n8;
    private static ComplexNumber n9;
    private static ComplexNumber n10;
    private static ComplexNumber n11;
    private static ComplexNumber n12;
    private static ComplexNumber n13;
    private static ComplexNumber n14;
    private static ComplexNumber n15;
    private static ComplexNumber n16;
    private static ComplexNumber n17;
    private static ComplexNumber n18;
    
    public ComplexNumberTest() {
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
     * Test of ComplexNumber method, of class ComplexNumber.
     * 
     * In questo test non viene verificata la correttezza sintattica dei parametri
     * passati al metodo, perchè si pesuppone che sia stata già testata dalla 
     * classe InputDistinguisher.
     */
    @Test
    public void testStringCostructor(){
        //test con numeri complessi con entrambe le parti non nulle
        ComplexNumber n = new ComplexNumber(4, 5);
        n1 = new ComplexNumber("4+5j");
        assertEquals(n.getA(), n1.getA());
        assertEquals(n.getB(), n1.getB());
        
        n.setA(-14); n.setB(3);
        n2 = new ComplexNumber("-14+3j");
        assertEquals(n.getA(), n2.getA());
        assertEquals(n.getB(), n2.getB());
        
        n.setA(-10); n.setB(-27);
        n3 = new ComplexNumber("-10-27j");
        assertEquals(n.getA(), n3.getA());
        assertEquals(n.getB(), n3.getB());
        
        n.setA(133); n.setB(-5);
        n4 = new ComplexNumber("+133-5j");
        assertEquals(n.getA(), n4.getA());
        assertEquals(n.getB(), n4.getB());
        
        n.setA(15.4); n.setB(-9.3);
        n5 = new ComplexNumber("15.4-9.3j");
        assertEquals(n.getA(), n5.getA());
        assertEquals(n.getB(), n5.getB());
        
        n.setA(-18.6); n.setB(-7.3);
        n6 = new ComplexNumber("-18.6-7.3j");
        assertEquals(n.getA(), n6.getA());
        assertEquals(n.getB(), n6.getB());
        
        n.setA(2); n.setB(1);
        n7 = new ComplexNumber("2+j");
        assertEquals(n.getA(), n7.getA());
        assertEquals(n.getB(), n7.getB());
        
        n.setA(2); n.setB(-1);
        n8 = new ComplexNumber("2-j");
        assertEquals(n.getA(), n8.getA());
        assertEquals(n.getB(), n8.getB());
        
        //test con numeri complessi con almeno una parte nulla
        n.setA(0); n.setB(0);
        n9 = new ComplexNumber("0+0j");
        assertEquals(n.getA(), n9.getA());
        assertEquals(n.getB(), n9.getB());
        
        n.setA(0); n.setB(0);
        n10 = new ComplexNumber("0");
        assertEquals(n.getA(), n10.getA());
        assertEquals(n.getB(), n10.getB());
        
        n.setA(0); n.setB(0);
        n11 = new ComplexNumber("0j");
        assertEquals(n.getA(), n11.getA());
        assertEquals(n.getB(), n11.getB());
        
        n.setA(7); n.setB(0);
        n12 = new ComplexNumber("7");
        assertEquals(n.getA(), n12.getA());
        assertEquals(n.getB(), n12.getB());
        
        n13 = new ComplexNumber("+7");
        assertEquals(n.getA(), n13.getA());
        assertEquals(n.getB(), n13.getB());
        
        n.setA(-7); n.setB(0);
        n14 = new ComplexNumber("-7");
        assertEquals(n.getA(), n14.getA());
        assertEquals(n.getB(), n14.getB());
        
        n.setA(0); n.setB(15.05);
        n15 = new ComplexNumber("15.05j");
        assertEquals(n.getA(), n15.getA());
        assertEquals(n.getB(), n15.getB());
        n16 = new ComplexNumber("+15.05j");
        assertEquals(n.getA(), n16.getA());
        assertEquals(n.getB(), n16.getB());
        
        n.setA(0);
        n.setB(-18.05);
        n17 = new ComplexNumber("-18.05j");
        assertEquals(n.getA(), n17.getA());
        assertEquals(n.getB(), n17.getB());
        
        //test con solo "j"
        n.setA(0);
        n.setB(1);
        n18 = new ComplexNumber("j");
        assertEquals(n.getA(), n18.getA());
        assertEquals(n.getB(), n18.getB());
    }
    
    
    /**
     * Test of toString method, of class ComplexNumber.
     */
    @Test
    public void testToString() {
        number1 = new ComplexNumber(12.4, 32);
        assertEquals("12.4+32j", number1.toString());

        number1.setA(12);
        number1.setB(-32.09);
        assertEquals("12-32.09j", number1.toString());

        number1.setA(-0.12);
        number1.setB(-3.08);
        assertEquals("-0.12-3.08j", number1.toString());

        number1.setA(-12);
        number1.setB(32);
        assertEquals("-12+32j", number1.toString());

        number1.setA(0.01);
        number1.setB(-1);
        assertEquals("0.01-1j", number1.toString());

        number1.setA(0);
        number1.setB(0);
        assertEquals("0", number1.toString());

        number1.setA(3);
        number1.setB(0);
        assertEquals("3", number1.toString());
        
        number1.setA(3.0005);
        number1.setB(0);
        assertEquals("3.0005", number1.toString());
        
        number1.setA(0);
        number1.setB(-23);
        assertEquals("-23j", number1.toString());
    }
    
}

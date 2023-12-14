/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.common_resources.ScientificCalculator;
import scientificcalculator_group01.common_resources.Variables;
import scientificcalculator_group01.exceptions.MathErrorException;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.exceptions.SyntaxErrorException;

/**
 *
 * @author Ciro Cutolo
 */
public class ScientificCalculatorTest {
    
    private static ScientificCalculator calculator;
    private static List<ComplexNumber> list;
    
    private static ComplexNumber number0;
    private static ComplexNumber number1;
    private static ComplexNumber number2;
    private static ComplexNumber number3;
    private static ComplexNumber number4;
    private static ComplexNumber number5;
    private static ComplexNumber number6;
    
    private static ComplexNumber result01;
    private static ComplexNumber result02;
    private static ComplexNumber result03;
    private static ComplexNumber result04;
    private static ComplexNumber result05;
    private static ComplexNumber result06;
    
    
    public ScientificCalculatorTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
        calculator = new ScientificCalculator();
        list = new LinkedList<>();
        
        number0 = new ComplexNumber(0,0);
        number1 = new ComplexNumber(5,2);
        number2 = new ComplexNumber(-4,-9);
        number3 = new ComplexNumber(2,-5);
        number4 = new ComplexNumber(-7,6);
        number5 = new ComplexNumber(4,0);
        number6 = new ComplexNumber(0,9);
        
        result01 = new ComplexNumber(4, 9);
        result02 = new ComplexNumber(-11, -3);
        result03 = new ComplexNumber(-37, 49);
        result04 = new ComplexNumber(-0.08, 0.14);
        result05 = new ComplexNumber(0.08, -0.14);
        result06 = new ComplexNumber(0.35, -0.2);
                
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws MathErrorException, StackErrorException, SyntaxErrorException {
        
        calculator.calculate("0");
        calculator.calculate("5+2j");
        calculator.calculate("-4-9j");
        calculator.calculate("2-5j");
        calculator.calculate("-7+6j");
        calculator.calculate("4");
        calculator.calculate("9j");
        
    }
    
    @AfterEach
    public void tearDown() throws MathErrorException, StackErrorException, SyntaxErrorException {
        
        calculator.calculate("clear");
        
    }

    /**
     * Test of getTop12Numbers method, of class ScientificCalculator.
     * Viene eseguito qui anche il test per la SaveComplexNumber, 
     * dato che gli input inseriti sono tutti numeri complessi
     */
    @Test
    public void testGetTop12Numbers() {
        
        list = calculator.getTop12Numbers();
        
        assertEquals(number0.getA(), list.get(0).getA());
        assertEquals(number0.getB(), list.get(0).getB());
        
        assertEquals(number1.getA(), list.get(1).getA());
        assertEquals(number1.getB(), list.get(1).getB());
        
        assertEquals(number2.getA(), list.get(2).getA());
        assertEquals(number2.getB(), list.get(2).getB());
        
        assertEquals(number3.getA(), list.get(3).getA());
        assertEquals(number3.getB(), list.get(3).getB());
        
        assertEquals(number4.getA(), list.get(4).getA());
        assertEquals(number4.getB(), list.get(4).getB());
        
        assertEquals(number5.getA(), list.get(5).getA());
        assertEquals(number5.getB(), list.get(5).getB());
        
        assertEquals(number6.getA(), list.get(6).getA());
        assertEquals(number6.getB(), list.get(6).getB());
        
    }


    /**
     * Test of calculateMathOperation method, of class ScientificCalculator.
     */
    @Test
    public void testCalculateMathOperation() throws Exception {
        
        calculator.calculate("+");
        list = calculator.getTop12Numbers();
        assertEquals(result01.getA(), list.get(5).getA());
        assertEquals(result01.getB(), list.get(5).getB());
        
        calculator.calculate("-");
        list = calculator.getTop12Numbers();
        assertEquals(result02.getA(), list.get(4).getA());
        assertEquals(result02.getB(), list.get(4).getB());
        
        calculator.calculate("*");
        list = calculator.getTop12Numbers();
        assertEquals(result03.getA(), list.get(3).getA());
        assertEquals(result03.getB(), list.get(3).getB());
        
        calculator.calculate("/");
        list = calculator.getTop12Numbers();
        assertEquals(result04.getA(), list.get(2).getA());
        assertEquals(result04.getB(), list.get(2).getB());
        
        calculator.calculate("+-");
        list = calculator.getTop12Numbers();
        assertEquals(result05.getA(), list.get(2).getA());
        assertEquals(result05.getB(), list.get(2).getB());
        
        calculator.calculate("sqrt");
        list = calculator.getTop12Numbers();
        assertEquals(result06.getA(), list.get(2).getA());
        assertEquals(result06.getB(), list.get(2).getB());
        
    }

    /**
     * Test of calculateStackOperation method, of class ScientificCalculator.
     */
    @Test
    public void testCalculateStackOperation() throws Exception {
        
        calculator.calculate("swap");
        list = calculator.getTop12Numbers();
        assertEquals(number5.getA(), list.get(6).getA());
        assertEquals(number5.getB(), list.get(6).getB());
        
    }

    @Test
    public void SyntaxErrorTest() throws Exception {

        SyntaxErrorException thrown;
        
        thrown = assertThrows(SyntaxErrorException.class, () -> calculator.calculate("mario"));
        thrown =  assertThrows(SyntaxErrorException.class, () -> calculator.calculate("dario"));
        thrown = assertThrows(SyntaxErrorException.class, () -> calculator.calculate("lario"));
        thrown = assertThrows(SyntaxErrorException.class, () -> calculator.calculate("wario"));
        thrown = assertThrows(SyntaxErrorException.class, () -> calculator.calculate("mendicante"));
    
    }
    
    @Test
    public void StackErrorTest() throws Exception {

        calculator.calculate("clear");
        
        StackErrorException thrown; 
        thrown = assertThrows(StackErrorException.class, () -> calculator.calculate("+"));
        thrown = assertThrows(StackErrorException.class, () -> calculator.calculate("+x"));
        thrown = assertThrows(StackErrorException.class, () -> calculator.calculate("*"));
        thrown = assertThrows(StackErrorException.class, () -> calculator.calculate("/"));
        thrown = assertThrows(StackErrorException.class, () -> calculator.calculate("swap"));
    
    }
    
    @Test
    public void MathErrorTest() throws Exception {

        calculator.calculate("0");
        
        MathErrorException thrown = assertThrows(MathErrorException.class, () -> calculator.calculate("/"));
    
    }
    
}

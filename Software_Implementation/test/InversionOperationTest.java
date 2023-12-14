/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.mathoperations;

import java.util.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.exceptions.StackErrorException;

/**
 *
 * @author ciroc
 */
public class InversionOperationTest {
    
    private static InversionOperation inversion;
    private static Stack<ComplexNumber> stack;
    
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
    private static ComplexNumber result07;
    
    public InversionOperationTest() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
        
        inversion = new InversionOperation();
        stack = new Stack<>();
        
        number0 = new ComplexNumber(0,0);
        number1 = new ComplexNumber(5,2);
        number2 = new ComplexNumber(-4,-9);
        number3 = new ComplexNumber(2,-5);
        number4 = new ComplexNumber(-7,6);
        number5 = new ComplexNumber(4,0);
        number6 = new ComplexNumber(0,9);
        
        result01 = new ComplexNumber(0, 0);
        result02 = new ComplexNumber(-5, -2);
        result03 = new ComplexNumber(4, 9);
        result04 = new ComplexNumber(-2, 5);
        result05 = new ComplexNumber(7, -6);
        result06 = new ComplexNumber(-4, 0);
        result07 = new ComplexNumber(0, -9);
        
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
     * Test of execute method, of class InversionOperation.
     */
    @Test
    public void testExecute() throws Exception {
        
        stack.clear();
        stack.push(number0);
        inversion.execute(stack);
        assertEquals(result01.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result01.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number1);
        inversion.execute(stack);
        assertEquals(result02.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result02.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number2);
        inversion.execute(stack);
        assertEquals(result03.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result03.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number3);
        inversion.execute(stack);
        assertEquals(result04.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result04.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number4);
        inversion.execute(stack);
        assertEquals(result05.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result05.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number5);
        inversion.execute(stack);
        assertEquals(result06.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result06.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number6);
        inversion.execute(stack);
        assertEquals(result07.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result07.getB(), stack.peek().getB(), 1e-15);
        
    }
    
    @Test
    public void testStackErrorExecute() throws StackErrorException{
        
        stack.clear();
        StackErrorException thrown = assertThrows(
                                     StackErrorException.class, 
                                     ()->inversion.execute(stack), "STACK ERROR EXCEPTION");
        
    }
    
    
}

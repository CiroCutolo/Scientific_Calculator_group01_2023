/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.mathoperations.SumOperation;

/**
 *
 * @author Ciro Cutolo
 */
public class SumOperationTest {
    
    private static SumOperation sum;
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
    private static ComplexNumber result08;
    private static ComplexNumber result09;
    private static ComplexNumber result10;
    private static ComplexNumber result11;
    private static ComplexNumber result12;
    private static ComplexNumber result13;
    private static ComplexNumber result14;
    private static ComplexNumber result15;
    private static ComplexNumber result16;
    private static ComplexNumber result17;
    private static ComplexNumber result18;
    private static ComplexNumber result19;
    private static ComplexNumber result20;
    private static ComplexNumber result21;
    private static ComplexNumber result22;
    private static ComplexNumber result23;
    private static ComplexNumber result24;
    private static ComplexNumber result25;
    private static ComplexNumber result26;
    private static ComplexNumber result27;
    private static ComplexNumber result28;
    
    
    public SumOperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
        sum = new SumOperation();
        stack = new Stack<>();
        
        number0 = new ComplexNumber(0,0);
        number1 = new ComplexNumber(5,2);
        number2 = new ComplexNumber(-4,-9);
        number3 = new ComplexNumber(2,-5);
        number4 = new ComplexNumber(-7,6);
        number5 = new ComplexNumber(4,0);
        number6 = new ComplexNumber(0,9);
        
        result01 = new ComplexNumber(5, 2);
        result02 = new ComplexNumber(-4, -9);
        result03 = new ComplexNumber(2, -5);
        result04 = new ComplexNumber(-7, 6);
        result05 = new ComplexNumber(4, 0);
        result06 = new ComplexNumber(0, 9);
        result07 = new ComplexNumber(1, -7);
        result08 = new ComplexNumber(7, -3);
        result09 = new ComplexNumber(-2, 8);
        result10 = new ComplexNumber(9, 2);
        result11 = new ComplexNumber(5, 11);
        result12 = new ComplexNumber(-2, -14);
        result13 = new ComplexNumber(-11, -3);
        result14 = new ComplexNumber(0, -9);
        result15 = new ComplexNumber(-4, 0);
        result16 = new ComplexNumber(-5, 1);
        result17 = new ComplexNumber(6, -5);
        result18 = new ComplexNumber(2, 4);
        result19 = new ComplexNumber(-3, 6);
        result20 = new ComplexNumber(-7, 15);
        result21 = new ComplexNumber(4, 9);
        result22 = new ComplexNumber(0, 0);
        result23 = new ComplexNumber(10, 4);
        result24 = new ComplexNumber(-8, -18);
        result25 = new ComplexNumber(4, -10);
        result26 = new ComplexNumber(-14, 12);
        result27 = new ComplexNumber(8, 0);
        result28 = new ComplexNumber(0, 18);
        
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
     * Test of execute method, of class SumOperation.
     */
    @Test
    public void testExecute() throws Exception {
        
        stack.clear();
        stack.push(number0);
        stack.push(number1);
        sum.execute(stack);
        assertEquals(result01.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result01.getB(), stack.peek().getB(), 1e-15);
    
        stack.clear();
        stack.push(number0);
        stack.push(number2);
        sum.execute(stack);
        assertEquals(result02.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result02.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number0);
        stack.push(number3);
        sum.execute(stack);
        assertEquals(result03.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result03.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number0);
        stack.push(number4);
        sum.execute(stack);
        assertEquals(result04.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result04.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number0);
        stack.push(number5);
        sum.execute(stack);
        assertEquals(result05.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result05.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number0);
        stack.push(number6);
        sum.execute(stack);
        assertEquals(result06.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result06.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number1);
        stack.push(number2);
        sum.execute(stack);
        assertEquals(result07.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result07.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number1);
        stack.push(number3);
        sum.execute(stack);
        assertEquals(result08.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result08.getB(), stack.peek().getB(), 1e-15);
    
        stack.clear();
        stack.push(number1);
        stack.push(number4);
        sum.execute(stack);
        assertEquals(result09.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result09.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number1);
        stack.push(number5);
        sum.execute(stack);
        assertEquals(result10.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result10.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number1);
        stack.push(number6);
        sum.execute(stack);
        assertEquals(result11.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result11.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number2);
        stack.push(number3);
        sum.execute(stack);
        assertEquals(result12.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result12.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number2);
        stack.push(number4);
        sum.execute(stack);
        assertEquals(result13.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result13.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number2);
        stack.push(number5);
        sum.execute(stack);
        assertEquals(result14.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result14.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number2);
        stack.push(number6);
        sum.execute(stack);
        assertEquals(result15.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result15.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number3);
        stack.push(number4);
        sum.execute(stack);
        assertEquals(result16.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result16.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number3);
        stack.push(number5);
        sum.execute(stack);
        assertEquals(result17.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result17.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number3);
        stack.push(number6);
        sum.execute(stack);
        assertEquals(result18.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result18.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number4);
        stack.push(number5);
        sum.execute(stack);
        assertEquals(result19.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result19.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number4);
        stack.push(number6);
        sum.execute(stack);
        assertEquals(result20.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result20.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number5);
        stack.push(number6);
        sum.execute(stack);
        assertEquals(result21.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result21.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number0);
        stack.push(number0);
        sum.execute(stack);
        assertEquals(result22.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result22.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number1);
        stack.push(number1);
        sum.execute(stack);
        assertEquals(result23.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result23.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number2);
        stack.push(number2);
        sum.execute(stack);
        assertEquals(result24.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result24.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number3);
        stack.push(number3);
        sum.execute(stack);
        assertEquals(result25.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result25.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number4);
        stack.push(number4);
        sum.execute(stack);
        assertEquals(result26.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result26.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number5);
        stack.push(number5);
        sum.execute(stack);
        assertEquals(result27.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result27.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        stack.push(number6);
        stack.push(number6);
        sum.execute(stack);
        assertEquals(result28.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result28.getB(), stack.peek().getB(), 1e-15);
        
    }
    
    @Test
    public void testStackErrorExecute() throws StackErrorException{
        
        stack.clear();
        StackErrorException thrown = assertThrows(
                                     StackErrorException.class, 
                                     ()->sum.execute(stack), "STACK ERROR EXCEPTION");
        
    }
    
}

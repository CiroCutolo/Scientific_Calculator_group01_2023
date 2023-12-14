/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
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
import scientificcalculator_group01.common_resources.ScientificCalculator;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.mathoperations.SqrtOperation;

/**
 *
 * @author Gaetano Frasca
 */
public class SqrtOperationTest {
    private static SqrtOperation squareRoot;
    private static Stack<ComplexNumber> stack;
    private static ScientificCalculator calculator;
    
    //numeri utilizzati per testare le operazioni
    private static ComplexNumber number0;   // numero con entrambe le parti nulle
    private static ComplexNumber number1;   // numero con entrambe le parti negative
    private static ComplexNumber number2;   // numero con entrambe le parti positive
    private static ComplexNumber number3;   // numero con parte reale negativa ed immaginaria positiva
    private static ComplexNumber number4;   // numero con parte reale positiva ed immaginaria negativa
    private static ComplexNumber number5;   // numero con parte immaginaria nulla
    private static ComplexNumber number6;   // numero con parte reale nulla
    
    //risultati attesi per i test delle operazioni
    private static ComplexNumber result0; // risultato per number 0
    private static ComplexNumber result1; // risultato per number 1
    private static ComplexNumber result2; // risultato per number 2
    private static ComplexNumber result3; // risultato per number 3
    private static ComplexNumber result4; // risultato per number 4
    private static ComplexNumber result5; // risultato per number 5
    private static ComplexNumber result6; // risultato per number 6
    
    public SqrtOperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        calculator = new ScientificCalculator();
        squareRoot = new SqrtOperation();
        stack = calculator.getComplexNumberStack();
        
        number0 = new ComplexNumber(0,0);
        number1 = new ComplexNumber(5,2);
        number2 = new ComplexNumber(-4,-9);
        number3 = new ComplexNumber(2,-5);
        number4 = new ComplexNumber(-7,6);
        number5 = new ComplexNumber(4,0);
        number6 = new ComplexNumber(0,9);
        
        result0 = new ComplexNumber(0, 0);
        result1 = new ComplexNumber(2.28, 0.44);
        result2 = new ComplexNumber(1.71, -2.63);
        result3 = new ComplexNumber(1.92, -1.3);
        result4 = new ComplexNumber(1.05, 2.85);
        result5 = new ComplexNumber(2, 0);
        result6 = new ComplexNumber(2.12, 2.12);
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

    @Test
    public void testStackErrorExecute() throws StackErrorException{
        stack.clear();
        StackErrorException thrown = assertThrows(StackErrorException.class,
                ()->squareRoot.execute(stack), "STACK ERROR");
    }
    
    /**
     * Test of execute method, of class SqrtOperation.
     */
    @Test
    public void testExecute() throws Exception {
        stack.clear();
        stack.push(number0);
        squareRoot.execute(stack);
        assertEquals(result0.getA(), stack.peek().getA());
        assertEquals(result0.getB(), stack.peek().getB());
        
        stack.clear();
        stack.push(number1);
        squareRoot.execute(stack);
        assertEquals(result1.getA(), stack.peek().getA());
        assertEquals(result1.getB(), stack.peek().getB());
        
        stack.clear();
        stack.push(number2);
        squareRoot.execute(stack);
        assertEquals(result2.getA(), stack.peek().getA());
        assertEquals(result2.getB(), stack.peek().getB());
        
        stack.clear();
        stack.push(number3);
        squareRoot.execute(stack);
        assertEquals(result3.getA(), stack.peek().getA());
        assertEquals(result3.getB(), stack.peek().getB());
        
        stack.clear();
        stack.push(number4);
        squareRoot.execute(stack);
        assertEquals(result4.getA(), stack.peek().getA());
        assertEquals(result4.getB(), stack.peek().getB());
        
        stack.clear();
        stack.push(number5);
        squareRoot.execute(stack);
        assertEquals(result5.getA(), stack.peek().getA());
        assertEquals(result5.getB(), stack.peek().getB());
        
        stack.clear();
        stack.push(number6);
        squareRoot.execute(stack);
        assertEquals(result6.getA(), stack.peek().getA());
        assertEquals(result6.getB(), stack.peek().getB());
        
    }
    
}

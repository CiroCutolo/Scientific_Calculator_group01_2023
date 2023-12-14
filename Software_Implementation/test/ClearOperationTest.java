/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package scientificcalculator_group01.stackoperations;

import java.util.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.common_resources.ScientificCalculator;

/**
 *
 * @author Gaetano Frasca
 */
public class ClearOperationTest {
    private static ClearOperation clear;
    private static Stack<ComplexNumber> stack;
    private static ScientificCalculator calculator;
    
    
    private static ComplexNumber number0;   // numero con entrambe le parti nulle
    private static ComplexNumber number1;   // numero con entrambe le parti negative
    private static ComplexNumber number2;   // numero con entrambe le parti positive
    private static ComplexNumber number3;   // numero con parte reale negativa ed immaginaria positiva
    private static ComplexNumber number4;   // numero con parte reale positiva ed immaginaria negativa
    private static ComplexNumber number5;   // numero con parte immaginaria nulla
    private static ComplexNumber number6;   // numero con parte reale nulla
    
    
    public ClearOperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        calculator = new ScientificCalculator();
        clear = new ClearOperation();
        stack = calculator.getComplexNumberStack();
        
        number0 = new ComplexNumber(0,0);
        number1 = new ComplexNumber(5,2);
        number2 = new ComplexNumber(-4,-9);
        number3 = new ComplexNumber(2,-5);
        number4 = new ComplexNumber(-7,6);
        number5 = new ComplexNumber(4,0);
        number6 = new ComplexNumber(0,9);
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
     * Test of execute method, of class ClearOperation.
     */
    @Test
    public void testExecute() {
        stack.push(number0);
        stack.push(number1);
        stack.push(number2);
        stack.push(number3);
        stack.push(number4);
        stack.push(number5);
        stack.push(number6);
        clear.execute(stack);
        assertTrue(stack.empty());
    }
    
}

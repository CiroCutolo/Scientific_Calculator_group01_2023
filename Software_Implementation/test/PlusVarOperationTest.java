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
import scientificcalculator_group01.common_resources.Variables;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.exceptions.SyntaxErrorException;
import scientificcalculator_group01.variablesoperations.PlusVarOperation;

/**
 *
 * @author Gaetano Frasca
 */
public class PlusVarOperationTest {
    
    private static PlusVarOperation plusVarOperation;
    private static Stack<ComplexNumber> stack;
    private static Variables variable;
    
    private static ComplexNumber number0;   // numero con entrambe le parti nulle
    private static ComplexNumber number1;   // numero con entrambe le parti negative
    private static ComplexNumber number2;   // numero con entrambe le parti positive
    private static ComplexNumber number3;   // numero con parte reale negativa ed immaginaria positiva
    private static ComplexNumber number4;   // numero con parte reale positiva ed immaginaria negativa
    private static ComplexNumber number5;   // numero con parte immaginaria nulla
    private static ComplexNumber number6;   // numero con parte reale nulla
    
    private static ComplexNumber result06;
    private static ComplexNumber result15;
    private static ComplexNumber result24;
    private static ComplexNumber result33;
    
    public PlusVarOperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        plusVarOperation = new PlusVarOperation();
        stack = new Stack<>();
        variable = new Variables();
        
        number0 = new ComplexNumber(0, 0);
        number1 = new ComplexNumber(3, 4);
        number2 = new ComplexNumber(-2, -1);
        number3 = new ComplexNumber(7, -8);
        number4 = new ComplexNumber(-10, 11);
        number5 = new ComplexNumber(8, 0);
        number6 = new ComplexNumber(0, -4);
        
        

        result06 = new ComplexNumber(0, -4);
        result15 = new ComplexNumber(11, 4);
        result24 = new ComplexNumber(-12, 10);
        result33 = new ComplexNumber(14, -16);
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
        variable.setVariable('a', number0);
        StackErrorException thrown = assertThrows(StackErrorException.class,
                ()->plusVarOperation.execute(variable, stack, 'a'), "STACK ERROR");
    }
    
    @Test
    public void testSyntaxErrorExecute() throws SyntaxErrorException{
        stack.push(number0);
        variable.setVariable('a', null);
        SyntaxErrorException thrown = assertThrows(SyntaxErrorException.class,
                ()->plusVarOperation.execute(variable, stack, 'a'), "SYNTAX ERROR");
    }
    
    /**
     * Test of execute method, of class PlusVarOperation.
     */
    @Test
    public void testExecute() throws Exception {
        stack.push(number3);
        stack.push(number2);
        stack.push(number1);
        stack.push(number0);
        
        variable.setVariable('a', number6);
        variable.setVariable('b', number5);
        variable.setVariable('c', number4);
        variable.setVariable('d', number3);
        
        plusVarOperation.execute(variable, stack, 'a');
        stack.pop();
        
        plusVarOperation.execute(variable, stack, 'b');
        stack.pop();
        
        plusVarOperation.execute(variable, stack, 'c');
        stack.pop();
        
        plusVarOperation.execute(variable, stack, 'd');
        stack.pop();
        
        assertEquals(result06.getA(),variable.getVariable('a').getA());
        assertEquals(result06.getB(),variable.getVariable('a').getB());
        
        assertEquals(result15.getA(),variable.getVariable('b').getA());
        assertEquals(result15.getB(),variable.getVariable('b').getB());
        
        assertEquals(result24.getA(),variable.getVariable('c').getA());
        assertEquals(result24.getB(),variable.getVariable('c').getB());
        
        assertEquals(result33.getA(),variable.getVariable('d').getA());
        assertEquals(result33.getB(),variable.getVariable('d').getB());
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.variablesoperations;

import java.util.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.common_resources.Variables;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.exceptions.SyntaxErrorException;


/**
 *
 * @author ciroc
 */
public class GetFromVarOperationTest {
    
    private static GetFromVarOperation getFromVar;
    private static Stack<ComplexNumber> stack;
    private static Variables variables;
    
    private static ComplexNumber number0;
    private static ComplexNumber number1;
    private static ComplexNumber number2;
    private static ComplexNumber number3;
    private static ComplexNumber number4;
    private static ComplexNumber number5;
    private static ComplexNumber number6;
    
    public GetFromVarOperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
        getFromVar = new GetFromVarOperation();
        stack = new Stack<>();
        variables = new Variables();
        
        
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
     * Test of execute method, of class GetFromVarOperation.
     */
    @Test
    public void testExecute() throws Exception {

        variables.setVariable('a', number0);
        variables.setVariable('b', number1);
        variables.setVariable('c', number2);
        variables.setVariable('d', number3);
        variables.setVariable('e', number4);
        variables.setVariable('f', number5);
        variables.setVariable('g', number6);
        variables.setVariable('h', number0);
        variables.setVariable('i', number1);
        variables.setVariable('j', number2);
        variables.setVariable('k', number3);
        variables.setVariable('l', number4);
        variables.setVariable('m', number5);
        variables.setVariable('n', number6);
        variables.setVariable('o', number0);
        variables.setVariable('p', number1);
        variables.setVariable('q', number2);
        variables.setVariable('r', number3);
        variables.setVariable('s', number4);
        variables.setVariable('t', number5);
        variables.setVariable('u', number6);
        variables.setVariable('v', number0);
        variables.setVariable('w', number1);
        variables.setVariable('x', number2);
        variables.setVariable('y', number3);
        variables.setVariable('z', number4);
        
        
        stack.clear();
        getFromVar.execute(variables, stack, 'a');
        assertEquals(number0.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number0.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'b');
        assertEquals(number1.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number1.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'c');
        assertEquals(number2.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number2.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'd');
        assertEquals(number3.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number3.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'e');
        assertEquals(number4.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number4.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'f');
        assertEquals(number5.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number5.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'g');
        assertEquals(number6.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number6.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'h');
        assertEquals(number0.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number0.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'i');
        assertEquals(number1.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number1.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'j');
        assertEquals(number2.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number2.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'k');
        assertEquals(number3.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number3.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'l');
        assertEquals(number4.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number4.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'm');
        assertEquals(number5.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number5.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'n');
        assertEquals(number6.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number6.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'o');
        assertEquals(number0.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number0.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'p');
        assertEquals(number1.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number1.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'q');
        assertEquals(number2.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number2.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'r');
        assertEquals(number3.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number3.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 's');
        assertEquals(number4.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number4.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 't');
        assertEquals(number5.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number5.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'u');
        assertEquals(number6.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number6.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'v');
        assertEquals(number0.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number0.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'w');
        assertEquals(number1.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number1.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'x');
        assertEquals(number2.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number2.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'y');
        assertEquals(number3.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number3.getB(), stack.peek().getB(), 1e-15);
        
        stack.clear();
        getFromVar.execute(variables, stack, 'z');
        assertEquals(number4.getA(), stack.peek().getA(), 1e-15);
        assertEquals(number4.getB(), stack.peek().getB(), 1e-15);
        
    }
    
    
}

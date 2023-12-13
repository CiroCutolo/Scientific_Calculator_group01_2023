package test;

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
import scientificcalculator_group01.variablesoperations.SaveIntoVarOperation;

/**
 *
 * @author Aurora Campione
 */
public class SaveIntoVarOperationTest {
    private static SaveIntoVarOperation saveIntoVar;
    private static ComplexNumber number0;
    private static ComplexNumber number1;
    private static ComplexNumber number2;
    private static ComplexNumber number3;
    private static ComplexNumber number4;
    private static ComplexNumber number5;
    private static ComplexNumber number6;
    private static Stack<ComplexNumber> stack;
    private static Variables variable;
    
    public SaveIntoVarOperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        saveIntoVar = new SaveIntoVarOperation();
        stack = new Stack<>();
        variable = new Variables();
        
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
     * Test of execute method, of class SaveIntoVarOperation.
     * @throws scientificcalculator_group01.exceptions.StackErrorException
     */
    
    @Test
    public void testStackErrorExecute() throws StackErrorException {
        stack.clear();
        StackErrorException thrown = assertThrows(
                StackErrorException.class,
                ()->saveIntoVar.execute(variable,stack, 'a'), "STACK ERROR");
    }
    
    @Test
    public void testExecute() throws Exception {
        //test per tutte le possibili variabili 

        stack.push(number0);
        saveIntoVar.execute(variable, stack, 'a');
        assertEquals(number0.getA(), variable.getVariable('a').getA());
        assertEquals(number0.getB(), variable.getVariable('a').getB());
        
        stack.push(number1);
        saveIntoVar.execute(variable, stack, 'b');
        assertEquals(number1.getA(), variable.getVariable('b').getA());
        assertEquals(number1.getB(), variable.getVariable('b').getB());

        
        stack.push(number2);
        saveIntoVar.execute(variable, stack, 'c');
        assertEquals(number2.getA(), variable.getVariable('c').getA());
        assertEquals(number2.getB(), variable.getVariable('c').getB());
        
        stack.push(number3);
        saveIntoVar.execute(variable, stack, 'd');
        assertEquals(number3.getA(), variable.getVariable('d').getA());
        assertEquals(number3.getB(), variable.getVariable('d').getB());
        
        stack.push(number4);
        saveIntoVar.execute(variable, stack, 'e');
        assertEquals(number4.getA(), variable.getVariable('e').getA());
        assertEquals(number4.getB(), variable.getVariable('e').getB());
        
        stack.push(number5);
        saveIntoVar.execute(variable, stack, 'f');
        assertEquals(number5.getA(), variable.getVariable('f').getA());
        assertEquals(number5.getB(), variable.getVariable('f').getB());
        
        stack.push(number6);
        saveIntoVar.execute(variable, stack, 'g');
        assertEquals(number6.getA(), variable.getVariable('g').getA());
        assertEquals(number6.getB(), variable.getVariable('g').getB());
        
        stack.push(number0);
        saveIntoVar.execute(variable, stack, 'h');
        assertEquals(number0.getA(), variable.getVariable('h').getA());
        assertEquals(number0.getB(), variable.getVariable('h').getB());
        
        stack.push(number1);
        saveIntoVar.execute(variable, stack, 'i');
        assertEquals(number1.getA(), variable.getVariable('i').getA());
        assertEquals(number1.getB(), variable.getVariable('i').getB());
        
        stack.push(number2);
        saveIntoVar.execute(variable, stack, 'j');
        assertEquals(number2.getA(), variable.getVariable('j').getA());
        assertEquals(number2.getB(), variable.getVariable('j').getB());
        
        stack.push(number3);
        saveIntoVar.execute(variable, stack, 'k');
        assertEquals(number3.getA(), variable.getVariable('k').getA());
        assertEquals(number3.getB(), variable.getVariable('k').getB());
        
        stack.push(number4);
        saveIntoVar.execute(variable, stack, 'l');
        assertEquals(number4.getA(), variable.getVariable('l').getA());
        assertEquals(number4.getB(), variable.getVariable('l').getB());
        
        stack.push(number5);
        saveIntoVar.execute(variable, stack, 'm');
        assertEquals(number5.getA(), variable.getVariable('m').getA());
        assertEquals(number5.getB(), variable.getVariable('m').getB());
        
        stack.push(number6);
        saveIntoVar.execute(variable, stack, 'n');
        assertEquals(number6.getA(), variable.getVariable('n').getA());
        assertEquals(number6.getB(), variable.getVariable('n').getB());
        
        stack.push(number0);
        saveIntoVar.execute(variable, stack, 'o');
        assertEquals(number0.getA(), variable.getVariable('o').getA());
        assertEquals(number0.getB(), variable.getVariable('o').getB());
        
        stack.push(number1);
        saveIntoVar.execute(variable, stack, 'p');
        assertEquals(number1.getA(), variable.getVariable('p').getA());
        assertEquals(number1.getB(), variable.getVariable('p').getB());
        
        stack.push(number2);
        saveIntoVar.execute(variable, stack, 'q');
        assertEquals(number2.getA(), variable.getVariable('q').getA());
        assertEquals(number2.getB(), variable.getVariable('q').getB());
        
        stack.push(number3);
        saveIntoVar.execute(variable, stack, 'r');
        assertEquals(number3.getA(), variable.getVariable('r').getA());
        assertEquals(number3.getB(), variable.getVariable('r').getB());
        
        stack.push(number4);
        saveIntoVar.execute(variable, stack, 's');
        assertEquals(number4.getA(), variable.getVariable('s').getA());
        assertEquals(number4.getB(), variable.getVariable('s').getB());
        
        stack.push(number5);
        saveIntoVar.execute(variable, stack, 't');
        assertEquals(number5.getA(), variable.getVariable('t').getA());
        assertEquals(number5.getB(), variable.getVariable('t').getB());
        
        stack.push(number6);
        saveIntoVar.execute(variable, stack, 'u');
        assertEquals(number6.getA(), variable.getVariable('u').getA());
        assertEquals(number6.getB(), variable.getVariable('u').getB());
        
        stack.push(number0);
        saveIntoVar.execute(variable, stack, 'v');
        assertEquals(number0.getA(), variable.getVariable('v').getA());
        assertEquals(number0.getB(), variable.getVariable('v').getB());
        
        stack.push(number1);
        saveIntoVar.execute(variable, stack, 'w');
        assertEquals(number1.getA(), variable.getVariable('w').getA());
        assertEquals(number1.getB(), variable.getVariable('w').getB());
        
        stack.push(number2);
        saveIntoVar.execute(variable, stack, 'x');
        assertEquals(number2.getA(), variable.getVariable('x').getA());
        assertEquals(number2.getB(), variable.getVariable('x').getB());
        
        stack.push(number3);
        saveIntoVar.execute(variable, stack, 'y');
        assertEquals(number3.getA(), variable.getVariable('y').getA());
        assertEquals(number3.getB(), variable.getVariable('y').getB());
        
        stack.push(number4);
        saveIntoVar.execute(variable, stack, 'z');
        assertEquals(number4.getA(), variable.getVariable('z').getA());
        assertEquals(number4.getB(), variable.getVariable('z').getB());
    }
    
}

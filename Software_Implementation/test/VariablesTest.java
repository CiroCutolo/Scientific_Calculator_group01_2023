/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.common_resources;

import java.util.Stack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import scientificcalculator_group01.mathoperations.InversionOperation;
import scientificcalculator_group01.mathoperations.SumOperation;

/**
 *
 * @author ciroc
 */
public class VariablesTest {
    
    private static InversionOperation inversion;
    private static Variables variable;
    
    private static ComplexNumber number0;
    private static ComplexNumber number1;
    private static ComplexNumber number2;
    private static ComplexNumber number3;
    private static ComplexNumber number4;
    private static ComplexNumber number5;
    private static ComplexNumber number6;
    
    public VariablesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
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
     * Test of getVariable and setVariables methods, joint, of class Variables.
     */
    @Test
    public void testGetAndSetVariable() {
        
        variable.setVariable('a', number0);
        variable.setVariable('b', number1);
        variable.setVariable('c', number2);
        variable.setVariable('d', number3);
        variable.setVariable('e', number4);
        variable.setVariable('f', number5);
        variable.setVariable('g', number6);
        variable.setVariable('h', number0);
        variable.setVariable('i', number1);
        variable.setVariable('j', number2);
        variable.setVariable('k', number3);
        variable.setVariable('l', number4);
        variable.setVariable('m', number5);
        variable.setVariable('n', number6);
        variable.setVariable('o', number0);
        variable.setVariable('p', number1);
        variable.setVariable('q', number2);
        variable.setVariable('r', number3);
        variable.setVariable('s', number4);
        variable.setVariable('t', number5);
        variable.setVariable('u', number6);
        variable.setVariable('v', number0);
        variable.setVariable('w', number1);
        variable.setVariable('x', number2);
        variable.setVariable('y', number3);
        variable.setVariable('z', number4);

        assertEquals(number0, variable.getVariable('a'));
        assertEquals(number1, variable.getVariable('b'));
        assertEquals(number2, variable.getVariable('c'));
        assertEquals(number3, variable.getVariable('d'));
        assertEquals(number4, variable.getVariable('e'));
        assertEquals(number5, variable.getVariable('f'));
        assertEquals(number6, variable.getVariable('g'));
        assertEquals(number0, variable.getVariable('h'));
        assertEquals(number1, variable.getVariable('i'));
        assertEquals(number2, variable.getVariable('j'));
        assertEquals(number3, variable.getVariable('k'));
        assertEquals(number4, variable.getVariable('l'));
        assertEquals(number5, variable.getVariable('m'));
        assertEquals(number6, variable.getVariable('n'));
        assertEquals(number0, variable.getVariable('o'));
        assertEquals(number1, variable.getVariable('p'));
        assertEquals(number2, variable.getVariable('q'));
        assertEquals(number3, variable.getVariable('r'));
        assertEquals(number4, variable.getVariable('s'));
        assertEquals(number5, variable.getVariable('t'));
        assertEquals(number6, variable.getVariable('u'));
        assertEquals(number0, variable.getVariable('v'));
        assertEquals(number1, variable.getVariable('w'));
        assertEquals(number2, variable.getVariable('x'));
        assertEquals(number3, variable.getVariable('y'));
        assertEquals(number4, variable.getVariable('z'));
        
    }

    
}

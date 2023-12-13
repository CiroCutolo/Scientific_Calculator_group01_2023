
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
import scientificcalculator_group01.common_resources.Variables;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.exceptions.SyntaxErrorException;

/**
 *
 * @author giuli
 */
public class MinusVarOperationTest {
    private static MinusVarOperation minusVariable;
    //numeri utilizzati per il test 
    private static ComplexNumber number0;
    private static ComplexNumber number1;
    private static ComplexNumber number2;
    private static ComplexNumber number3;
    private static ComplexNumber number4;
    private static ComplexNumber number5;
    private static ComplexNumber number6;

    //risultati attesi
    private static ComplexNumber result30;
    private static ComplexNumber result41;
    private static ComplexNumber result52;
    private static ComplexNumber result63;

    private static Stack<ComplexNumber> stack;
    private static Variables variable;
    
    public MinusVarOperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        
        //assegno ai numeri complessi dei valori
        number0 = new ComplexNumber(0,0);
        number1 = new ComplexNumber(5,2);
        number2 = new ComplexNumber(-4,-9);
        number3 = new ComplexNumber(2,-5);
        number4 = new ComplexNumber(-7,6);
        number5 = new ComplexNumber(4,0);
        number6 = new ComplexNumber(0,9);
        variable = new Variables();
        stack = new Stack<>();
        minusVariable = new MinusVarOperation();
        
        //assegno i risultati attesi delle varie combinazioni di numeri
        result30 = new ComplexNumber(2, -5);
        result41 = new ComplexNumber(-12, 4);
        result52 = new ComplexNumber(8, 9);
        result63 = new ComplexNumber(-2, 14);
        
        
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
     * Test of execute method, of class MinusVarOperation.
     */
    //gestisco il caso in cui è presente una variabile null nella mappa ed eseguo la "-x" per controllare che l'eccezione venga lanciata.
    @Test
    public void testSyntaxErrorExecute() throws SyntaxErrorException{
        stack.clear();
        stack.push(number0);
        SyntaxErrorException thrown = assertThrows(
            SyntaxErrorException.class,
            () -> minusVariable.execute(variable, stack , 'a'), "SYNTAX ERROR");
    }
    //gestisco il caso in cui all'interno dello stack non ci sia un numero che permette l'esecuzione della sottrazione con la variabile.
    @Test
    public void testStackErrorExecute() throws StackErrorException{
        stack.clear();
        StackErrorException thrown = assertThrows(
            StackErrorException.class,
            () -> minusVariable.execute(variable, stack , 'a'), "STACK ERROR");
    }
    @Test
    public void testExecute() throws Exception {
        //eseguo una serie di execute senza sollevare eccezioni e successivamente confronto la parte reale del risultato atteso con la parte reale del risultato
        //calcolato mentre la parte complessa del risultato atteso con la parte complessa del risultato calcolato.
        stack.push(number3);
        stack.push(number2);
        stack.push(number1);
        stack.push(number0);
        variable.setVariable('a', number3);
        variable.setVariable('b', number4);
        variable.setVariable('c', number5);
        variable.setVariable('d', number6);
        
        
        minusVariable.execute(variable, stack, 'a');
        stack.pop();
        minusVariable.execute(variable, stack, 'b');
        stack.pop();
        minusVariable.execute(variable, stack, 'c');
        stack.pop();
        minusVariable.execute(variable, stack, 'd');
        stack.pop();
        
      
        assertEquals(result30.getA(), variable.getVariable('a').getA());
        assertEquals(result30.getB(), variable.getVariable('a').getB());
       
        assertEquals(result41.getA(), variable.getVariable('b').getA());
        assertEquals(result41.getB(), variable.getVariable('b').getB());

        assertEquals(result52.getA(), variable.getVariable('c').getA());
        assertEquals(result52.getB(), variable.getVariable('c').getB());
        
        assertEquals(result63.getA(), variable.getVariable('d').getA());
        assertEquals(result63.getB(), variable.getVariable('d').getB());
    }
    
}

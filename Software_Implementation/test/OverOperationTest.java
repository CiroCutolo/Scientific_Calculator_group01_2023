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
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.stackoperations.OverOperation;


/**
 *
 * @author Claudia Carucci
 */
public class OverOperationTest {
    private static OverOperation over;
    private static Stack<ComplexNumber> stack;

    //numeri utilizzati per il test 
    private static ComplexNumber number0;
    private static ComplexNumber number1;
    private static ComplexNumber number2;
    
    public OverOperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        over = new OverOperation();
        stack = new Stack<>();
        
        //assegno ai numeri complessi dei valori
        number0 = new ComplexNumber(0,0);
        number1 = new ComplexNumber(5,2);
        number2 = new ComplexNumber(-4,-9);
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
     * Test of execute method, of class OverOperation.
     */
    //gestisco il caso in cui è presente un unico elemento nello stack ed eseguo l'over per controllare che l'eccezione venga lanciata.
    @Test
    public void testStackErrorExecute() throws StackErrorException{
        stack.clear();
        stack.push(number0);
        StackErrorException thrown = assertThrows(
            StackErrorException.class,
            () -> over.execute(stack), "STACK ERROR");
    }
    
    @Test
    public void testExecute() throws Exception {
        //eseguo una serie di inserimenti e successivamente dopo aver eseguito l'over controllo che l'ulitmo elemento sia uguale al penultimo elemento inserito.
        stack.push(number0);
        stack.push(number1);
        stack.push(number2);
        over.execute(stack);
        assertEquals(number1, stack.pop());
        assertEquals(number2, stack.pop());
        assertEquals(number1, stack.pop());
        
    }
    
}


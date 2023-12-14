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
import scientificcalculator_group01.mathoperations.DifferenceOperation;

/**
 *
 * @author Gaetano Frasca
 */
public class DifferenceOperationTest {
    private static DifferenceOperation difference;
    private static Stack<ComplexNumber> stack;
    
    //numeri utilizzati per testare le operazioni
    private static ComplexNumber number0;   // numero con entrambe le parti nulle
    private static ComplexNumber number1;   // numero con entrambe le parti negative
    private static ComplexNumber number2;   // numero con entrambe le parti positive
    private static ComplexNumber number3;   // numero con parte reale negativa ed immaginaria positiva
    private static ComplexNumber number4;   // numero con parte reale positiva ed immaginaria negativa
    private static ComplexNumber number5;   // numero con parte immaginaria nulla
    private static ComplexNumber number6;   // numero con parte reale nulla
    
    //risultati attesi per i test delle operazioni
    private static ComplexNumber result00; // risultato per number 0 e 1
    private static ComplexNumber result01; // risultato per number 0 e 1
    private static ComplexNumber result02; // risultato per number 0 e 2
    private static ComplexNumber result03; // risultato per number 0 e 3
    private static ComplexNumber result04; // risultato per number 0 e 4
    private static ComplexNumber result05; // risultato per number 0 e 5
    private static ComplexNumber result06; // risultato per number 0 e 6
    private static ComplexNumber result11; // risultato per number 1 e 1
    private static ComplexNumber result12; // risultato per number 1 e 2
    private static ComplexNumber result13; // risultato per number 1 e 3
    private static ComplexNumber result14; // risultato per number 1 e 4
    private static ComplexNumber result15; // risultato per number 1 e 5
    private static ComplexNumber result16; // risultato per number 1 e 6
    private static ComplexNumber result22; // risultato per number 2 e 2
    private static ComplexNumber result23; // risultato per number 2 e 3
    private static ComplexNumber result24; // risultato per number 2 e 4
    private static ComplexNumber result25; // risultato per number 2 e 5
    private static ComplexNumber result26; // risultato per number 2 e 6
    private static ComplexNumber result33; // risultato per number 3 e 3
    private static ComplexNumber result34; // risultato per number 3 e 4
    private static ComplexNumber result35; // risultato per number 3 e 5
    private static ComplexNumber result36; // risultato per number 3 e 6
    private static ComplexNumber result44; // risultato per number 4 e 4
    private static ComplexNumber result45; // risultato per number 4 e 5
    private static ComplexNumber result46; // risultato per number 4 e 6
    private static ComplexNumber result55; // risultato per number 5 e 5
    private static ComplexNumber result56; // risultato per number 5 e 6
    private static ComplexNumber result66; // risultato per number 6 e 6
    private static ComplexNumber result10; // risultato per number 1 e 0
    private static ComplexNumber result20; // risultato per number 2 e 0
    private static ComplexNumber result30; // risultato per number 3 e 0
    private static ComplexNumber result40; // risultato per number 4 e 0
    private static ComplexNumber result50; // risultato per number 5 e 0
    private static ComplexNumber result60; // risultato per number 6 e 0
    private static ComplexNumber result21; // risultato per number 2 e 1
    private static ComplexNumber result31; // risultato per number 3 e 1
    private static ComplexNumber result41; // risultato per number 4 e 1
    private static ComplexNumber result51; // risultato per number 5 e 1
    private static ComplexNumber result61; // risultato per number 6 e 1
    private static ComplexNumber result32; // risultato per number 3 e 2
    private static ComplexNumber result42; // risultato per number 4 e 2
    private static ComplexNumber result52; // risultato per number 5 e 2
    private static ComplexNumber result62; // risultato per number 6 e 2
    private static ComplexNumber result43; // risultato per number 4 e 3
    private static ComplexNumber result53; // risultato per number 5 e 3
    private static ComplexNumber result63; // risultato per number 6 e 3
    private static ComplexNumber result54; // risultato per number 5 e 4
    private static ComplexNumber result64; // risultato per number 6 e 4
    private static ComplexNumber result65; // risultato per number 6 e 5
    
    public DifferenceOperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        difference = new DifferenceOperation();
        stack = new Stack<>();
        
        number0 = new ComplexNumber(0,0);
        number1 = new ComplexNumber(5,2);
        number2 = new ComplexNumber(-4,-9);
        number3 = new ComplexNumber(2,-5);
        number4 = new ComplexNumber(-7,6);
        number5 = new ComplexNumber(4,0);
        number6 = new ComplexNumber(0,9);
        
        result00 = new ComplexNumber(0, 0);
        result01 = new ComplexNumber(-5, -2);
        result02 = new ComplexNumber(4, 9);
        result03 = new ComplexNumber(-2, 5);
        result04 = new ComplexNumber(7, -6);
        result05 = new ComplexNumber(-4, 0);
        result06 = new ComplexNumber(0, -9);
        result11 = new ComplexNumber(0, 0);
        result12 = new ComplexNumber(9, 11);
        result13 = new ComplexNumber(3, 7);
        result14 = new ComplexNumber(12, -4);
        result15 = new ComplexNumber(1, 2);
        result16 = new ComplexNumber(5, -7);
        result22 = new ComplexNumber(0, 0);
        result23 = new ComplexNumber(-6, -4);
        result24 = new ComplexNumber(3, -15);
        result25 = new ComplexNumber(-8, -9);
        result26 = new ComplexNumber(-4, -18);
        result33 = new ComplexNumber(0, 0);
        result34 = new ComplexNumber(9, -11);
        result35 = new ComplexNumber(-2, -5);
        result36 = new ComplexNumber(2, -14);
        result44 = new ComplexNumber(0, 0);
        result45 = new ComplexNumber(-11, 6);
        result46 = new ComplexNumber(-7, -3);
        result55 = new ComplexNumber(0, 0);
        result56 = new ComplexNumber(4, -9);
        result66 = new ComplexNumber(0, 0);
        result10 = new ComplexNumber(5, 2);
        result20 = new ComplexNumber(-4, -9);
        result30 = new ComplexNumber(2, -5);
        result40 = new ComplexNumber(-7, 6);
        result50 = new ComplexNumber(4, 0);
        result60 = new ComplexNumber(0,9);
        result21 = new ComplexNumber(-9, -11);
        result31 = new ComplexNumber(-3, -7);
        result41 = new ComplexNumber(-12, 4);
        result51 = new ComplexNumber(-1, -2);
        result61 = new ComplexNumber(-5, 7);
        result32 = new ComplexNumber(6, 4);
        result42 = new ComplexNumber(-3, 15);
        result52 = new ComplexNumber(8, 9);
        result62 = new ComplexNumber(4, 18);
        result43 = new ComplexNumber(-9, 11);
        result53 = new ComplexNumber(2, 5);
        result63 = new ComplexNumber(-2, 14);
        result54 = new ComplexNumber(11, -6);
        result64 = new ComplexNumber(7, 3);
        result65 = new ComplexNumber(-4, 9);
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
        stack.push(number0);
        StackErrorException thrown = assertThrows(StackErrorException.class,
                ()->difference.execute(stack), "STACK ERROR");
    }
    
    /**
     * Test of execute method, of class DifferenceOperation.
     */
    @Test
    public void testExecute() throws StackErrorException {
        // TODO review the generated test code and remove the default call to fail.
        
        stack.clear();
        stack.push(number0);
        stack.push(number0);
        difference.execute(stack);
        assertEquals(result00.getA(), stack.peek().getA());
        assertEquals(result00.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number0);
        stack.push(number1);
        difference.execute(stack);
        assertEquals(result01.getA(), stack.peek().getA());
        assertEquals(result01.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number0);
        stack.push(number2);
        difference.execute(stack);
        assertEquals(result02.getA(), stack.peek().getA());
        assertEquals(result02.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number0);
        stack.push(number3);
        difference.execute(stack);
        assertEquals(result03.getA(), stack.peek().getA());
        assertEquals(result03.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number0);
        stack.push(number4);
        difference.execute(stack);
        assertEquals(result04.getA(), stack.peek().getA());
        assertEquals(result04.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number0);
        stack.push(number5);
        difference.execute(stack);
        assertEquals(result05.getA(), stack.peek().getA());
        assertEquals(result05.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number0);
        stack.push(number6);
        difference.execute(stack);
        assertEquals(result06.getA(), stack.peek().getA());
        assertEquals(result06.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number1);
        difference.execute(stack);
        assertEquals(result11.getA(), stack.peek().getA());
        assertEquals(result11.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number2);
        difference.execute(stack);
        assertEquals(result12.getA(), stack.peek().getA());
        assertEquals(result12.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number3);
        difference.execute(stack);
        assertEquals(result13.getA(), stack.peek().getA());
        assertEquals(result13.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number4);
        difference.execute(stack);
        assertEquals(result14.getA(), stack.peek().getA());
        assertEquals(result14.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number5);
        difference.execute(stack);
        assertEquals(result15.getA(), stack.peek().getA());
        assertEquals(result15.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number6);
        difference.execute(stack);
        assertEquals(result16.getA(), stack.peek().getA());
        assertEquals(result16.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number2);
        stack.push(number2);
        difference.execute(stack);
        assertEquals(result22.getA(), stack.peek().getA());
        assertEquals(result22.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number2);
        stack.push(number3);
        difference.execute(stack);
        assertEquals(result23.getA(), stack.peek().getA());
        assertEquals(result23.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number2);
        stack.push(number4);
        difference.execute(stack);
        assertEquals(result24.getA(), stack.peek().getA());
        assertEquals(result24.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number2);
        stack.push(number5);
        difference.execute(stack);
        assertEquals(result25.getA(), stack.peek().getA());
        assertEquals(result25.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number2);
        stack.push(number6);
        difference.execute(stack);
        assertEquals(result26.getA(), stack.peek().getA());
        assertEquals(result26.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number3);
        stack.push(number3);
        difference.execute(stack);
        assertEquals(result33.getA(), stack.peek().getA());
        assertEquals(result33.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number3);
        stack.push(number4);
        difference.execute(stack);
        assertEquals(result34.getA(), stack.peek().getA());
        assertEquals(result34.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number3);
        stack.push(number5);
        difference.execute(stack);
        assertEquals(result35.getA(), stack.peek().getA());
        assertEquals(result35.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number3);
        stack.push(number6);
        difference.execute(stack);
        assertEquals(result36.getA(), stack.peek().getA());
        assertEquals(result36.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number4);
        stack.push(number4);
        difference.execute(stack);
        assertEquals(result44.getA(), stack.peek().getA());
        assertEquals(result44.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number4);
        stack.push(number5);
        difference.execute(stack);
        assertEquals(result45.getA(), stack.peek().getA());
        assertEquals(result45.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number4);
        stack.push(number6);
        difference.execute(stack);
        assertEquals(result46.getA(), stack.peek().getA());
        assertEquals(result46.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number5);
        stack.push(number5);
        difference.execute(stack);
        assertEquals(result55.getA(), stack.peek().getA());
        assertEquals(result55.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number5);
        stack.push(number6);
        difference.execute(stack);
        assertEquals(result56.getA(), stack.peek().getA());
        assertEquals(result56.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number6);
        stack.push(number6);
        difference.execute(stack);
        assertEquals(result66.getA(), stack.peek().getA());
        assertEquals(result66.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number0);
        difference.execute(stack);
        assertEquals(result10.getA(), stack.peek().getA());
        assertEquals(result10.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number2);
        stack.push(number0);
        difference.execute(stack);
        assertEquals(result20.getA(), stack.peek().getA());
        assertEquals(result20.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number3);
        stack.push(number0);
        difference.execute(stack);
        assertEquals(result30.getA(), stack.peek().getA());
        assertEquals(result30.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number4);
        stack.push(number0);
        difference.execute(stack);
        assertEquals(result40.getA(), stack.peek().getA());
        assertEquals(result40.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number5);
        stack.push(number0);
        difference.execute(stack);
        assertEquals(result50.getA(), stack.peek().getA());
        assertEquals(result50.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number6);
        stack.push(number0);
        difference.execute(stack);
        assertEquals(result60.getA(), stack.peek().getA());
        assertEquals(result60.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number2);
        stack.push(number1);
        difference.execute(stack);
        assertEquals(result21.getA(), stack.peek().getA());
        assertEquals(result21.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number3);
        stack.push(number1);
        difference.execute(stack);
        assertEquals(result31.getA(), stack.peek().getA());
        assertEquals(result31.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number4);
        stack.push(number1);
        difference.execute(stack);
        assertEquals(result41.getA(), stack.peek().getA());
        assertEquals(result41.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number5);
        stack.push(number1);
        difference.execute(stack);
        assertEquals(result51.getA(), stack.peek().getA());
        assertEquals(result51.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number6);
        stack.push(number1);
        difference.execute(stack);
        assertEquals(result61.getA(), stack.peek().getA());
        assertEquals(result61.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number3);
        stack.push(number2);
        difference.execute(stack);
        assertEquals(result32.getA(), stack.peek().getA());
        assertEquals(result32.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number4);
        stack.push(number2);
        difference.execute(stack);
        assertEquals(result42.getA(), stack.peek().getA());
        assertEquals(result42.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number5);
        stack.push(number2);
        difference.execute(stack);
        assertEquals(result52.getA(), stack.peek().getA());
        assertEquals(result52.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number6);
        stack.push(number2);
        difference.execute(stack);
        assertEquals(result62.getA(), stack.peek().getA());
        assertEquals(result62.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number4);
        stack.push(number3);
        difference.execute(stack);
        assertEquals(result43.getA(), stack.peek().getA());
        assertEquals(result43.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number5);
        stack.push(number3);
        difference.execute(stack);
        assertEquals(result53.getA(), stack.peek().getA());
        assertEquals(result53.getB(), stack.peek().getB());
        
        stack.clear();
        stack.push(number6);
        stack.push(number3);
        difference.execute(stack);
        assertEquals(result63.getA(), stack.peek().getA());
        assertEquals(result63.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number5);
        stack.push(number4);
        difference.execute(stack);
        assertEquals(result54.getA(), stack.peek().getA());
        assertEquals(result54.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number6);
        stack.push(number4);
        difference.execute(stack);
        assertEquals(result64.getA(), stack.peek().getA());
        assertEquals(result64.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number6);
        stack.push(number5);
        difference.execute(stack);
        assertEquals(result65.getA(), stack.peek().getA());
        assertEquals(result65.getB(), stack.peek().getB());
        
        
        
    }
    
}

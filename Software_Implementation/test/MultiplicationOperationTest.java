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
import scientificcalculator_group01.mathoperations.MultiplicationOperation;


/**
 *
 * @author Claudia Carucci
 */
public class MultiplicationOperationTest {
    private static MultiplicationOperation multiplication;
    private static Stack<ComplexNumber> stack;
    
    //numeri utilizzati per il test 
    private static ComplexNumber number0;
    private static ComplexNumber number1;
    private static ComplexNumber number2;
    private static ComplexNumber number3;
    private static ComplexNumber number4;
    private static ComplexNumber number5;
    private static ComplexNumber number6;
    
    //risultati attesi
    private static ComplexNumber result00;
    private static ComplexNumber result01;
    private static ComplexNumber result02;
    private static ComplexNumber result03;
    private static ComplexNumber result04;
    private static ComplexNumber result05;
    private static ComplexNumber result06;
    private static ComplexNumber result11;
    private static ComplexNumber result12;
    private static ComplexNumber result13;
    private static ComplexNumber result14;
    private static ComplexNumber result15;
    private static ComplexNumber result16;
    private static ComplexNumber result22;
    private static ComplexNumber result23;
    private static ComplexNumber result24;
    private static ComplexNumber result25;
    private static ComplexNumber result26;
    private static ComplexNumber result33;
    private static ComplexNumber result34;
    private static ComplexNumber result35;
    private static ComplexNumber result36;
    private static ComplexNumber result44;
    private static ComplexNumber result45;
    private static ComplexNumber result46;
    private static ComplexNumber result55;
    private static ComplexNumber result56;
    private static ComplexNumber result66;
    
    
    
    
    public MultiplicationOperationTest() {
        
    }
    @BeforeAll
    public static void initStack() {
       multiplication = new MultiplicationOperation();
        stack = new Stack<ComplexNumber>();
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
        
        //assegno i risultati attesi delle varie combinazioni di numeri
        result00 = new ComplexNumber(0,0);
        result01 = new ComplexNumber(0,0);
        result02 = new ComplexNumber(0,0);
        result03 = new ComplexNumber(0,0);
        result04 = new ComplexNumber(0,0);
        result05 = new ComplexNumber(0,0);
        result06 = new ComplexNumber(0,0);
        
        result11 = new ComplexNumber(21,20);
        result12 = new ComplexNumber(-2,-53);
        result13 = new ComplexNumber(20,-21);
        result14 = new ComplexNumber(-47,16);
        result15 = new ComplexNumber(20,8);
        result16 = new ComplexNumber(-18,45);
        
        result22 = new ComplexNumber(-65,72);
        result23 = new ComplexNumber(-53,2);
        result24 = new ComplexNumber(82,39);
        result25 = new ComplexNumber(-16,-36);
        result26 = new ComplexNumber(81,-36);
        
        result33 = new ComplexNumber(-21,-20);
        result34 = new ComplexNumber(16,47);
        result35 = new ComplexNumber(8,-20);
        result36 = new ComplexNumber(45,18);
        
        result44 = new ComplexNumber(13,-84);
        result45 = new ComplexNumber(-28,24);
        result46 = new ComplexNumber(-54,-63);
        
        result55 = new ComplexNumber(16,0);
        result56 = new ComplexNumber(0,36);
        
        result66 = new ComplexNumber(-81,0);
           
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
     * Test of execute method, of class MultiplicationOperation.
     */
    //gestisco il caso in cui è presente un unico elemento nello stack ed eseguo la moltiplicazione per controllare che l'eccezione venga lanciata.
    @Test
    public void testStackErrorExecute() throws StackErrorException{
        stack.clear();
        stack.push(number0);
        StackErrorException thrown = assertThrows(
            StackErrorException.class,
            () -> multiplication.execute(stack), "STACK ERROR");
    }
    
    @Test
    public void testExecute() throws Exception {
        //eseguo una serie di moltiplicazioni senza sollevare eccezioni e successivamente confronto la parte reale del risultato atteso con la parte reale del risultato
        //calcolato mentre la parte complessa del risultato atteso con la parte complessa del risultato calcolato.
        stack.clear();
        stack.push(number0);
        stack.push(number0);
        multiplication.execute(stack);
        assertEquals(result00.getA(), stack.peek().getA());
        assertEquals(result00.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number0);
        stack.push(number1);
        multiplication.execute(stack);
        assertEquals(result01.getA(), stack.peek().getA());
        assertEquals(result01.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number0);
        stack.push(number2);
        multiplication.execute(stack);
        assertEquals(result02.getA(), stack.peek().getA());
        assertEquals(result02.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number0);
        stack.push(number3);
        multiplication.execute(stack);
        assertEquals(result03.getA(), stack.peek().getA());
        assertEquals(result03.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number0);
        stack.push(number4);
        multiplication.execute(stack);
        assertEquals(result04.getA(), stack.peek().getA(),1e-15);
        assertEquals(result04.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number0);
        stack.push(number5);
        multiplication.execute(stack);
        assertEquals(result05.getA(), stack.peek().getA());
        assertEquals(result05.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number0);
        stack.push(number6);
        multiplication.execute(stack);
        assertEquals(result06.getA(), stack.peek().getA());
        assertEquals(result06.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number1);
        multiplication.execute(stack);
        assertEquals(result11.getA(), stack.peek().getA());
        assertEquals(result11.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number2);
        multiplication.execute(stack);
        assertEquals(result12.getA(), stack.peek().getA());
        assertEquals(result12.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number3);
        multiplication.execute(stack);
        assertEquals(result13.getA(), stack.peek().getA());
        assertEquals(result13.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number4);
        multiplication.execute(stack);
        assertEquals(result14.getA(), stack.peek().getA());
        assertEquals(result14.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number5);
        multiplication.execute(stack);
        assertEquals(result15.getA(), stack.peek().getA());
        assertEquals(result15.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number1);
        stack.push(number6);
        multiplication.execute(stack);
        assertEquals(result16.getA(), stack.peek().getA());
        assertEquals(result16.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number2);
        stack.push(number2);
        multiplication.execute(stack);
        assertEquals(result22.getA(), stack.peek().getA());
        assertEquals(result22.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number2);
        stack.push(number3);
        multiplication.execute(stack);
        assertEquals(result23.getA(), stack.peek().getA());
        assertEquals(result23.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number2);
        stack.push(number4);
        multiplication.execute(stack);
        assertEquals(result24.getA(), stack.peek().getA());
        assertEquals(result24.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number2);
        stack.push(number5);
        multiplication.execute(stack);
        assertEquals(result25.getA(), stack.peek().getA());
        assertEquals(result25.getB(), stack.peek().getB());
        
        stack.clear();
        stack.push(number2);
        stack.push(number6);
        multiplication.execute(stack);
        assertEquals(result26.getA(), stack.peek().getA());
        assertEquals(result26.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number3);
        stack.push(number3);
        multiplication.execute(stack);
        assertEquals(result33.getA(), stack.peek().getA());
        assertEquals(result33.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number3);
        stack.push(number4);
        multiplication.execute(stack);
        assertEquals(result34.getA(), stack.peek().getA());
        assertEquals(result34.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number3);
        stack.push(number5);
        multiplication.execute(stack);
        assertEquals(result35.getA(), stack.peek().getA());
        assertEquals(result35.getB(), stack.peek().getB());
        
        stack.clear();
        stack.push(number3);
        stack.push(number6);
        multiplication.execute(stack);
        assertEquals(result36.getA(), stack.peek().getA());
        assertEquals(result36.getB(), stack.peek().getB());
        
        stack.clear();
        stack.push(number4);
        stack.push(number4);
        multiplication.execute(stack);
        assertEquals(result44.getA(), stack.peek().getA());
        assertEquals(result44.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number4);
        stack.push(number5);
        multiplication.execute(stack);
        assertEquals(result45.getA(), stack.peek().getA());
        assertEquals(result45.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number4);
        stack.push(number6);
        multiplication.execute(stack);
        assertEquals(result46.getA(), stack.peek().getA());
        assertEquals(result46.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number5);
        stack.push(number5);
        multiplication.execute(stack);
        assertEquals(result55.getA(), stack.peek().getA());
        assertEquals(result55.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number5);
        stack.push(number6);
        multiplication.execute(stack);
        assertEquals(result56.getA(), stack.peek().getA());
        assertEquals(result56.getB(), stack.peek().getB());

        stack.clear();
        stack.push(number6);
        stack.push(number6);
        multiplication.execute(stack);
        assertEquals(result66.getA(), stack.peek().getA());
        assertEquals(result66.getB(), stack.peek().getB());
    }
    
}

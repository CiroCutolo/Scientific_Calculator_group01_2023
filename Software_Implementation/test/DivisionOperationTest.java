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
import scientificcalculator_group01.exceptions.MathErrorException;
import scientificcalculator_group01.exceptions.StackErrorException;

/**
 *
 * @author Aurora Campione
 */
public class DivisionOperationTest {
    private static DivisionOperation division;
    private static Stack<ComplexNumber> stack;

    //numeri da utilizzare per testare le operazioni
    private static ComplexNumber number0; // numero con entrambe le parti nulle
    private static ComplexNumber number1; // numero con entrambe le parti positive
    private static ComplexNumber number2; // numero con entrambe le parti negative
    private static ComplexNumber number3; // numero con parte reale positiva e parte immaginaria negativa 
    private static ComplexNumber number4; // numero con parte reale negativa e parte immaginaria positiva 
    private static ComplexNumber number5; // numero con la sola parte reale
    private static ComplexNumber number6; // numero con la sola parte immaginaria
    
    // tutti i possibili risultati della divisione
    private static ComplexNumber result01; // risultato dei numeri 0 e 1
    private static ComplexNumber result02; // risultato dei numeri 0 e 2
    private static ComplexNumber result03; // risultato dei numeri 0 e 3
    private static ComplexNumber result04; // risultato dei numeri 0 e 4
    private static ComplexNumber result05; // risultato dei numeri 0 e 5
    private static ComplexNumber result06; // risultato dei numeri 0 e 6
    private static ComplexNumber result11; // risultato dei numeri 1 e 1
    private static ComplexNumber result12; // risultato dei numeri 1 e 2
    private static ComplexNumber result13; // risultato dei numeri 1 e 3
    private static ComplexNumber result14; // risultato dei numeri 1 e 4
    private static ComplexNumber result15; // risultato dei numeri 1 e 5
    private static ComplexNumber result16; // risultato dei numeri 1 e 6
    private static ComplexNumber result22; // risultato dei numeri 2 e 2
    private static ComplexNumber result23; // risultato dei numeri 2 e 3
    private static ComplexNumber result24; // risultato dei numeri 2 e 4
    private static ComplexNumber result25; // risultato dei numeri 2 e 5
    private static ComplexNumber result26; // risultato dei numeri 2 e 6
    private static ComplexNumber result33; // risultato dei numeri 3 e 3
    private static ComplexNumber result34; // risultato dei numeri 3 e 4
    private static ComplexNumber result35; // risultato dei numeri 3 e 5   
    private static ComplexNumber result36; // risultato dei numeri 3 e 6
    private static ComplexNumber result44; // risultato dei numeri 4 e 4 
    private static ComplexNumber result45; // risultato dei numeri 4 e 5
    private static ComplexNumber result46; // risultato dei numeri 4 e 6
    private static ComplexNumber result55; // risultato dei numeri 5 e 5
    private static ComplexNumber result56; // risultato dei numeri 5 e 6
    private static ComplexNumber result66; // risultato dei numeri 6 e 6
    private static ComplexNumber result00; // risultato dei numeri 0 e 0
    private static ComplexNumber result10; // risultato dei numeri 1 e 0
    private static ComplexNumber result20; // risultato dei numeri 2 e 0
    private static ComplexNumber result30; // risultato dei numeri 3 e 0
    private static ComplexNumber result40; // risultato dei numeri 4 e 0
    private static ComplexNumber result50; // risultato dei numeri 5 e 0
    private static ComplexNumber result60; // risultato dei numeri 6 e 0
    private static ComplexNumber result21; // risultato dei numeri 2 e 1
    private static ComplexNumber result31; // risultato dei numeri 3 e 1
    private static ComplexNumber result41; // risultato dei numeri 4 e 1
    private static ComplexNumber result51; // risultato dei numeri 5 e 1
    private static ComplexNumber result61; // risultato dei numeri 6 e 1
    private static ComplexNumber result32; // risultato dei numeri 3 e 2
    private static ComplexNumber result42; // risultato dei numeri 4 e 2
    private static ComplexNumber result52; // risultato dei numeri 5 e 2
    private static ComplexNumber result62; // risultato dei numeri 6 e 2
    private static ComplexNumber result43; // risultato dei numeri 4 e 3
    private static ComplexNumber result53; // risultato dei numeri 5 e 3
    private static ComplexNumber result63; // risultato dei numeri 6 e 3
    private static ComplexNumber result54; // risultato dei numeri 5 e 4
    private static ComplexNumber result64; // risultato dei numeri 6 e 4
    private static ComplexNumber result65; // risultato dei numeri 6 e 5
    
    public DivisionOperationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        division = new DivisionOperation();
        stack = new Stack<>();
        
        number0 = new ComplexNumber(0,0);
        number1 = new ComplexNumber(5,2);
        number2 = new ComplexNumber(-4,-9);
        number3 = new ComplexNumber(2,-5);
        number4 = new ComplexNumber(-7,6);
        number5 = new ComplexNumber(4,0);
        number6 = new ComplexNumber(0,9);
        

        result01 = new ComplexNumber(0, 0);
        result02 = new ComplexNumber(0, 0);
        result03 = new ComplexNumber(0, 0);
        result04 = new ComplexNumber(0, 0);
        result05 = new ComplexNumber(0, 0);
        result06 = new ComplexNumber(0, 0);
        result11 = new ComplexNumber(1, 0);
        result12 = new ComplexNumber(-0.39, 0.38);
        result13 = new ComplexNumber(0, 1);
        result14 = new ComplexNumber(-0.27, -0.52);
        result15 = new ComplexNumber(1.25, 0.5);
        result16 = new ComplexNumber(0.22, -0.56);
        result22 = new ComplexNumber(1, 0);
        result23 = new ComplexNumber(1.28, -1.31);
        result24 = new ComplexNumber(-0.31, 1.02);
        result25 = new ComplexNumber(-1, -2.25);
        result26 = new ComplexNumber(-1, 0.44);
        result33 = new ComplexNumber(1, 0);
        result34 = new ComplexNumber(-0.52, 0.27);
        result35 = new ComplexNumber(0.5, -1.25);
        result36 = new ComplexNumber(-0.56, -0.22);
        result44 = new ComplexNumber(1, 0);
        result45 = new ComplexNumber(-1.75, 1.5);
        result46 = new ComplexNumber(0.67, 0.78);
        result55 = new ComplexNumber(1, 0);
        result56 = new ComplexNumber(0, -0.44);
        result66 = new ComplexNumber(1, 0);
        
        result00 = new ComplexNumber(Double.NaN, Double.NaN);
        result10 = new ComplexNumber(Double.NaN, Double.NaN);
        result20 = new ComplexNumber(Double.NaN, Double.NaN);
        result30 = new ComplexNumber(Double.NaN, Double.NaN);
        result40 = new ComplexNumber(Double.NaN, Double.NaN);
        result50 = new ComplexNumber(Double.NaN, 0);
        result60 = new ComplexNumber(0, Double.NaN);
        
        result21 = new ComplexNumber(-1.31, -1.28);
        result31 = new ComplexNumber(0, -1);
        result41 = new ComplexNumber(-0.79, 1.52);
        result51 = new ComplexNumber(0.69, -0.28);
        result61 = new ComplexNumber(0.62, 1.55);
        result32 = new ComplexNumber(0.38, 0.39);
        result42 = new ComplexNumber(-0.27, -0.90);
        result52 = new ComplexNumber(-0.16, 0.37);
        result62 = new ComplexNumber(-0.84, -0.37);
        result43 = new ComplexNumber(-1.52, -0.79);
        result53 = new ComplexNumber(0.28, 0.69);
        result63 = new ComplexNumber(-1.55, 0.62);
        result54 = new ComplexNumber(-0.33, -0.28);
        result64 = new ComplexNumber(0.64, -0.74);
        result65 = new ComplexNumber(0, 2.25);

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
     * Test of execute method, of class DivisionOperation.
     * @throws scientificcalculator_group01.exceptions.StackErrorException
     */
    
    @Test
    public void testStackErrorExecute() throws StackErrorException {
        stack.clear();
        stack.push(number0);
        StackErrorException thrown = assertThrows(
                StackErrorException.class,
                ()->division.execute(stack), "STACK ERROR");
    }
    
    @Test
    public void testMathErrorExecute() throws MathErrorException {
        
        MathErrorException thrown;
        stack.clear();
        stack.push(number0);
        stack.push(number0);
        thrown = assertThrows(
                MathErrorException.class,
                ()->division.execute(stack), "MATH ERROR");
        
        stack.clear();
        stack.push(number1);
        stack.push(number0);
        thrown = assertThrows(
                MathErrorException.class,
                ()->division.execute(stack), "MATH ERROR");
        
        stack.clear();
        stack.push(number2);
        stack.push(number0);
        thrown = assertThrows(
                MathErrorException.class,
                ()->division.execute(stack), "MATH ERROR");
        
        stack.clear();
        stack.push(number3);
        stack.push(number0);
        thrown = assertThrows(
                MathErrorException.class,
                ()->division.execute(stack), "MATH ERROR");
        
        stack.clear();
        stack.push(number4);
        stack.push(number0);
        thrown = assertThrows(
                MathErrorException.class,
                ()->division.execute(stack), "MATH ERROR");
        
        stack.clear();
        stack.push(number5);
        stack.push(number0);
        thrown = assertThrows(
                MathErrorException.class,
                ()->division.execute(stack), "MATH ERROR");
        
        stack.clear();
        stack.push(number6);
        stack.push(number0);
        thrown = assertThrows(
                MathErrorException.class,
                ()->division.execute(stack), "MATH ERROR");
        
    }
    
    @Test
    public void testExecute() throws Exception {
        
        stack.clear();
        stack.push(number0);
        stack.push(number1);
        division.execute(stack);
        assertEquals(result01.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result01.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number0);
        stack.push(number2);
        division.execute(stack);
        assertEquals(result02.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result02.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number0);
        stack.push(number3);
        division.execute(stack);
        assertEquals(result03.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result03.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number0);
        stack.push(number4);
        division.execute(stack);
        assertEquals(result04.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result04.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number0);
        stack.push(number5);
        division.execute(stack);
        assertEquals(result05.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result05.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number0);
        stack.push(number6);
        division.execute(stack);
        assertEquals(result06.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result06.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number1);
        stack.push(number1);
        division.execute(stack);
        assertEquals(result11.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result11.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number1);
        stack.push(number2);
        division.execute(stack);
        assertEquals(result12.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result12.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number1);
        stack.push(number3);
        division.execute(stack);
        assertEquals(result13.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result13.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number1);
        stack.push(number4);
        division.execute(stack);
        assertEquals(result14.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result14.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number1);
        stack.push(number5);
        division.execute(stack);
        assertEquals(result15.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result15.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number1);
        stack.push(number6);
        division.execute(stack);
        assertEquals(result16.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result16.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number2);
        stack.push(number2);
        division.execute(stack);
        assertEquals(result22.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result22.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number2);
        stack.push(number3);
        division.execute(stack);
        assertEquals(result23.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result23.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number2);
        stack.push(number4);
        division.execute(stack);
        assertEquals(result24.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result24.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number2);
        stack.push(number5);
        division.execute(stack);
        assertEquals(result25.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result25.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number2);
        stack.push(number6);
        division.execute(stack);
        assertEquals(result26.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result26.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number3);
        stack.push(number3);
        division.execute(stack);
        assertEquals(result33.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result33.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number3);
        stack.push(number4);
        division.execute(stack);
        assertEquals(result34.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result34.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number3);
        stack.push(number5);
        division.execute(stack);
        assertEquals(result35.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result35.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number3);
        stack.push(number6);
        division.execute(stack);
        assertEquals(result36.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result36.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number4);
        stack.push(number4);
        division.execute(stack);
        assertEquals(result44.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result44.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number4);
        stack.push(number5);
        division.execute(stack);
        assertEquals(result45.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result45.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number4);
        stack.push(number6);
        division.execute(stack);
        assertEquals(result46.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result46.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number5);
        stack.push(number5);
        division.execute(stack);
        assertEquals(result55.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result55.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number5);
        stack.push(number6);
        division.execute(stack);
        assertEquals(result56.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result56.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number6);
        stack.push(number6);
        division.execute(stack);
        assertEquals(result66.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result66.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number2);
        stack.push(number1);
        division.execute(stack);
        assertEquals(result21.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result21.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number3);
        stack.push(number1);
        division.execute(stack);
        assertEquals(result31.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result31.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number4);
        stack.push(number1);
        division.execute(stack);
        assertEquals(result41.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result41.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number5);
        stack.push(number1);
        division.execute(stack);
        assertEquals(result51.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result51.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number6);
        stack.push(number1);
        division.execute(stack);
        assertEquals(result61.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result61.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number3);
        stack.push(number2);
        division.execute(stack);
        assertEquals(result32.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result32.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number4);
        stack.push(number2);
        division.execute(stack);
        assertEquals(result42.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result42.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number5);
        stack.push(number2);
        division.execute(stack);
        assertEquals(result52.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result52.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number6);
        stack.push(number2);
        division.execute(stack);
        assertEquals(result62.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result62.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number4);
        stack.push(number3);
        division.execute(stack);
        assertEquals(result43.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result43.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number5);
        stack.push(number3);
        division.execute(stack);
        assertEquals(result53.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result53.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number6);
        stack.push(number3);
        division.execute(stack);
        assertEquals(result63.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result63.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number5);
        stack.push(number4);
        division.execute(stack);
        assertEquals(result54.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result54.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number6);
        stack.push(number4);
        division.execute(stack);
        assertEquals(result64.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result64.getB(), stack.peek().getB(), 1e-15);

        stack.clear();
        stack.push(number6);
        stack.push(number5);
        division.execute(stack);
        assertEquals(result65.getA(), stack.peek().getA(), 1e-15);
        assertEquals(result65.getB(), stack.peek().getB(), 1e-15);
        
    }
    
}

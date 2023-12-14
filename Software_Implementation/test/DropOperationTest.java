/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import scientificcalculator_group01.stackoperations.DropOperation;

/**
 *
 * @author Ciro Cutolo
 */
public class DropOperationTest {

    private static DropOperation drop;
    private static Stack<ComplexNumber> stack;

    private static ComplexNumber number0;
    private static ComplexNumber number1;
    private static ComplexNumber number2;
    private static ComplexNumber number3;
    private static ComplexNumber number4;
    private static ComplexNumber number5;
    private static ComplexNumber number6;

    public DropOperationTest() {
    }

    @BeforeAll
    public static void setUpClass() {

        drop = new DropOperation();
        stack = new Stack<>();

        number0 = new ComplexNumber(0, 0);
        number1 = new ComplexNumber(5, 2);
        number2 = new ComplexNumber(-4, -9);
        number3 = new ComplexNumber(2, -5);
        number4 = new ComplexNumber(-7, 6);
        number5 = new ComplexNumber(4, 0);
        number6 = new ComplexNumber(0, 9);

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
     * Test of execute method, of class DropOperation.
     */
    @Test
    public void testExecute() throws Exception {

        stack.clear();
        stack.push(number0);
        stack.push(number1);
        drop.execute(stack);
        assertEquals(number0, stack.peek());

        stack.clear();
        stack.push(number1);
        stack.push(number2);
        drop.execute(stack);
        assertEquals(number1, stack.peek());

        stack.clear();
        stack.push(number2);
        stack.push(number3);
        drop.execute(stack);
        assertEquals(number2, stack.peek());

        stack.clear();
        stack.push(number3);
        stack.push(number4);
        drop.execute(stack);
        assertEquals(number3, stack.peek());

        stack.clear();
        stack.push(number4);
        stack.push(number5);
        drop.execute(stack);
        assertEquals(number4, stack.peek());

        stack.clear();
        stack.push(number5);
        stack.push(number6);
        drop.execute(stack);
        assertEquals(number5, stack.peek());

        stack.clear();
        stack.push(number6);
        stack.push(number0);
        drop.execute(stack);
        assertEquals(number6, stack.peek());

    }

    @Test
    public void testStackErrorExecute() throws StackErrorException {

        stack.clear();
        StackErrorException thrown = assertThrows(
                StackErrorException.class,
                () -> drop.execute(stack), "STACK ERROR EXCEPTION");

    }

}

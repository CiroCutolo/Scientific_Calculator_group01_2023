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
import scientificcalculator_group01.stackoperations.DupOperation;

/**
 *
 * @author Aurora Campione
 */
public class DupOperationTest {
    private static DupOperation dup;
    private static Stack<ComplexNumber> stack;

    private static ComplexNumber number0;
    private static ComplexNumber number1;
    private static ComplexNumber number2;

    public DupOperationTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        dup = new DupOperation();
        stack = new Stack<>();

        number0 = new ComplexNumber(0, 0);
        number1 = new ComplexNumber(5, 2);
        number2 = new ComplexNumber(-4, -9);
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
     * Test of execute method, of class DupOperation.
     * 
     * @throws scientificcalculator_group01.exceptions.StackErrorException
     */

    @Test
    public void testStackErrorExecute() throws StackErrorException {
        stack.clear();
        StackErrorException thrown = assertThrows(
                StackErrorException.class,
                () -> dup.execute(stack), "STACK ERROR");
    }

    @Test
    public void testExecute() throws Exception {
        stack.push(number0);
        stack.push(number1);
        stack.push(number2);
        dup.execute(stack);
        assertEquals(number2, stack.pop());
        assertEquals(number2, stack.pop());
    }

}

package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import scientificcalculator_group01.exceptions.SyntaxErrorException;

/**
 *
 * @author Aurora Campione
 */
public class InputDistinguisherTest {
    private static InputDistinguisher inputD;
    
    
    public InputDistinguisherTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        inputD = new InputDistinguisher();
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
     * Test of isComplexNumber method, of class InputDistinguisher.
     * @throws scientificcalculator_group01.exceptions.SyntaxErrorException
     */
    
    @Test
    public void testIsComplexNumber() throws SyntaxErrorException{
        //casi di default con valori positivi e negativi sia per la parte immaginaria che per la parte complessa
        assertTrue(inputD.isComplexNumber("2+5j"));
        assertTrue(inputD.isComplexNumber("-10+5j"));
        assertTrue(inputD.isComplexNumber("-10-25j"));

        assertTrue(inputD.isComplexNumber("+123-7j"));
        assertTrue(inputD.isComplexNumber("12.3-7.3j"));
        assertTrue(inputD.isComplexNumber("-12.3-7.3j"));
        assertTrue(inputD.isComplexNumber("2+j"));
        assertTrue(inputD.isComplexNumber("2-j"));

        //una delle due parti è nulla
        assertTrue(inputD.isComplexNumber("0+0j"));
        assertTrue(inputD.isComplexNumber("0"));
        assertTrue(inputD.isComplexNumber("0j"));
        assertTrue(inputD.isComplexNumber("3"));
        assertTrue(inputD.isComplexNumber("+3"));
        assertTrue(inputD.isComplexNumber("-3"));
        assertTrue(inputD.isComplexNumber("12.05j"));
        assertTrue(inputD.isComplexNumber("+12.05j"));
        assertTrue(inputD.isComplexNumber("-12.05j"));

        //stringa che contiene solo la lettera per la parte immaginaria
        assertTrue(inputD.isComplexNumber("j"));

        //input non riconosciuti 
        assertFalse(inputD.isComplexNumber("12a"));
        assertFalse(inputD.isComplexNumber("4-50i"));
        assertFalse(inputD.isComplexNumber("ciao"));
        assertFalse(inputD.isComplexNumber("3+-2"));
        assertFalse(inputD.isComplexNumber("3+-2i"));
        assertFalse(inputD.isComplexNumber("-3-+212i"));
        assertFalse(inputD.isComplexNumber("3a+212j"));
        assertFalse(inputD.isComplexNumber("a2+24j"));
        assertFalse(inputD.isComplexNumber("aj"));
    }

    /**
     * Test of isStackOperation method, of class InputDistinguisher.
     * @throws scientificcalculator_group01.exceptions.SyntaxErrorException
     */
    @Test
    public void testIsStackOperation() throws SyntaxErrorException {
        //operazioni accettate 
        assertTrue(inputD.isStackOperation("clear"));
        assertTrue(inputD.isStackOperation("drop"));
        assertTrue(inputD.isStackOperation("swap"));
        assertTrue(inputD.isStackOperation("over"));
        assertTrue(inputD.isStackOperation("dup"));
        
        //input non riconosciuti
        assertFalse(inputD.isStackOperation("clearclear"));
        assertFalse(inputD.isStackOperation("dropdrop"));
        assertFalse(inputD.isStackOperation("swapswap"));
        assertFalse(inputD.isStackOperation("overover"));
        assertFalse(inputD.isStackOperation("dupdup"));    
        
    }

    /**
     * Test of isMathOperation method, of class InputDistinguisher.
     * @throws scientificcalculator_group01.exceptions.SyntaxErrorException
     */
    @Test
    public void testIsMathOperation() throws SyntaxErrorException {
        //operazioni accettate
        assertTrue(inputD.isMathOperation("+"));
        assertTrue(inputD.isMathOperation("-"));
        assertTrue(inputD.isMathOperation("*"));
        assertTrue(inputD.isMathOperation("/"));
        assertTrue(inputD.isMathOperation("+-"));
        assertTrue(inputD.isMathOperation("sqrt"));

        // unrecognized operations.
        assertFalse(inputD.isMathOperation("sqrta"));
        assertFalse(inputD.isMathOperation("ciao"));
        assertFalse(inputD.isMathOperation("+--"));
        assertFalse(inputD.isMathOperation("2+5"));
        assertFalse(inputD.isMathOperation("2-"));
        assertFalse(inputD.isMathOperation("2+3j"));  
    }

    /**
     * Test of isVariablesOperation method, of class InputDistinguisher.
     * @throws scientificcalculator_group01.exceptions.SyntaxErrorException
     */
    @Test
    public void testIsVariablesOperation() throws SyntaxErrorException {
        
        //operazioni possibili con diverse variabili 
        assertTrue(inputD.isVariablesOperation(">a"));
        assertTrue(inputD.isVariablesOperation("<a"));
        assertTrue(inputD.isVariablesOperation("+a"));
        assertTrue(inputD.isVariablesOperation("-a"));
        assertTrue(inputD.isVariablesOperation(">i"));
        assertTrue(inputD.isVariablesOperation("<i"));
        assertTrue(inputD.isVariablesOperation("+i"));
        assertTrue(inputD.isVariablesOperation("-i"));
        assertTrue(inputD.isVariablesOperation(">j"));
        assertTrue(inputD.isVariablesOperation("<j"));
        assertTrue(inputD.isVariablesOperation("+j"));
        assertTrue(inputD.isVariablesOperation("-j"));

        //input non riconosciuti
        assertFalse(inputD.isVariablesOperation(">aa"));
        assertFalse(inputD.isVariablesOperation("+cf"));
        assertFalse(inputD.isVariablesOperation("*a"));
        assertFalse(inputD.isVariablesOperation("/a"));
        assertFalse(inputD.isVariablesOperation("+"));
        assertFalse(inputD.isVariablesOperation("sqrt"));
        assertFalse(inputD.isVariablesOperation("ciao"));
        assertFalse(inputD.isVariablesOperation("+--"));
        assertFalse(inputD.isVariablesOperation("2+"));
        assertFalse(inputD.isVariablesOperation("2+3i"));
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.common_resources;

import java.util.List;
import java.util.Stack;

import scientificcalculator_group01.exceptions.MathErrorException;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.exceptions.SyntaxErrorException;
import scientificcalculator_group01.mathoperations.DifferenceOperation;
import scientificcalculator_group01.mathoperations.DivisionOperation;
import scientificcalculator_group01.mathoperations.InversionOperation;
import scientificcalculator_group01.mathoperations.MultiplicationOperation;
import scientificcalculator_group01.mathoperations.SqrtOperation;
import scientificcalculator_group01.mathoperations.SumOperation;
import scientificcalculator_group01.stackoperations.ClearOperation;
import scientificcalculator_group01.stackoperations.DropOperation;
import scientificcalculator_group01.stackoperations.DupOperation;
import scientificcalculator_group01.stackoperations.OverOperation;
import scientificcalculator_group01.stackoperations.SwapOperation;
import scientificcalculator_group01.variablesoperations.GetFromVarOperation;
import scientificcalculator_group01.variablesoperations.MinusVarOperation;
import scientificcalculator_group01.variablesoperations.PlusVarOperation;
import scientificcalculator_group01.variablesoperations.SaveIntoVarOperation;

/**
 *
 * @author Ciro Cutolo
 */

public class ScientificCalculator {
    private Stack<ComplexNumber> complexNumberStack;
    private Variables variable;
    private InputDistinguisher inputDistinguisher;

    public ScientificCalculator() {
        complexNumberStack = new Stack<>();
        variable = new Variables();
        inputDistinguisher = new InputDistinguisher();
    }

    /**
     * @param private Stack<ComplexNumber> complexNumberStack:
     *                Struttura in cui vengono salvati i numeri ed i risultati delle
     *                operazioni.
     * 
     * @param private Variables variable:
     *                Mappa di variabili le cui chiavi sono i nomi delle variabili
     *                su cui operare.
     * 
     * @param private InputDistinguisher inputDistinguisher:
     *                Oggetto della classe InputDistinguisher utile
     *                alla distinzione del tipo di input ricevuto dalla calcolatrice
     * 
     * @method public void calculate(String input) throws MathErrorException,
     *         StackErrorException, SyntaxErrorException:
     *         Sfrutta l'input distinguisher per differenziare i possibili input,
     *         così da reindirizzarli ai metodi dediti al calcolo delle specifiche
     *         operazioni, od al salvataggio del numero inserito.
     * 
     * @method public Stack<ComplexNumber> getComplexNumberStack():
     *         Restituisce reference dello stack su cui si basa il funzionamento
     *         della calcolatrice.
     * 
     * @method public List<ComplexNumber> getTop12Numbers(Stack<ComplexNumber>
     *         stack):
     *         Restituisce una lista contenente gli ultimi 12 elementi dello stack.
     * 
     * @method public void calculateMathOperation(String operation) throws
     *         MathErrorException, StackErrorException, SyntaxErrorException:
     *         Controlla quale delle operazioni matematiche è stata digitata e ne
     *         richiama l'esecuzione.
     * 
     * @method public void calculateStackOperation(String operation) throws
     *         StackErrorException, SyntaxErrorException:
     *         Controlla quale delle operazioni agenti sullo stack è stata digitata
     *         e ne richiama l'esecuzione.
     * 
     * @method public void calculateVariablesOperation(String operation) throws
     *         StackErrorException, SyntaxErrorException:
     *         Controlla quale delle operazioni agenti sulle variabili è stata
     *         digitata e ne richiama l'esecuzione.
     * 
     * @method public void saveComplexNumber(String number):
     *         Salva l'input nello stack, nel caso in cui questo sia un numero
     *         complesso.
     */

    public void calculate(String input) throws MathErrorException, StackErrorException, SyntaxErrorException {

        if (this.inputDistinguisher.isComplexNumber(input)) {

            this.saveComplexNumber(input);

        } else if (this.inputDistinguisher.isMathOperation(input)) {

            this.calculateMathOperation(input);

        } else if (this.inputDistinguisher.isStackOperation(input)) {

            this.calculateStackOperation(input);

        } else if (this.inputDistinguisher.isVariablesOperation(input)) {

            this.calculateVariablesOperation(input);

        } else {

            throw new SyntaxErrorException();

        }
    }

    public List<ComplexNumber> getTop12Numbers() {
        if (this.complexNumberStack.size() > 12) {
            return this.complexNumberStack.subList((this.complexNumberStack.size() - 12),
                    this.complexNumberStack.size());
        }
        return this.complexNumberStack.subList(0, this.complexNumberStack.size());

    }

    public void saveComplexNumber(String number) {

        ComplexNumber num = new ComplexNumber(number);

        this.complexNumberStack.push(num);

    }

    public void calculateMathOperation(String operation)
            throws MathErrorException, StackErrorException, SyntaxErrorException {

        if (operation.equals("+")) {

            SumOperation sum = new SumOperation();

            sum.execute(this.complexNumberStack);

        } else if (operation.equals("-")) {

            DifferenceOperation dif = new DifferenceOperation();

            dif.execute(this.complexNumberStack);

        } else if (operation.equals("*")) {

            MultiplicationOperation mul = new MultiplicationOperation();

            mul.execute(this.complexNumberStack);

        } else if (operation.equals("/")) {

            DivisionOperation div = new DivisionOperation();

            div.execute(this.complexNumberStack);

        } else if (operation.equals("sqrt")) {

            SqrtOperation sqrt = new SqrtOperation();

            sqrt.execute(this.complexNumberStack);

        } else if (operation.equals("+-")) {

            InversionOperation inv = new InversionOperation();

            inv.execute(this.complexNumberStack);

        }
    }

    public void calculateStackOperation(String operation) throws StackErrorException, SyntaxErrorException {

        if (operation.equals("dup")) {

            DupOperation dup = new DupOperation();

            dup.execute(this.complexNumberStack);

        } else if (operation.equals("drop")) {

            DropOperation drop = new DropOperation();

            drop.execute(this.complexNumberStack);

        } else if (operation.equals("swap")) {

            SwapOperation swap = new SwapOperation();

            swap.execute(this.complexNumberStack);

        } else if (operation.equals("clear")) {

            ClearOperation clear = new ClearOperation();

            clear.execute(this.complexNumberStack);

        } else if (operation.equals("over")) {

            OverOperation over = new OverOperation();

            over.execute(this.complexNumberStack);

        }
    }

    public void calculateVariablesOperation(String operation) throws StackErrorException, SyntaxErrorException {

        if (operation.matches("^[<][a-z]$")) {

            GetFromVarOperation get = new GetFromVarOperation();
            // essendo l'operazione formata da 2 char di cui il secondo è la variabile,
            // trasformo la stringa in un array di char, cosa che permette di prendere
            // separatamente gli elementi.

            get.execute(this.variable, this.complexNumberStack, operation.charAt(1));

        } else if (operation.matches("^[>][a-z]$")) {

            SaveIntoVarOperation save = new SaveIntoVarOperation();

            save.execute(this.variable, this.complexNumberStack, operation.charAt(1));

        } else if (operation.matches("^[+]+[a-z]$")) {

            PlusVarOperation plus = new PlusVarOperation();

            plus.execute(this.variable, this.complexNumberStack, operation.charAt(1));

        } else if (operation.matches("^[-]+[a-z]$")) {

            MinusVarOperation minus = new MinusVarOperation();

            minus.execute(this.variable, this.complexNumberStack, operation.charAt(1));

        }
    }

}

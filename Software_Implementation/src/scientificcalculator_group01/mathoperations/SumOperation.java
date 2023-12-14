/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.mathoperations;

import java.util.Stack;

import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.exceptions.StackErrorException;

/**
 *
 * @author Aurora Campione
 */

/**
 * La classe definisce ed implementa l'operazione matematica di addizione
 * esguita
 * su due numeri complessi presenti nello stack.
 */
public class SumOperation extends MathOperation {
    public SumOperation() {
        super(2);
    }

    /**
     * @descrizione Esegue l'operazione matematica di addizione sugli
     *              ultimi due elementi inseriti nello stack.
     * @param stack Stack su cui si basa il funzionamento della calcolatrice.
     * @throws StackErrorException Eccezione lanciata se lo stack non contiene
     *                             abbastanza
     *                             abbastanza elementi per eseguire il comando.
     */
    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException {
        if (super.minOperandsToOperate(stack.size())) {
            ComplexNumber operand1 = stack.pop();
            ComplexNumber operand2 = stack.pop();

            ComplexNumber result = new ComplexNumber(operand1.getA() + operand2.getA(),
                    operand1.getB() + operand2.getB());

            stack.push(result);

        } else {
            throw new StackErrorException("STACK ERROR: too few elements in the stack");
        }

    }

}

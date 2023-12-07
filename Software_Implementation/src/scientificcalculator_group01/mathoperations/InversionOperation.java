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
 * La classe consente di effettuare l'inversione del segno di un numero complesso.
 */
public class InversionOperation extends MathOperation {
    public InversionOperation(){
        super(1);
    }

    /**@descrizione Esegue l'operazione matematica di inversione di segno sull'
     *              ultimo elemento inserito nello stack.
     * @param stack Stack su cui si basa il funzionamento della calcolatrice.
     * @throws StackErrorException Lanciata se lo stack non contiene abbastanza
	 * 								abbastanza elementi per eseguire il comando.
    */
    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException {
        if(super.minOperandsToOperate(stack.size())){
            ComplexNumber operand = stack.pop();

            ComplexNumber result = new ComplexNumber (operand.getA()*(-1), operand.getB()*(-1));

            stack.push(result);
        }
        else{
            throw new StackErrorException("STACK ERROR: too few elements in the stack");
        }
    }

    
    
}

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
 * @author Claudia Carucci
 * 
 * La classe rappresenta l'operazione matematica di estrazione di radice
 * quadrata eseguita su due numeri complessi presenti nello stack.
 */
public class SqrtOperation extends MathOperation{

    /**
     * @descrizione Esegue l'operazione matematica di radice quadrata
     *              sull'ultimo elemento inserito nello stack.
     * @param stack Stack su cui si basa il funzionamento della calcolatrice.
     * @throws StackErrorException Lanciata se lo stack non contiene abbastanza
	 * 								abbastanza elementi per eseguire il comando.
     */
    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException {
        if(!super.minOperandsToOperate(stack.size())){
            throw new StackErrorException("Not enough operands given...");
        }

        ComplexNumber num = stack.pop();

        if( num.getA() != 0 && num.getB() == 0 ){
            if( num.getA() < 0 ){
                double mod = Math.abs(num.getA());
                ComplexNumber result = new ComplexNumber(0,Math.sqrt(mod));
            }else{
                ComplexNumber result = new ComplexNumber(Math.sqrt(num.getA()));
            }

        }

        stack.push(result);

    }

    
    
}

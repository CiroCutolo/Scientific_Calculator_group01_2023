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
 * @author Gaetano Frasca
 */

 /**
 * La classe definisce ed implementa l'operazione matematica di moltiplicazione esguita
 * su due numeri complessi presenti nello stack.
 */
public class MultiplicationOperation extends MathOperation{
    
    public MultiplicationOperation(){
        super(2);
    }
    
    /**
     * @descrizione Esegue l'operazione matematica di moltiplicazione sugli
     *              ultimi due elementi inseriti nello stack.
     * @param stack Stack su cui si basa il funzionamento della calcolatrice.
     * @throws StackErrorException Eccezione lanciata se lo stack non contiene abbastanza
	 * 								abbastanza elementi per eseguire il comando.
     */
    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException{
        
        if(!super.minOperandsToOperate(stack.size()))
            throw new StackErrorException("Not enough operands given...");
        
        ComplexNumber num1 = stack.pop();
        ComplexNumber num2 = stack.pop();
        
        ComplexNumber result = new ComplexNumber(
                num1.getA() * num2.getA() - num1.getB() * num2.getB() ,
                num1.getA() * num2.getB() + num2.getA() * num1.getB()   );
        
        stack.push(result);
    }
    
}

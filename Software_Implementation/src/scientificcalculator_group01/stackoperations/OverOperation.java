/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.stackoperations;

import java.util.Stack;
import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.exceptions.StackErrorException;

/**
 *
 * @author Gaetano Frasca
 * 
 * Questa classe fornisce un metodo per eseguire il comando "over", che
 * consente di inserire nello stack una copia del penultimo elemento inserito.
 */
public class OverOperation extends StackOperation{

	public OverOperation(){
		super(2);
	}

	/**
	 * @descrizione Inserisce nello stack una copia del penultimo elemento inserito.
	 * @param stack Stack su cui si basa il funzionamento della calcolatrice.
	 * @throws StackErrorException lanciata se lo stack non contiene abbastanza
	 * 								abbastanza elementi per eseguire il comando.
	 */	
	@Override
	public void execute(Stack<ComplexNumber> stack) throws StackErrorException{
		if(!minOperandsToOperate(2))
			throw new StackErrorException();
		
		stack.push(stack.elementAt(stack.size() - 2 ));

	}
    
}

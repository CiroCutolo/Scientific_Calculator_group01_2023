/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.variablesoperations;

import java.util.Stack;

import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.common_resources.Variables;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.exceptions.SyntaxErrorException;
import scientificcalculator_group01.mathoperations.DifferenceOperation;
import scientificcalculator_group01.stackoperations.SwapOperation;

/**
 *
 * @author Gaetano Frasca
 */

/** 
 * La classe definisce ed implementa l'operazione con le variabili "-x".
 */

public class MinusVarOperation extends VariablesOperation{

	public MinusVarOperation(){
		super(1);
	}

	/**
	 * @descrizione Esegue la sottrazione tra il valore della variabile specificata
	 * 				e l'ultimo elemento inserito nello stack.
	 * 
	 * @param stack Stack su cui si basa il funzionamento della calcolatrice.
     * @param variable Refence alla Mappa delle variabili.
     * @param name Nome della variabile sulla quale eseguire l'operazione.
     * 
	 * @throws StackErrorException Eccezione lanciata se lo stack non contiene abbastanza
	 * 										abbastanza elementi per eseguire l'operazione.
     * @throws SyntaxErrorException Eccezione lanciata se la variabile specificata
	 * 											non ha valore.
	 */
	@Override
	public void execute(Variables variable, Stack<ComplexNumber> stack, char name) throws StackErrorException, SyntaxErrorException{
		
		if(!minOperandsToOperate(stack.size()))
			throw new StackErrorException("Not enough operands given...");

		ComplexNumber var = variable.getVariable(name);
		if(var == null)
			throw new SyntaxErrorException("SYNTAX ERROR: used varible hasn't a value...");
		
		SwapOperation swap = new SwapOperation();
		DifferenceOperation diff = new DifferenceOperation();
		ComplexNumber num = stack.peek();
		
		stack.push(var);

		swap.execute(stack);
		diff.execute(stack);

		variable.setVariable(name, stack.pop());
		stack.push(num);		
	}
    
}

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
 * @author Ciro Cutolo
 */ 
 /** 
 * La classe definisce ed implementa il comando "dup", che
 * consente di duplicare l'ultimo elemento inserito nello stack.
 */
public class DupOperation extends StackOperation{
    public DupOperation(){
        super();
    }

    /**
     * @descrizione Inserisce nello stack una copia dell'ultimo elemento inserito.
     * @param stack Stack su cui si basa il funzionamento della calcolatrice.
	 * @throws StackErrorException Eccezione lanciata se lo stack non contiene abbastanza
	 * 								abbastanza elementi per eseguire il comando.
    */
    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException{
        if(super.minOperandsToOperate(stack.size())){
            stack.push(stack.peek());
        }else{
            throw new StackErrorException("Not enough operands given...");
        }
    }
}

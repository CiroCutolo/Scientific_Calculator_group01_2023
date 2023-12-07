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
 * @author Aurora Campione
 * La classe consente di eseguire il comando drop sull'ultimo elemento inserito nello stack..
 */
public class DropOperation extends StackOperation{
    public DropOperation(){
        super(1);
    }

    /**@descrizione Il comando eseguito elimina l'ultimo elemento presente nello stack.
     * @param stack Stack su cui si basa il funzionamento della calcolatrice.
     * @throws StackErrorException StackErrorException Lanciata se lo stack non contiene abbastanza
	 * 								abbastanza elementi per eseguire il comando.
    */
    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException {
        if(super.minOperandsToOperate(stack.size())){
            stack.pop();
        }
        else{
            throw new StackErrorException("STACK ERROR: too few elements in the stack");
        }
    }
    
    
}

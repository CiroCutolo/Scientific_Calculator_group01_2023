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
 */
 
 /** 
 * La classe definisce ed implementa il comando "drop", che consente di rimuovere
 * l'ultimo elemento inserito nello stack.
 */
public class DropOperation extends StackOperation{
    public DropOperation(){
        super(1);
    }

    /**
     * @descrizione Rimuove l'ultimo elemento inserito nello stack.
     * @param stack Stack su cui si basa il funzionamento della calcolatrice.
	 * @throws StackErrorException Eccezione lanciata se lo stack non contiene abbastanza
	 * 								abbastanza elementi per eseguire il comando.
    */
    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException {
        if(super.minOperandsToOperate(stack.size())){
            stack.pop();
        }
        else{
            throw new StackErrorException();
        }
    }
    
    
}

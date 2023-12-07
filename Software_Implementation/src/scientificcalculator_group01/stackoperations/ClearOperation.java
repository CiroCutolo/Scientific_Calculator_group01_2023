/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.stackoperations;

import java.util.Stack;
import scientificcalculator_group01.common_resources.ComplexNumber;

/**
 *
 * @author Gaetano Frasca
 * 
 * Questa classe fornisce un metodo per eseguire il comando "clear", che
 * consente di eliminare tutti gli elementi presenti nello stack.
 */
public class ClearOperation extends StackOperation{
    
    public ClearOperation(){
        super(0);
    }
    
    /**
     * @descrizione Elimina tutti gli elementi dallo stack.
     * @param stack Stack su cui si basa il funzionamento della calcolatrice.
     */
    @Override
    public void execute(Stack<ComplexNumber> stack){
        stack.clear();
    }
}

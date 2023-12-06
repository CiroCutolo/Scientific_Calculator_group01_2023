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
 * Questa classe fornisce un metodo per eseguire il comando "clear", che
 * consente di eliminare tutti gli elementi presenti nello stack.
 */
public class ClearOperation extends StackOperation{
    
    /**
     * @descrizione Costruttore di default
     *              Richiama il costruttore della superclasse StackOperation, 
     *              fornendo come parametro il numero di operandi necessari 
     *              affinchè il comando "clear" possa essere eseguito 
     *              correttamente, in questo caso viene specificato come
     *              parametro 0, perchè l'operazione rimuove tutti gli elementi
     *              presenti nellos tack.
     */
    public ClearOperation(){
        super(0);
    }
    
    /**
     * @descrizione Esegue il comando "clear", il metodo non fa altro che
     *              richiamare il metodo già presente nella libreria java.util.Stack.
     * @param stack 
     */
    @Override
    public void execute(Stack<ComplexNumber> stack){
        
        stack.clear();
    }
}

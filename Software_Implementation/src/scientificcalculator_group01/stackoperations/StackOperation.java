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
 * La classe rappresenta un'operazione di manipolazione dello stack eseguibile
 * sugli elementi contenuti nello stack.
 */
public abstract class StackOperation implements StackInterface{
    private final int numOperands;
    
    /**Costruttore di default*/
    public StackOperation(){
        numOperands = 0;
    }
    
    /**Costruttore sovraccarico
     * @param Numero minimo di operandi utili per eseguire l'operazione.
     */
    public StackOperation(int numOperands){
        this.numOperands = numOperands;
    }
    
    @Override
    public abstract void execute(Stack<ComplexNumber> stack) throws StackErrorException;

    /**
     * Verifica se lo stack contiene abbastanza elementi, affinchè sia possibile
     *        eseguire l'operazione.
     * @param size Numero di elementi presenti nello stack.
     * @return `true` se size è maggiore o uguale del numero di operandi necessari;
     *         `false` altrimenti.
     */
    
    protected boolean minOperandsToOperate(int size){
        return size >= numOperands; 
        
    }
    
    
}

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

/**
 *
 * @author Aurora Campione
 */

/** 
 * La classe rappresenta un'operazione eseguibile su una variabili.
 */
public abstract class VariablesOperation implements VariablesInterface{
    /**Numero di operandi necessari per eseguire l'operazione sullo stack */
    private final int numOperands;
    
    /**Costruttore di default*/
    public VariablesOperation(){
        numOperands = 0;
    }
    
    /**Costruttore sovraccarico
     * @param numOperands Numero minimo di operandi utili per eseguire l'operazione.
     */    
    public VariablesOperation(int numOperands){
        this.numOperands = numOperands;
    }
    
    @Override
    public abstract void execute(Variables variable, Stack<ComplexNumber> stack, char name) throws StackErrorException, SyntaxErrorException;
    
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

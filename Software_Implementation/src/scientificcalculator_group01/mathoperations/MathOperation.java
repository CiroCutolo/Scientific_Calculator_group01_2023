/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.mathoperations;

import java.util.Stack;
import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.exceptions.MathErrorException;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.exceptions.SyntaxErrorException;

/**
 *
 * @author Aurora Campione
 */
 
 /** 
 * La classe rappresenta un'operazione matematica eseguibile
 * sugli elementi contenuti nello stack.
 */
public abstract class MathOperation implements MathInterface{
    /**Numero di operandi necessari per eseguire l'operazione matematica */
    private final int numOperands;
    
    /**Costruttore di default*/
    public MathOperation(){
        numOperands = 0;
    }
    
    /**Costruttore sovraccarico
     * @param numOperands Numero minimo di operandi utili per eseguire l'operazione.
     */
    public MathOperation(int numOperands){
        this.numOperands = numOperands;
    }
    
    @Override
    public abstract void execute(Stack<ComplexNumber> stack) throws StackErrorException, SyntaxErrorException, MathErrorException;
    
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


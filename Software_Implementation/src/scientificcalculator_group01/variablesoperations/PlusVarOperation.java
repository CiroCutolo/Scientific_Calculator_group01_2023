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
import scientificcalculator_group01.mathoperations.SumOperation;

/**
 *
 * @author Claudia Carucci
 */

 /** 
 * La classe definisce ed implementa l'operazione con le variabili "+x".
 */
public class PlusVarOperation extends VariablesOperation{
    public PlusVarOperation(){
        super(1);
    }

    /**
	 * @descrizione Esegue la somma tra il valore della variabile specificata
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
    public void execute(Variables variable, Stack<ComplexNumber> stack, char name)
            throws StackErrorException,SyntaxErrorException{
                if(!super.minOperandsToOperate(stack.size())){
                    throw new StackErrorException();
                }
                if (variable.getVariable(name) == null){
                    throw new SyntaxErrorException();
                }

                ComplexNumber var = variable.getVariable(name);

                stack.push(var);
                SumOperation sum = new SumOperation();
                sum.execute(stack);
                variable.setVariable(name, stack.peek());

    }
    
}

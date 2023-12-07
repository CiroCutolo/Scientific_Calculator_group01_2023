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
 * 
 * La classe fornisce un metodo che consente di addizionare ad una 
 * variabile il valore dell'utlimo elemento inserito nello stack.
 */
public class PlusVarOperation extends VariablesOperation{
    public PlusVarOperation(){
        super(1);
    }
    /**
 *
 * @descrizione Esegue la somma tra il valore della variabile specificata
 * 				e l'ultimo elemento inserito nello stack.
 * @param stack Struttura su cui si basa la calcolatrice.
 * @param variable mappa di variabili in cui viene salvato il valore corrispondente al nome della variabile (ad esempio'x').
 * @param name Nome della variabile in cui deve essere salvato il valore dell'ultimo operando inserito nello stack.  
 * @throws StackErrorException Lanciata se lo stack non contiene abbastanza elementi per eseguire il comando.
 * @throws SyntaxErrorException Lanciata se gli input non sono stati inseriti nel formato corretto o nella maniera corretta.
 */

    @Override
    public void execute(Variables variable, Stack<ComplexNumber> stack, char name)
            throws StackErrorException,SyntaxErrorException{
                if(!super.minOperandsToOperate(stack.size())){
                    throw new StackErrorException("Not enough operands given...");
                }
                if (variable.getVariable(name) == null){
                    throw new SyntaxErrorException("SYNTAX ERROR: used variable hasn't a value");
                }

                ComplexNumber var = variable.getVariable(name);

                stack.push(var);
                SumOperation sum = new SumOperation();
                sum.execute(stack);
                variable.setVariable(name, stack.peek());

    }
    
}

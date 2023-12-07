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

/**
 * 
 * @author ciroc
 * 
 * La classe consente di salvare l'ultimo elemento dello stack nella variabile.
 */
public class SaveIntoVarOperation extends VariablesOperation{
    public SaveIntoVarOperation(){
        super(1);
    }
    /**
 * @descrizione Consente di salvare l'ultimo elemento dello stack nella variabile.
 * @param stack Struttura su cui si basa la calcolatrice.
 * @param variable mappa di variabili in cui viene salvato il valore corrispondente al nome della variabile (ad esempio'x').
 * @param name Nome della variabile in cui deve essere salvato il valore dell'ultimo operando inserito nello stack.  
 * @throws StackErrorException Lanciata se lo stack non contiene abbastanza elementi per eseguire il comando.
 */

    public void execute(Variables variable, Stack<ComplexNumber> stack, char name) throws StackErrorException{
        if(!super.minOperandsToOperate(stack.size())){
            throw new StackErrorException("Not enough operands given...");
        }else{
         
            ComplexNumber num = stack.peek();

            variable.setVariable(name, num);
        }

    }
}

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
 * @author Ciro Cutolo
 */

 /** 
 * La classe definisce ed implementa l'operazione "<x".
 */
public class SaveIntoVarOperation extends VariablesOperation{
    public SaveIntoVarOperation(){
        super(1);
    }

    /**
    * @descrizione Salva l'ultimo elemento dello stack nella variabile sèecificata.
    * @param stack Stack su cui si basa il funzionamento della calcolatrice.
    * @param variable Refence alla Mappa delle variabili.
    * @param name Nome della variabile sulla quale eseguire l'operazione.
    * @throws StackErrorException Eccezione lanciata se la variabile specificata
    *                                  non ha valore.
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.variablesoperations;

import java.util.Stack;

import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.common_resources.Variables;


/**
 *
 * @author Aurora Campione
 * La classe consente di salvare il valore di una variabile nello stack.
 */
public class GetFromVarOperation extends VariablesOperation{
    public GetFromVarOperation(){
        super();
    }

     /**
     * @descrizione Aggiunge come ultimo elemento dello stack il valore della variabile
     * @param stack
     */

    @Override
    public void execute(Variables variable, Stack<ComplexNumber> stack, char name){
        ComplexNumber value = variable.getVariable(name);

        stack.push(value);
    }

    
}

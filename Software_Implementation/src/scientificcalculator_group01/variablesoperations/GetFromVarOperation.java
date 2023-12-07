/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.variablesoperations;

import java.util.Stack;

import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.common_resources.Variables;
import scientificcalculator_group01.exceptions.SyntaxErrorException;


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
     *              corrispodente al nome.
 	 * @param stack Struttura su cui si basa la calcolatrice.
 	 * @param variable mappa di variabili in cui viene salvato il valore corrispondente al nome della variabile (ad esempio'x').
	 * @param name Nome della variabile in cui deve essere salvato il valore dell'ultimo operando inserito nello stack.  
	 * @throws SyntaxErrorException Lanciata se gli input non sono stati inseriti nel formato corretto o nella maniera corretta.
     */

    @Override
    public void execute(Variables variable, Stack<ComplexNumber> stack, char name) throws SyntaxErrorException {
        ComplexNumber value = variable.getVariable(name);
        if(value != null){
            stack.push(value);
        }
        else{
            throw new SyntaxErrorException("SYNTAX ERROR: used variable hasn't a value");
        }

    }

    
}

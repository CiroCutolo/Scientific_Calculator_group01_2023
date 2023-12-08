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
 */

 /** 
 * La classe definisce ed implementa l'operazione "<x".
 */
public class GetFromVarOperation extends VariablesOperation{
    public GetFromVarOperation(){
        super();
    }

    /**
    * @descrizione Salva nello stack il valore della variabile specificata.
    * @param stack Stack su cui si basa il funzionamento della calcolatrice.
    * @param variable Refence alla Mappa delle variabili.
    * @param name Nome della variabile sulla quale eseguire l'operazione.
    * @throws SyntaxErrorException Eccezione lanciata se la variabile specificata
    *                                  non ha valore.
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

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
 * @author Gaetano Frasca
 * 
 *         Questa interfaccia dichiara un singolo metodo che esegue una generica
 *         operazione su una variabile.
 */
public interface VariablesInterface {
    public abstract void execute(Variables variable, Stack<ComplexNumber> stack, char name)
            throws StackErrorException, SyntaxErrorException;
}

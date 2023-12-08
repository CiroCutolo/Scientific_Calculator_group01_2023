/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.stackoperations;

import java.util.Stack;
import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.exceptions.StackErrorException;

/**
 *
 * @author Gaetano Frasca
 */

/** 
 * Questa interfaccia dichiara un singolo metodo per eseguire una generica operazione
 * di manipolazione dello stack.
 */
public interface StackInterface {

    public abstract void execute(Stack<ComplexNumber> stack) throws StackErrorException;
}

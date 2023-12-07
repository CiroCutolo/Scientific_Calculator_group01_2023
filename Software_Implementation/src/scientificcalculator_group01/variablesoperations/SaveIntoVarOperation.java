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
 * @author ciroc
 */
public class SaveIntoVarOperation extends VariablesOperation{
    public SaveIntoVarOperation(){
        super(1);
    }

    public void execute(Variables variable, Stack<ComplexNumber> stack, char name) throws SyntaxErrorException, StackErrorException{
        if(!super.minOperandsToOperate(stack.size())){
            throw new StackErrorException("Not enough operands given...");
        }else{
         
            ComplexNumber num = stack.peek();

            variable.setVariable(name, num);
        }

    }
}

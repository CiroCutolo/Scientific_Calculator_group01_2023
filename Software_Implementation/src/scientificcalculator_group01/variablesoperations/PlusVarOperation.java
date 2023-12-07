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
import scientificcalculator_group01.mathoperations.SumOperation;

/**
 *
 * @author Claudia Carucci
 */
public class PlusVarOperation extends VariablesOperation{
    public PlusVarOperation(){
        super(1);
    }

    @Override
    public void execute(Variables variable, Stack<ComplexNumber> stack, char name)
            throws StackErrorException{
                if(!super.minOperandsToOperate(stack.size())){
                    throw new StackErrorException("Not enough operands given...");
                }

                ComplexNumber var = variable.getVariable(name);

                stack.push(var);
                SumOperation sum = new SumOperation();
                sum.execute(stack);
                variable.setVariable(name, stack.pop());

    }
    
}

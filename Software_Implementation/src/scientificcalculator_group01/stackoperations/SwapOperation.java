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
 * @author Claudia Carucci
 */
public class SwapOperation extends StackOperation{
    public SwapOperation(){
        super(2);
    }

    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException {
        if(!super.minOperandsToOperate(stack.size())){
            throw new StackErrorException();
        }
        ComplexNumber num1 = stack.pop();
        ComplexNumber num2 = stack.pop();
        stack.push(num1);
        stack.push(num2);
    }
    
}

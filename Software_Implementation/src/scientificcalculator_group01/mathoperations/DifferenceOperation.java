/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.mathoperations;

import java.util.Stack;

import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.exceptions.StackErrorException;

/**
 *
 * @author Claudia Carucci
 */
public class DifferenceOperation extends MathOperation{
    public DifferenceOperation(){
        super(2);
    }

    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException{
        if(!super.minOperandsToOperate(stack.size())){
            throw new StackErrorException("Not enough operands given...");
        }
        
        ComplexNumber num1 = stack.pop();
        ComplexNumber num2= stack.pop();

        ComplexNumber result = new ComplexNumber(num2.getA()-num1.getA(), num2.getB()-num1.getB());

        stack.push(result);

    }
    
}

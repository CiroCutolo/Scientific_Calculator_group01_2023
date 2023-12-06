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
 * @author Aurora Campione
 */
public class SumOperation extends MathOperation{
    public SumOperation(){
        super(2);
    }

    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException {
        if(super.minOperandsToOperate(stack.size())){
            ComplexNumber operand1 = stack.pop();
            ComplexNumber operand2 = stack.pop();

            ComplexNumber result = new ComplexNumber(operand1.getA()+operand2.getA(), operand1.getB()+operand2.getB());

            stack.push(result);

        }
        else{
            throw new StackErrorException("STACK ERROR: too few elements in the stack");
        }

    }
    
}

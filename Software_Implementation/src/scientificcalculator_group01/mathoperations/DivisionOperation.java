/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.mathoperations;

import java.util.Stack;

import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.exceptions.MathErrorException;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.exceptions.SyntaxErrorException;

/**
 *
 * @author ciroc
 */
public class DivisionOperation extends MathOperation{
    public DivisionOperation(){
        super(2);
    }

    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException, SyntaxErrorException, MathErrorException{
        if(super.minOperandsToOperate(stack.size())){
            ComplexNumber num1 = stack.pop();
            ComplexNumber num2 = stack.pop();
            ComplexNumber result = null;
            if(num2.getA() == 0.0 && num2.getB() == 0.0){
                throw new MathErrorException("Cannot divide anything by 0...");
            }
            if(num1.getB() == 0.0 && num2.getB() == 0.0){
                if(num1.getA() == 0.0 && num2.getA() == 0.0){
                    throw new SyntaxErrorException("The operands were wrongly typed...");
                }
                result = new ComplexNumber(num1.getA()/num2.getA());
            }else{
                result = new ComplexNumber((((num1.getA()*num2.getA()) + (num1.getB()*num2.getB()))/((num2.getA()*num2.getA())+(num2.getB()*num2.getB()))), (((num1.getB()*num2.getA())-(num1.getA()*num2.getB()))/((num2.getA()*num2.getA())+(num2.getB()*num2.getB()))));
            }
            stack.push(result);
        }else{
            throw new StackErrorException("Not enough operands given...");
        }
    }
}

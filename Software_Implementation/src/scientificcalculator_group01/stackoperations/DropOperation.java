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
 * @author Aurora Campione
 */
public class DropOperation extends StackOperation{
    public DropOperation(){
        super(1);
    }

    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException {
        if(super.minOperandsToOperate(stack.size())){
            stack.pop();
        }
        else{
            throw new StackErrorException("STACK ERROR: too few elements in the stack");
        }
    }
    
    
}

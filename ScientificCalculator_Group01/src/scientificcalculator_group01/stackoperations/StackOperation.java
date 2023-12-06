/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.stackoperations;

import java.util.Stack;
import scientificcalculator_group01.common_resources.ComplexNumber;

/**
 *
 * @author ciroc
 */
public abstract class StackOperation implements StackInterface{
    private final int numOperands;
    
    public StackOperation(){
        numOperands = 0;
    }
    
    
    public StackOperation(int numOperands){
        this.numOperands = numOperands;
    }
    
    @Override
    public abstract void execute(Stack<ComplexNumber> stack);
    
    protected boolean minOperandsToOperate(int size){
        return size >= numOperands; 
        
    }
    
    
}

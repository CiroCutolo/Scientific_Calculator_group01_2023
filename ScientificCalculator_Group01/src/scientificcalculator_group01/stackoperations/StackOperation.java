/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.stackoperations;

/**
 *
 * @author ciroc
 */
public class StackOperation implements StackInterface{
    private final int numOperands;
    
    public StackOperation(){
        
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

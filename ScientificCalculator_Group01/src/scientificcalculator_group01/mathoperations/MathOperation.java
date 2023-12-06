/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.mathoperations;

/**
 *
 * @author ciroc
 */
public abstract class MathOperation implements MathInterface{
    private final int numOperands;
    
    public MathOperation(){
        numOperands = 0;
    }
    
    
    public MathOperation(int numOperands){
        this.numOperands = numOperands;
    }
    
    @Override
    public abstract void execute(Stack<ComplexNumber> stack);
    
    protected boolean minOperandsToOperate(int size){
        return size >= numOperands;    
    }
    
}


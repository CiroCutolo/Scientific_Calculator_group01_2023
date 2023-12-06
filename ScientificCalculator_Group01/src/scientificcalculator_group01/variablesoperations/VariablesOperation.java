/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.variablesoperations;

import java.util.Stack;
import scientificcalculator_group01.common_resources.ComplexNumber;
import scientificcalculator_group01.common_resources.Variables;

/**
 *
 * @author ciroc
 */
public abstract class VariablesOperation implements VariablesInterface{
    private final int numOperands;
    
    public VariablesOperation(){
        numOperands = 0;
    }
    
    
    public VariablesOperation(int numOperands){
        this.numOperands = numOperands;
    }
    
    @Override
    public abstract void execute(Variables variable, Stack<ComplexNumber> stack, char name);
    
    protected boolean minOperandsToOperate(int size){
        return size >= numOperands;    
    }
}

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
 
 /** 
 * La classe definisce ed implementa l'operazione matematica di estrazione di radice
 * quadrata eseguita su due numeri complessi presenti nello stack.
 */
public class SqrtOperation extends MathOperation{

    /**
     * @descrizione Esegue l'operazione matematica di radice quadrata
     *              sull'ultimo elemento inserito nello stack.
     * @param stack Stack su cui si basa il funzionamento della calcolatrice.
     * @throws StackErrorException Eccezione lanciata se lo stack non contiene abbastanza
	 * 								abbastanza elementi per eseguire il comando.
     */
    @Override
    public void execute(Stack<ComplexNumber> stack) throws StackErrorException {
        if(!super.minOperandsToOperate(stack.size())){
            throw new StackErrorException();
        }

        ComplexNumber num = stack.pop();
        double mod = 0;
        if(num.getA()!= 0 || num.getB()!= 0){
            mod = Math.sqrt(num.getA()*num.getA()+num.getB()*num.getB());
        }else{
            mod = 0;
        }

        if(num.getA() == 0 && num.getB() == 0){
            stack.push(new ComplexNumber(0));
        }

        if(num.getA() != 0 && num.getB() == 0){
            if(num.getA() > 0){
                mod = Math.sqrt(num.getA());
                mod = (Math.round(mod * 1000.0)/1000.0);
                stack.push(new ComplexNumber(mod));

            }else{
                mod = Math.abs(num.getA());
                stack.push(new ComplexNumber(0,Math.round(Math.sqrt(mod) * 1000.0)/1000.0));
            }
        }
        
        if(num.getB()!=0){
            double r = Math.sqrt(mod);
            double theta= (Math.atan2(num.getB(),num.getA()))/2;
            stack.push(new ComplexNumber(Math.round(r*Math.cos(theta) * 1000.0)/1000.0, Math.round(r*Math.sin(theta) * 1000.0)/1000.0));
        }

    }

    
}
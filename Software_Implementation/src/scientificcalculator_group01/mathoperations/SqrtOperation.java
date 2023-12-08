/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.mathoperations;

import java.util.Stack;
import java.util.Vector;

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
        Vector<ComplexNumber> ans = new Vector<ComplexNumber>();
        
        if(num.getA() != 0 && num.getB() == 0){
            if(num.getA() < 0){
                double x1 = Math.abs(num.getA());
                ans.add(new ComplexNumber(0, Math.sqrt(x1)));
            }

        }else{
        double x1 = Math.abs(Math.sqrt((num.getA() + Math.sqrt(num.getA()*num.getA() + num.getB()*num.getB())/2)));
        double y1 = num.getB() / (2*x1);

        ans.add(new ComplexNumber(x1, y1));

        double x2 = -1 * x1;
        double y2 = num.getB() / (2 * x2);

        if (x2 != 0){
            ans.add(new ComplexNumber(x2, y2));
        }

        double x3 = (num.getA() - Math.sqrt(num.getA()*num.getA() + num.getB()*num.getB())) / 2;

        if(x3 > 0){
            x3 = Math.abs(Math.sqrt(x3));
            double y3 = num.getB() / (2* x3);
            ans.add(new ComplexNumber(x3, y3));

            double x4 = -1 * x3;
            double y4 = num.getB() / (2 * x4);

            if( x4 != 0){
                ans.add(new ComplexNumber(x4, y4));
            }
        }
        }

        for(ComplexNumber c : ans){
            stack.push(c);
        }

    }

    
    
}

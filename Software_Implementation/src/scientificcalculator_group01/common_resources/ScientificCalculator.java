/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.common_resources;

import java.util.List;
import java.util.Stack;

import scientificcalculator_group01.exceptions.MathErrorException;
import scientificcalculator_group01.exceptions.StackErrorException;
import scientificcalculator_group01.exceptions.SyntaxErrorException;
import scientificcalculator_group01.mathoperations.DifferenceOperation;
import scientificcalculator_group01.mathoperations.DivisionOperation;
import scientificcalculator_group01.mathoperations.InversionOperation;
import scientificcalculator_group01.mathoperations.MultiplicationOperation;
import scientificcalculator_group01.mathoperations.SqrtOperation;
import scientificcalculator_group01.mathoperations.SumOperation;
import scientificcalculator_group01.stackoperations.ClearOperation;
import scientificcalculator_group01.stackoperations.DropOperation;
import scientificcalculator_group01.stackoperations.DupOperation;
import scientificcalculator_group01.stackoperations.OverOperation;
import scientificcalculator_group01.stackoperations.SwapOperation;
import scientificcalculator_group01.variablesoperations.GetFromVarOperation;
import scientificcalculator_group01.variablesoperations.MinusVarOperation;
import scientificcalculator_group01.variablesoperations.PlusVarOperation;
import scientificcalculator_group01.variablesoperations.SaveIntoVarOperation;

/**
 *
 * @author Ciro Cutolo
 * 
 * @method public void calculate(String input) throws MathErrorException, StackErrorException, SyntaxErrorException:
 *         Sfrutta l'inut distinguisher per differenziare i possibili input, 
 *         così da reindirizzarli ai metodi dediti al calcolo delle specifiche operazioni, od al salvataggio del numero inserito.
 *    
 * @method public List<ComplexNumber> getTop12Numbers(Stack<ComplexNumber> stack):
 *         Restituisce una lista contenente gli ultimi 12 elementi dello stack. 
 * 
 * @method public void calculateMathOperation(String operation) throws MathErrorException, StackErrorException, SyntaxErrorException:
 *         Controlla quale delle operazioni matematiche è stata digitata e ne richiama l'esecuzione.
 * 
 * @method public void calculateStackOperation(String operation) throws StackErrorException, SyntaxErrorException:
 *         Controlla quale delle operazioni agenti sullo stack è stata digitata e ne richiama l'esecuzione.
 * 
 * @method public void calculateVariablesOperation(String operation) throws StackErrorException, SyntaxErrorException:  
 *         Controlla quale delle operazioni agenti sulle variabili è stata digitata e ne richiama l'esecuzione.
 * 
 * @method public void saveComplexNumber(String number):
 *         Salva l'input nello stack, nel caso in cui questo sia un numero complesso. 
 */
public class ScientificCalculator {
    private Stack<ComplexNumber> complexNumberStack;
    private Variables variable;
    private InputDistinguisher inputDistinguisher;
    
    public ScientificCalculator(){
        
    }
    public void calculate(String input) throws MathErrorException, StackErrorException, SyntaxErrorException {
    
        if(this.inputDistinguisher.isComplexNumber(input)){
    
            this.saveComplexNumber(input);
    
        }else if(this.inputDistinguisher.isMathOperation(input)){
    
            this.calculateMathOperation(input);
    
        }else if(this.inputDistinguisher.isStackOperation(input)){
    
            this.calculateStackOperation(input);
    
        }else if(this.inputDistinguisher.isVariablesOperation(input)){
    
            this.calculateVariablesOperation(input);
    
        }else{
    
            throw new SyntaxErrorException("The input was wrongly typed...");
    
        }
    }

    public List<ComplexNumber> getTop12Numbers(Stack<ComplexNumber> stack){

        return stack.subList(0, 11);

    }
    
    public void saveComplexNumber(String number){
        
        ComplexNumber num = new ComplexNumber(number);
        
        this.complexNumberStack.push(num);
    
    }
    
    public void calculateMathOperation(String operation) throws MathErrorException, StackErrorException, SyntaxErrorException{
        
        if(operation.equals("+")){
        
            SumOperation sum = new SumOperation();
        
            sum.execute(this.complexNumberStack);
        
        }else if(operation.equals("-")){
        
            DifferenceOperation dif = new DifferenceOperation();
        
            dif.execute(complexNumberStack);
        
        }else if(operation.equals("*")){
        
            MultiplicationOperation mul = new MultiplicationOperation();
        
            mul.execute(this.complexNumberStack);
        
        }else if(operation.equals("/")){
        
            DivisionOperation div = new DivisionOperation();
        
            div.execute(complexNumberStack); 
        
        }else if(operation.equals("sqrt")){
        
            SqrtOperation sqrt = new SqrtOperation();
        
            sqrt.execute(complexNumberStack);
        
        }else if(operation.equals("+-")){
        
            InversionOperation inv = new InversionOperation();
        
            inv.execute(this.complexNumberStack);
        
        }
    }
    
    public void calculateStackOperation(String operation) throws StackErrorException, SyntaxErrorException{
        
        if(operation.equals("dup")){
        
            DupOperation dup = new DupOperation();
        
            dup.execute(this.complexNumberStack);
        
        }else if(operation.equals("drop")){
        
            DropOperation drop = new DropOperation();
        
            drop.execute(complexNumberStack);
        
        }else if(operation.equals("swap")){
        
            SwapOperation swap = new SwapOperation();
        
            swap.execute(this.complexNumberStack);
        
        }else if(operation.equals("clear")){
        
            ClearOperation clear = new ClearOperation();
        
            clear.execute(complexNumberStack); 
        
        }else if(operation.equals("over")){
           
            OverOperation over = new OverOperation();
           
            over.execute(complexNumberStack);
        
        }
    }
    
    public void calculateVariablesOperation(String operation) throws StackErrorException, SyntaxErrorException{

        char[] ch = new char[2];
        
        if(operation.matches("^<[a-z]$")){
        
            GetFromVarOperation get = new GetFromVarOperation();
            
            operation.getChars(0, 1, ch, 0);//essendo l'operazione formata da 2 char di cui il secondo è la variabile, 
                                            //trasformo la stringa in un array di char, cosa che permette di prendere separatamente gli elementi.
            
            get.execute(this.variable, this.complexNumberStack, ch[1]);
        
        }else if(operation.matches("^>[a-z]$")){
        
            SaveIntoVarOperation save = new SaveIntoVarOperation();
            
            operation.getChars(0, 1, ch, 0);
            
            save.execute(this.variable, complexNumberStack, ch[1]);
        
        }else if(operation.matches("^+[a-z]$")){
        
            PlusVarOperation plus = new PlusVarOperation();
            
            operation.getChars(0, 1, ch, 0);
            
            plus.execute(this.variable, this.complexNumberStack, ch[1]);
        
        }else if(operation.matches("^-[a-z]$")){
        
            MinusVarOperation minus = new MinusVarOperation();

            operation.getChars(0, 1, ch, 0);
            
            minus.execute(this.variable, complexNumberStack, ch[1]); 
        
        }
    }
    
}

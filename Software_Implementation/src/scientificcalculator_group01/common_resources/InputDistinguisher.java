/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.common_resources;

/**
 *
 * @author ciroc
 */
public class InputDistinguisher {
    public InputDistinguisher(){
        
    }
    
    public boolean isComplexNumber(String text){
        // '*' impone l'apparizione del testo che lo precede nella matches 0 o più volte.
        // '?' esplicita che il testo da cui è preceduto nella matches non debba per forza essere presente nella stringa od al massimo una singola volta.
        if(text.matches("^[+-]?[0-9]+[.]?[0-9]*$")){
            return true;
        }else if(text.matches("^[+-]([0-9]+[.]?[0-9]*)?[ij]$")){
            return true;
        }else if(text.matches("^[+-]?[0-9]+[.]?[0-9]*[+-]([0-9]+[.]?[0-9]*)?[ij]$")){
            return true;
        }
        return false;
    }
    
    public boolean isStackOperation(String text){
        return false;
    }
    
    public boolean isMathOperation(String text){
        return false;
    }
    
    public boolean isVariablesOperation(String text){
        return false;
    }
}


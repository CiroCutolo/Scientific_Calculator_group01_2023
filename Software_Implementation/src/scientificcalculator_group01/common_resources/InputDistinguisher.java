/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.common_resources;

/**
 *
 * @author Ciro Cutolo
 */
public class InputDistinguisher {
    public InputDistinguisher(){
    }
    /** 
     * @method public boolean isComplexNumber(String text):
     *         Utile al riconoscimento dell'input come numero complesso.
     * 
     * @method public boolean isStackOperation(String text):
     *         Utile al riconoscimento dell'input come operatore associato ad un operazione agente sullo stack.
     * 
     * @method public boolean isMathOperation(String text):
     *         Utile al riconoscimento dell'input come operatore matematico.
     * 
     * @method public boolean isVariablesOperation(String text):
     *         Utile al riconoscimento dell'input come operatore associato ad un operazione agente su una variabile.
     */
    public boolean isComplexNumber(String text){
        // '*' impone l'apparizione del testo che lo precede nella matches 0 o più volte.
        // '?' esplicita che il testo da cui è preceduto nella matches non debba per forza essere presente nella stringa od al massimo una singola volta.
        if(text.matches("^[+-]?[0-9]+[.]?[0-9]*$")){
            return true;
        }else if(text.matches("^[+-]?([0-9]+[.]?[0-9]*)?[j]$")){
            return true;
        }else if(text.matches("^[+-]?[0-9]+[.]?[0-9]*[+-]([0-9]+[.]?[0-9]*)?[j]$")){
            return true;
        }
        return false;
    }
    
    public boolean isStackOperation(String text){
        if(text.matches("drop")){
            return true;
        }else if(text.equals("dup")){
            return true;
        }else if(text.equals("clear")){
            return true;
        }else if(text.equals("over")){
            return true;
        }else if(text.equals("swap")){
            return true;
        }
        return false;
    }
    
    public boolean isMathOperation(String text){
        if(text.matches("^[+]$")){
            return true;
        }else if(text.matches("^[-]$")){
            return true;
        }else if(text.matches("^[*]$")){
            return true;
        }else if(text.matches("^[/]$")){
            return true;
        }else if(text.equals("+-")){
            return true;
        }else if(text.equals("sqrt")){
            return true;
        }
        return false;
    }
    
    public boolean isVariablesOperation(String text){
        if(text.matches("^[<]+[a-z]$")){
            return true;
        }else if(text.matches("^[>]+[a-z]$")){
            return true;
        }else if(text.matches("^[+]+[a-z]$")){
            return true;
        }else if(text.matches("^[-]+[a-z]$")){
            return true;
        }
        return false;
    }
}


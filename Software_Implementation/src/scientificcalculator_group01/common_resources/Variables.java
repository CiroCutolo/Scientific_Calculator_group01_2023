/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.common_resources;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ciroc
 */
public class Variables {
    private Map <Character,ComplexNumber> varMap;
    
    public Variables(){
        varMap = new HashMap <Character,ComplexNumber> ();
        ComplexNumber num = new ComplexNumber(0);

        for (char letter = 'a'; letter <= 'z'; letter++) {
            varMap.put(Character.valueOf(letter), num);
        }
        
    }
    
    public ComplexNumber getVariable(char name){
    
        
    }
    
    public void setVariable(char name, ComplexNumber value){
        
    }
}

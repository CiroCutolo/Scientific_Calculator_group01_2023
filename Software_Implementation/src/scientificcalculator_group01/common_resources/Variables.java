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
 * @author Aurora Campione
 */
public class Variables {
    private Map <Character,ComplexNumber> varMap;
    
    public Variables(){
        varMap = new HashMap <Character,ComplexNumber> ();

        for (char letter = 'a'; letter <= 'z'; letter++) {
            varMap.put(letter, null);
        }
        
    }
    
    public ComplexNumber getVariable(char name){
        return varMap.get(name);
    
        
    }
    
    public void setVariable(char name, ComplexNumber value){
        varMap.put(name, value);
    }
}

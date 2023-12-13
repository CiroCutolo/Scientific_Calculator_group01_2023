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
 * La classe istanzia una mappa di variabili e permette di mostrarle o modificarle 
 */
public class Variables {
    private Map <Character,ComplexNumber> varMap;
    
    public Variables(){
        varMap = new HashMap <Character,ComplexNumber> ();
    }
    
    /**
     * 
     * @param name
     * @return Restituisce il valore (numero complesso) associato alla variabile specificata come 
     *          parametro.
     */
    public ComplexNumber getVariable(char name){
        return varMap.get(name);
    
        
    }
    
    /**
     * @descrizione Consente di modificare una variabile specificando la coppia nome-valore
     * @param name
     * @param value
     * 
     */
    public void setVariable(char name, ComplexNumber value){
       
        varMap.put(name, value);
    }
}

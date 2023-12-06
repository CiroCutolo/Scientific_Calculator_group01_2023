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
public class ComplexNumber {
    private double a;
    private double b;
    
    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public ComplexNumber(double a){
        this.a = a;
        this.b = 0;
        
    }
    
    public ComplexNumber(String text){
        String a,b;

        int pos = text.indexOf("+", 1);
        if(pos < 0)
            pos = text.indexOf("-", 1);
        
        if(pos < 0){
            if(text.compareTo("i") == 0){
                a = "0";
                b = "1";
            }else if(text.indexOf("i") > 0){
                a = "0";
                b = text.substring(0, text.length()-1);
            }else{
                a = text.substring(0, text.length()-1);
                b = 0;
            }
        }else{
            a = text.substring(0, pos);
            b = text.substring(pos, text.length()-1);
        }

        this.a = Double.parseDouble(a);
        this.b = Double.parseDouble(b);
        
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
    
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    
  
}

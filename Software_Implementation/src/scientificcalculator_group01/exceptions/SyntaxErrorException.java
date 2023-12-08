/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.exceptions;

/**
 *
 * @author Claudia Carucci
 */
public class SyntaxErrorException extends Exception {

    /**
     * Questa eccezione viene lanciata utilizzare in caso di errori 
     * riguardanti il formato dell’operazione o dell'input.
     */
    public SyntaxErrorException() {
    }

    /**
     * Costruttore sovraccarico che consente di 
     * specificare un messaggio di errore.
     *
     * @param msg messaggio di errore.
     */
    public SyntaxErrorException(String msg) {
        super(msg);
    }
}

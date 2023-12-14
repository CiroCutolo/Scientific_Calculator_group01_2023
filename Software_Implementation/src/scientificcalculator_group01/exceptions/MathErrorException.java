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

/**
 * Questa eccezione viene lanciata in caso di errori
 * riguardanti la correttezza delle operazioni matematiche
 */
public class MathErrorException extends Exception {

    /**
     * Costruttore di default
     */
    public MathErrorException() {
    }

    /**
     * Costruttore sovraccarico che consente di
     * specificare un messaggio di errore.
     *
     * @param msg messaggio di errore.
     */
    public MathErrorException(String msg) {
        super(msg);
    }
}

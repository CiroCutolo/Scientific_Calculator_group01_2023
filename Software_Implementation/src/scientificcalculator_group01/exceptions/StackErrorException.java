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
  * Questa eccezione viene lanciata utilizzare in caso di errori 
  * riguardanti le operazioni effettuate rispetto lo stack.
  */
public class StackErrorException extends Exception {

    /**
     * Costruttore di default
     */
    public StackErrorException() {
    }

    /**
     * Costruttore sovraccarico che consente di 
     * specificare un messaggio di errore.
     *
     * @param msg messaggio di errore.
     */
    public StackErrorException(String msg) {
        super(msg);
    }
}

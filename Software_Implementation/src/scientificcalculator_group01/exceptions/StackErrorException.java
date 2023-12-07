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
public class StackErrorException extends Exception {

    /**
     * Creates a new instance of <code>StackErrorException</code> without detail
     * message.
     */
    public StackErrorException() {
    }

    /**
     * Constructs an instance of <code>StackErrorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public StackErrorException(String msg) {
        super(msg);
    }
}

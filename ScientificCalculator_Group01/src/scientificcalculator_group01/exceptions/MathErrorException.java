/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientificcalculator_group01.exceptions;

/**
 *
 * @author ciroc
 */
public class MathErrorException {

    /**
     * Creates a new instance of <code>MathErrorException</code> without detail
     * message.
     */
    public MathErrorException() {
    }

    /**
     * Constructs an instance of <code>MathErrorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MathErrorException(String msg) {
        super(msg);
    }
}

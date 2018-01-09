/**
 * Created by Danial Goodwin on 2018-01-09.
 */
package com.danialgoodwin.java.util;

/** Helper methods related to text. */
public final class TextUtils {

    /** Suppress default constructor for non-instantiability. */
    private TextUtils() { }

    /** Return whether or not the input is an {@link Integer}.
     * @param input text to check as Integer (nullable)
     * @return true if input is an Integer, false if input is not an Integer
     */
    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

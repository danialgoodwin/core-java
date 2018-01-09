/**
 * Created by Danial Goodwin on 2018-01-09.
 */
package com.danialgoodwin.java.util;

/** Helper methods related to collections. */
public final class CollectionUtils {

    /** Suppress default constructor for non-instantiability. */
    private CollectionUtils() { }

    public static double[] newDoubleArray(Collection<Double> collection) {
        double[] array = new double[collection.size()];
        int index = 0;
        for (Double d : collection) { // Enhanced for-loop better for LinkedList
            array[index++] = d;
        }
        return array;
    }

}    

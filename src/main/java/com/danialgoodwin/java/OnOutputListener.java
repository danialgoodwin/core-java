/**
 * Created by Danial Goodwin on 2016-02-10.
 */
package com.danialgoodwin.java;

/** Common interface for generic output callbacks. */
public interface OnOutputListener<T> {
    void onOutput(T output);
}

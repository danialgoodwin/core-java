/**
 * Created by Danial Goodwin on 2016-02-18.
 */
package com.danialgoodwin.java;

/** Common interface for generic output callbacks with success and error. */
public interface OnResultListener<T> {
    void onSuccess(T result);
    void onError(int code, String message);
}

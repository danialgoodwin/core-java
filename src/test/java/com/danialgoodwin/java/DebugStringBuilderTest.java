/**
 * Created by Danial Goodwin on 2016-03-12.
 */
package com.danialgoodwin.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DebugStringBuilderTest {

    private DebugStringBuilder mDebugStringBuilder;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testNewInstance_condensed() throws Exception {
        mDebugStringBuilder = DebugStringBuilder.newInstance("Title", true);
        assertEquals(mDebugStringBuilder.toString(), "Title");
        mDebugStringBuilder.add("a", true);
        assertEquals(mDebugStringBuilder.toString(), "Title,a=true");
        mDebugStringBuilder.add("b", 10);
        assertEquals(mDebugStringBuilder.toString(), "Title,a=true,b=10");
        mDebugStringBuilder.add("c", 5f);
        assertEquals(mDebugStringBuilder.toString(), "Title,a=true,b=10,c=5.0");
        mDebugStringBuilder.add("d", "d");
        assertEquals(mDebugStringBuilder.toString(), "Title,a=true,b=10,c=5.0,d=d");
        mDebugStringBuilder.add("e").add("f");
        assertEquals(mDebugStringBuilder.toString(), "Title,a=true,b=10,c=5.0,d=def");
        mDebugStringBuilder.remove();
        assertEquals(mDebugStringBuilder.toString(), "");
        mDebugStringBuilder.add("g").add("h");
        assertEquals(mDebugStringBuilder.toString(), "gh");
    }

    @Test
    public void testNewInstance_notCondensed() throws Exception {
        mDebugStringBuilder = DebugStringBuilder.newInstance("Title", false);
        assertEquals(mDebugStringBuilder.toString(), "Title:");
        mDebugStringBuilder.add("a", true);
        assertEquals(mDebugStringBuilder.toString(), "Title:\na: true");
        mDebugStringBuilder.add("b", 10);
        assertEquals(mDebugStringBuilder.toString(), "Title:\na: true\nb: 10");
        mDebugStringBuilder.add("c", 5f);
        assertEquals(mDebugStringBuilder.toString(), "Title:\na: true\nb: 10\nc: 5.0");
        mDebugStringBuilder.add("d", "d");
        assertEquals(mDebugStringBuilder.toString(), "Title:\na: true\nb: 10\nc: 5.0\nd: d");
        mDebugStringBuilder.add("e").add("f");
        assertEquals(mDebugStringBuilder.toString(), "Title:\na: true\nb: 10\nc: 5.0\nd: def");
        mDebugStringBuilder.remove();
        assertEquals(mDebugStringBuilder.toString(), "");
        mDebugStringBuilder.add("g").add("h");
        assertEquals(mDebugStringBuilder.toString(), "gh");
    }

    @Test
    public void testAdd() throws Exception {

    }

    @Test
    public void testAddNewLine() throws Exception {

    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }

}
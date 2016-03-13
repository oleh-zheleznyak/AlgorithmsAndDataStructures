package DataStructures.Tests;

import DataStructures.LinkedStack;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by oz on 13.03.2016.
 */
public class LinkedStackTest extends TestCase {

    private LinkedStack<String> _stack;

    public void testPeek() throws Exception {
        _stack.push("foo");
        Assert.assertEquals("foo", _stack.peek());

        _stack.push("bar");
        Assert.assertEquals("bar", _stack.peek());
    }

    public void testPop() throws Exception {
        _stack.push("foo");
        _stack.push("bar");

        String value = _stack.pop();

        Assert.assertEquals("bar", value);
    }

    public void testPush() throws Exception {
        _stack.push("foo");
        Assert.assertFalse(_stack.isEmpty());
        Assert.assertEquals("foo", _stack.peek());
    }

    public void testIsEmpty() throws Exception {

        Assert.assertTrue(_stack.isEmpty());
        _stack.push("blah");
        Assert.assertFalse(_stack.isEmpty());
        _stack.pop();
        Assert.assertTrue(_stack.isEmpty());
    }

    public void setUp() throws Exception {
        super.setUp();
        _stack = new LinkedStack<>();
    }
}
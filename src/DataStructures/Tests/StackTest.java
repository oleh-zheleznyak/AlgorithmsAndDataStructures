package DataStructures.Tests;

import DataStructures.Stack;
import junit.framework.Assert;
import junit.framework.TestCase;

public abstract class StackTest extends TestCase {

    private Stack<String> _stack;

    public abstract void setUp() throws Exception ;

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
}

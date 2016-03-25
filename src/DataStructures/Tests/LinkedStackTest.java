package DataStructures.Tests;

import DataStructures.LinkedStack;
import junit.framework.Assert;
import junit.framework.TestCase;

public class LinkedStackTest extends StackTest {

    public void testPeek() throws Exception {
      super.testPeek();
    }

    public void testPop() throws Exception {
        super.testPop();
    }

    public void testPush() throws Exception {
        super.testPush();
    }

    public void testIsEmpty() throws Exception {
        super.testIsEmpty();
    }

    public void setUp() throws Exception {
        _stack = new LinkedStack<>();
    }
}
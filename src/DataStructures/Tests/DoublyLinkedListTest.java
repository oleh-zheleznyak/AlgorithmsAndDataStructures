package DataStructures.Tests;

import DataStructures.DoublyLinkedList;
import junit.framework.TestCase;
import junit.framework.Assert;

public class DoublyLinkedListTest extends LinkedListTest {

    @Override
    protected void setUp() throws Exception {
        sut = new DoublyLinkedList<>();
    }

    public void testGetHead() throws Exception {
        super.testGetHead();
    }

    public void testGetTail() throws Exception {
        super.testGetTail();
    }

    public void testAddFirst() throws Exception {
        super.testAddFirst();
    }

    public void testRemoveFirst() throws Exception {
        super.testRemoveFirst();
    }

    public void testAddLast() throws Exception {
        super.testAddLast();
    }
    
    public void testGetCount() throws Exception {
        super   .testGetCount();
    }

    public void testRemoveLast() throws Exception {
        DoublyLinkedList<String> sut = new DoublyLinkedList<>();
        sut.addFirst("foo");
        sut.addLast("bar");

        Assert.assertEquals(2, sut.getCount());

        sut.removeLast();

        Assert.assertEquals(1, sut.getCount());

        Assert.assertEquals("foo", sut.getTail().getValue());
    }
}
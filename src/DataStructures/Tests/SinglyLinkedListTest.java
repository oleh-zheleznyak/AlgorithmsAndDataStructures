package DataStructures.Tests;

import DataStructures.SinglyLinkedNode;
import DataStructures.SinglyLinkedList;
import junit.framework.Assert;
import junit.framework.TestCase;

public class SinglyLinkedListTest extends LinkedListTest {

    @Override
    protected void setUp() throws Exception {
        sut = new SinglyLinkedList<>();
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
        SinglyLinkedList<String> sut = new SinglyLinkedList<>();
        sut.addFirst("foo");
        sut.addLast("bar");

        Assert.assertEquals(2, sut.getCount());

        sut.removeLast();

        Assert.assertEquals(1, sut.getCount());

        Assert.assertEquals("foo", sut.getTail().getValue());
    }

    public void testReverse() throws Exception {
        SinglyLinkedList<String> sut = new SinglyLinkedList<>();
        sut.addFirst("first");
        sut.addLast("second");
        sut.addLast("third");
        sut.addLast("fourth");

        sut.reverse();

        Assert.assertEquals(sut.getHead().getValue(), "fourth");
        Assert.assertEquals(sut.getHead().getNext().getValue(), "third");
        Assert.assertEquals(sut.getHead().getNext().getNext().getValue(), "second");
        Assert.assertEquals(sut.getTail().getValue(), "first");
    }
}
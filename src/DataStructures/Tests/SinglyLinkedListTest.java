package DataStructures.Tests;

import DataStructures.LinkedList;
import DataStructures.Node;
import DataStructures.SinglyLinkedList;
import junit.framework.Assert;
import junit.framework.TestCase;


/**
 * Created by oz on 13.03.2016.
 */
public class SinglyLinkedListTest extends TestCase {

    private SinglyLinkedList<String> sut;

    public void setUp() throws Exception {
        super.setUp();
        sut = new SinglyLinkedList<String>();
    }

    public void testGetHead() throws Exception {

        sut.addFirst("foo");

        Node<String> node = sut.getHead();

        Assert.assertEquals("foo", node.getValue());
        Assert.assertNull(node.getNext());
    }

    public void testGetTail() throws Exception {
        sut.addFirst("foo");
        sut.addFirst("bar");

        Node<String> _tail = sut.getTail();

        Assert.assertNotNull(_tail);
        Assert.assertEquals("foo", _tail.getValue());
    }

    public void testAddFirst() throws Exception {
        sut.addFirst("foo");

        Node<String> node = sut.getHead();

        Assert.assertEquals("foo", node.getValue());
        Assert.assertNull(node.getNext());
    }

    public void testRemoveFirst() throws Exception {
        sut.addFirst("foo");
        Assert.assertEquals(1,sut.getCount());

        sut.removeFirst();
        Assert.assertEquals(0,sut.getCount());

    }

    public void testAddLast() throws Exception {
        sut.addLast("foo");
        sut.addLast("bar");

        Node<String> _tail = sut.getTail();

        Assert.assertNotNull(_tail);
        Assert.assertEquals("bar", _tail.getValue());
    }

    public void testGetCount() throws Exception {
        Assert.assertEquals(0,sut.getCount());

        sut.addFirst("boo");
        Assert.assertEquals(1,sut.getCount());

        sut.removeFirst();
        Assert.assertEquals(0,sut.getCount());
    }

    public void testRemoveLast() throws Exception {
        sut.addFirst("foo");
        sut.addLast("bar");

        Assert.assertEquals(2, sut.getCount());

        sut.removeLast();

        Assert.assertEquals(1, sut.getCount());

        Assert.assertEquals("foo", sut.getTail().getValue());
    }
}
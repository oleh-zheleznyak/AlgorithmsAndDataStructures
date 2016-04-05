package DataStructures.Tests;

import DataStructures.LinkedList;
import DataStructures.LinkedListIterator;
import DataStructures.SinglyLinkedList;
import junit.framework.Assert;
import junit.framework.TestCase;

public class LinkedListIteratorTest extends TestCase {

    public void testHasNextAndNext() throws Exception {
        LinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.addFirst("foo");
        linkedList.addLast("bar");

        LinkedListIterator<String> sut = new LinkedListIterator<>(linkedList);

        Assert.assertTrue(sut.hasNext());
        Assert.assertEquals("foo", sut.next());
        Assert.assertTrue(sut.hasNext());
        Assert.assertEquals("bar", sut.next());
        Assert.assertFalse(sut.hasNext());
    }
}
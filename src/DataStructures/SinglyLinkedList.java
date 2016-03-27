package DataStructures;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SinglyLinkedList<T> implements LinkedList<T> {

    private SinglyLinkedNode<T> _head;
    private SinglyLinkedNode<T> _tail;
    private int _count = 0;

    @Override
    public SinglyLinkedNode<T> getHead() {
        return _head;
    }

    @Override
    public SinglyLinkedNode<T> getTail() {
        return _tail;
    }

    @Override
    public void addFirst(T value) {
        if (_count == 0) {
            _head = _tail = new SinglyLinkedNode<>(value, null);
        } else {
            _head = new SinglyLinkedNode<>(value, _head);
        }
        _count++;
    }

    @Override
    public T removeFirst() {
        if (_count == 0) throw new IllegalStateException("linked list is empty");

        T value = _head.getValue();
        _head = _head.getNext();

        if (_count == 1) _head = _tail = null;

        _count--;
        return value;
    }

    @Override
    public void addLast(T value) {
        if (_count == 0) {
            _head = _tail = new SinglyLinkedNode<>(value, null);
        } else {
            SinglyLinkedNode<T> newTail = new SinglyLinkedNode<>(value, null);
            _tail.setNext(newTail);
            _tail = newTail;
        }
        _count++;
    }

    @Override
    public int getCount() {
        return _count;
    }

    /*
    * @deprecated this method is an O(N) operation
     */
    @Deprecated
    public void removeLast() {
        if (_count == 0) throw new IllegalStateException("linked list is empty");
        else if (_count == 1) _head = _tail = null;
        else {

            SinglyLinkedNode<T> current = _head, previous = null;
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
            }

            current.setValue(null);
            previous.setNext(null);
            _tail = previous;
        }
        _count--;
    }

    public void reverse() {
        if (_count <=1) return;

        SinglyLinkedNode<T> previous = null, current = _head, next = null;

        while (current!=null)         {
            next = current.getNext();
            current.setNext(previous);

            previous = current;
            current = next;
        }

        next = _head;
        _head = _tail;
        _tail = next;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    private class SinglyLinkedListIterator<T> implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {

        }
    }
}


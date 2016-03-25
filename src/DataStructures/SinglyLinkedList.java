package DataStructures;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SinglyLinkedList<T> implements LinkedList<T> {

    private Node<T> _head;
    private Node<T> _tail;
    private int _count = 0;

    @Override
    public Node<T> getHead() {
        return _head;
    }

    @Override
    public Node<T> getTail() {
        return _tail;
    }

    @Override
    public void addFirst(T value) {
        if (_count == 0) {
            _head = _tail = new Node<>(value, null);
        } else {
            _head = new Node<>(value, _head);
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
            _head = _tail = new Node<>(value, null);
        } else {
            Node<T> newTail = new Node<>(value, null);
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

            Node<T> current = _head, previous = null;
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


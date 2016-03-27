package DataStructures;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DoublyLinkedList<T> implements LinkedList<T> {
    private DoublyLinkedNode<T> _head, _tail;
    private int _count;

    @Override
    public DoublyLinkedNode<T> getHead() {
        return _head;
    }

    @Override
    public DoublyLinkedNode<T> getTail() {
        return _tail;
    }

    @Override
    public void addFirst(T value) {
        if (_count == 0) {
            _head = _tail = new DoublyLinkedNode<>();
        } else {
            DoublyLinkedNode<T> newHead = new DoublyLinkedNode<>();
            newHead.setNext(_head);
            _head.setPrevious(newHead);
            _head = newHead;
        }
        _count++;
        _head.setValue(value);
    }

    @Override
    public T removeFirst() {
        if (_count == 0) throw new IllegalStateException("linked list is empty");

        T value = _head.getValue();

        if (_count == 1) {
            _head = _tail = null;
        } else {
            DoublyLinkedNode<T> newHead = _head.getNext();
            _head.setNext(null);
            newHead.setPrevious(null);
            _head = newHead;
        }

        _count--;
        return value;
    }

    @Override
    public void addLast(T value) {
        if (_count == 0) {
            _head = _tail = new DoublyLinkedNode<>();
        } else {
            DoublyLinkedNode<T> newTail = new DoublyLinkedNode<>();
            newTail.setPrevious(_tail);
            _tail.setNext(newTail);
            _tail = newTail;
        }
        _tail.setValue(value);
        _count++;
    }

    public T removeLast() {
        if (_count == 0) throw new IllegalStateException("linked list is empty");

        T value = _tail.getValue();

        if (_count == 1) {
            _head = _tail = null;
        } else {
            DoublyLinkedNode<T> newTail = _tail.getPrevious();
            _tail.setPrevious(null);
            newTail.setNext(null);
            _tail = newTail;
        }

        _count--;
        return value;
    }

    @Override
    public int getCount() {
        return _count;
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
}

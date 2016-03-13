package DataStructures;

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
}


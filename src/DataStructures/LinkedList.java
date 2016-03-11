package DataStructures;

public class LinkedList<T> {

    private Node<T> _head;
    private Node<T> _tail;
    private int _count = 0;

    public Node<T> getHead() {
        return _head;
    }

    public Node<T> getTail() {
        return _tail;
    }

    public void AddFirst(T value) {
        if (get_count() == 0) {
            _head = _tail = new Node<>(value, null);
        } else {
            _head = new Node<>(value, _head);
        }
        _count = get_count() + 1;
    }

    public void AddLast(T value) {
        if (get_count() == 0) {
            _head = _tail = new Node<>(value, null);
        } else {
            Node<T> newTail = new Node<>(value, null);
            _tail.setNext(newTail);
        }
        _count = get_count() + 1;
    }

    public int get_count() {
        return _count;
    }
}


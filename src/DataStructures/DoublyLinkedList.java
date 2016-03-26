package DataStructures;

public class DoublyLinkedList<T>  {
    private DoublyLinkedNode<T> _head, _tail;
    private int _count;

    public Node<T> getHead() {
        return _head;
    }

    public Node<T> getTail() {
        return _tail;
    }

    public void addFirst(T value) {
        if (_count ==0) {
            _head = _tail = new DoublyLinkedNode<>();
        }
        else {
            DoublyLinkedNode<T> newHead = new DoublyLinkedNode<>();
            newHead.setNext(_head);
            _head.setPrevious(newHead);
            _head = newHead;
        }
        _count++;
        _head.setValue(value);
    }

    public T removeFirst() {
        if (_count == 0) throw new IllegalStateException("linked list is empty");

        T value = _head.getValue();

        if (_count == 1) {
            _head = _tail = null;
        }
        else {
            DoublyLinkedNode<T> newHead = _head.getNext();
            _head.setNext(null);
            newHead.setPrevious(null);
            _head = newHead;
        }

        _count--;
        return  value;
    }

    public void addLast(T value) {
        if (_count ==0) {
            _head = _tail = new DoublyLinkedNode<>();
        }
        else
        {
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
        }
        else {
            DoublyLinkedNode<T> newTail = _tail.getPrevious();
            _tail.setPrevious(null);
            newTail.setNext(null);
            _tail = newTail;
        }

        _count--;
        return value;
    }

    public int getCount() {
        return  _count;
    }
}

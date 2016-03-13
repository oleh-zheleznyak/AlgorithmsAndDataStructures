package DataStructures;

/**
 * Created by oz on 13.03.2016.
 */
public class LinkedStack<T> {

    private LinkedList<T> _linkedList = new SinglyLinkedList<>();

    public T peek() {
        return  _linkedList.getHead().getValue();
    }

    public T pop() {
        T value = _linkedList.getHead().getValue();
        _linkedList.removeFirst();
        return value;
    }

    public void push(T value) {
        _linkedList.addFirst(value);
    }

    public boolean isEmpty() {
        return _linkedList.getCount() == 0;
    }

}

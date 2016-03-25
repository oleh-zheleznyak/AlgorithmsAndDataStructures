package DataStructures;

public class LinkedStack<T> implements Stack<T> {

    private LinkedList<T> _linkedList = new SinglyLinkedList<>();

    @Override
    public T peek() {
        return  _linkedList.getHead().getValue();
    }

    @Override
    public T pop() {
        T value = _linkedList.getHead().getValue();
        _linkedList.removeFirst();
        return value;
    }

    @Override
    public void push(T value) {
        _linkedList.addFirst(value);
    }

    @Override
    public boolean isEmpty() {
        return _linkedList.getCount() == 0;
    }

}

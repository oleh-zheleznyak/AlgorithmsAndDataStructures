package DataStructures;

public class DoublyLinkedNode<T> implements Node<T> {

    private DoublyLinkedNode<T> _previous, _next;
    private T _value;

    public DoublyLinkedNode<T> getPrevious() {
        return _previous;
    }

    public void setPrevious(DoublyLinkedNode<T> previous) {
        _previous = previous;
    }

    @Override
    public DoublyLinkedNode<T> getNext() {
        return _next;
    }

    public void setNext(DoublyLinkedNode<T> next) {
        _next = next;
    }

    @Override
    public T getValue() {
        return _value;
    }

    public void setValue(T value) {
        _value = value;
    }
}

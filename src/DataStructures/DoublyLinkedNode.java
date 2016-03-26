package DataStructures;

public class DoublyLinkedNode<T> {

    private DoublyLinkedNode<T> _previous, _next;
    private T _value;

    public DoublyLinkedNode<T> getPrevious() {
        return _previous;
    }

    public void setPrevious(DoublyLinkedNode<T> previous) {
        _previous = previous;
    }

    public DoublyLinkedNode<T> getNext() {
        return _next;
    }

    public void setNext(DoublyLinkedNode<T> next) {
        _next = next;
    }

    public T getValue() {
        return _value;
    }

    public void setValue(T value) {
        _value = value;
    }
}

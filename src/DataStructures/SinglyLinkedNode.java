package DataStructures;

public class SinglyLinkedNode<T> implements Node<T> {
    public SinglyLinkedNode(T value, SinglyLinkedNode<T> next) {
        setValue(value);
        setNext(next);
    }

    private T Value;
    private SinglyLinkedNode<T> Next;

    @Override
    public T getValue() {
        return Value;
    }

    @Override
    public SinglyLinkedNode<T> getNext() {
        return Next;
    }

    public void setValue(T value) {
        Value = value;
    }

    public void setNext(SinglyLinkedNode<T> next) {
        Next = next;
    }
}

package DataStructures;

public class Node<T> {
    public Node(T value, Node<T> next) {
        setValue(value);
        setNext(next);
    }

    private T Value;
    private Node<T> Next;

    public T getValue() {
        return Value;
    }

    public Node<T> getNext() {
        return Next;
    }

    public void setValue(T value) {
        Value = value;
    }

    public void setNext(Node<T> next) {
        Next = next;
    }
}

package DataStructures;

public interface LinkedList<T> extends Iterable<T> {
    Node<T> getHead();

    Node<T> getTail();

    void addFirst(T value);

    T removeFirst();

    void addLast(T value);

    int getCount();
}

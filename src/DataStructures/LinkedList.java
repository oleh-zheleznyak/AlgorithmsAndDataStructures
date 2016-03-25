package DataStructures;

/**
 * Created by oz on 13.03.2016.
 */
public interface LinkedList<T> extends Iterable<T> {
    Node<T> getHead();

    Node<T> getTail();

    void addFirst(T value);

    T removeFirst();

    void addLast(T value);

    int getCount();
}

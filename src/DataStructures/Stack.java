package DataStructures;

public interface Stack<T> extends Iterable<T> {
    T peek();

    T pop();

    void push(T value);

    boolean isEmpty();
}

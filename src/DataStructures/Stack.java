package DataStructures;

public interface Stack<T> {
    T peek();

    T pop();

    void push(T value);

    boolean isEmpty();
}

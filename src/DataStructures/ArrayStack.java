package DataStructures;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ArrayStack<T> implements Stack<T> {

    private static final int initialSize = 2;
    private static final int growFactor = 2;
    private static final int shrinkFactor = 2;

    private int _count = 0;
    private T[] _array = (T[]) new Object[initialSize];


    @Override
    public T peek() {
        return _array[_count-1];
    }

    @Override
    public T pop() {
        T value = _array[_count-1];
        _array[_count-1] = null;

        if (_count * 2 == _array.length) shrinkArray();
        _count--;

        return value;
    }

    @Override
    public void push(T value) {
        if (_count == _array.length) growArray();
        _array[_count++] = value;
    }

    @Override
    public boolean isEmpty() {
        return _count == 0;
    }

    private void growArray() {
        resize(_array.length * growFactor);
    }

    private void shrinkArray() {
        resize(_array.length / shrinkFactor);
    }

    private void resize(int newSize) {
        T[] newArray = (T[]) new Object[newSize];
        System.arraycopy(_array, 0, newArray, 0, _count);
        _array = newArray;
    }

    @Override
    public Iterator<T> iterator() {
        Stream<T> stream;
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}

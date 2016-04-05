package DataStructures;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {

    public LinkedListIterator(LinkedList<T> linkedList) {
        _node = linkedList.getHead();
    }

    private Node<T> _node;

    @Override
    public boolean hasNext() {
        return  _node !=null;
    }

    @Override
    public T next() {
        T value =  _node.getValue();
        _node = _node.getNext();
        return  value;
    }
}

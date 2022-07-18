package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Iterator
 */

public class IteratorUser<E> implements Iterator<E> {

    private int index = 0;
    private final E[] values;

    public IteratorUser(E[] values) {
        this.values = values;
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */

    @Override
    public E next() {
        return values[index++];
    }

    /**
     * Removes from the underlying collection the last element returned
     * by this iterator (optional operation).  This method can be called
     * only once per call to {@link #next}.
     */

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}

package entity;

import impl.ListUser;
import iterator.IteratorUser;
import service.Service;

import java.util.Iterator;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see ListUser
 */

public class ArrayListUser<E> implements ListUser<E> {

    private E[] values;

    /**
     * Constructor.
     * When called, creates a new list of dimension 0
     */

    public ArrayListUser() {
        values = (E[]) new Object[0];
    }

    /**
     * Adds a new element to the list and increments its size by 1
     *
     * @param object object to add
     */

    @Override
    public void add(E object) {
        try {
            int start = values.length;

            E[] tmp = values;
            values = (E[]) new Object[tmp.length + 1];
            System.arraycopy(tmp, 0, values, 0, tmp.length);
            values[values.length - 1] = object;

            Service.checkChanged(start, values.length, "add");

        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete element from the list and reduces its size by 1
     *
     * @param index the index of the element in the list
     */

    @Override
    public void delete(int index) {

        try {
            int start = values.length;

            E[] tmp = values;
            values = (E[]) new Object[tmp.length - 1];

            System.arraycopy(tmp, 0, values, 0, index);
            int count = tmp.length - index - 1;

            System.arraycopy(tmp, index + 1, values, index, count);
            Service.checkChanged(start, values.length, "delete");

        } catch (ClassCastException e) {
            e.printStackTrace();
        }

    }

    /**
     * @param index the index of the element in the list
     * @return returns the element of the list by its index
     */

    @Override
    public E get(int index) {
        return values[index];
    }

    /**
     * @return returns full list
     */

    @Override
    public E[] getAll() {
        E[] tmp = values;
        System.arraycopy(values, 0, tmp, 0, values.length);
        return tmp;
    }

    /**
     * @return list size
     */

    @Override
    public int size() {
        return values.length;
    }

    /**
     * Replaces the value of an element by index
     *
     * @param index  the index of the element in the list
     * @param object new object
     */

    @Override
    public void update(int index, E object) {
        values[index] = object;
    }

    /**
     * @return Returns true if the iteration has more elements.
     */

    @Override
    public Iterator<E> iterator() {
        return new IteratorUser<>(values);
    }
}

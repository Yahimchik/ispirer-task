package impl;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see Iterable
 */

public interface ListUser<E> extends Iterable<E> {

    E[] getAll();

    void add(E object);

    void delete(int index);

    E get(int index);

    int size();

    void update(int index, E object);
}

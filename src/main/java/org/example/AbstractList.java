package org.example;


public abstract class AbstractList<T> implements IList<T> {
    protected int size = 0;

    public int size() {
        return size;
    }
}

package Task1;

import java.util.Iterator;

public class Array<T> implements Iterable<T> {
    private T[] list;
    private int size;

    public Array(T[] list) {
        this.list = list;
        this.size = list.length;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i < size && list[i] != null;
            }

            @Override
            public T next() {
                return list[i++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}

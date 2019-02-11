package ua.hillel.antonova.lesson18;

import hillel.antonova.lesson18.Palec;

import java.util.Collection;
import java.util.Iterator;

public class OwnCollection implements Collection {
    private Object[] objects = new Object[0];

    public OwnCollection(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public int size() {

            return objects.length;
    }

    @Override
    public boolean isEmpty() {
            return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for(Object obj: objects) {
            if (obj.equals(o)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public Iterator iterator() {


        }
        return Palec(Object[]);
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[this.size()];
        for (int i = 0; i < this.size(); i++) {
            result[i] = objects[i];
        }
        return result;
    }

    @Override
    public boolean add(Object o) {

        Object[] newArray = new Object[size() + 1];
        for (int i = 0; i < size(); i++) {
            newArray[i] = objects[i];
        }
        newArray[size()] = 0;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {

        for (Object o: c) {
            add(o);
        }
        return false;
    }

    @Override
    public void clear() {
        objects = new Object[0];

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public static class Palec implements Iterator {

        private final Object[] objects;

        private int index = 0;

        public Palec(Object[] objects) {
            this.objects = objects;
        }

        @Override
        public boolean hasNext() {
            return index < objects.length;
        }

        @Override
        public Object next() {
            if (index == objects.length) {
                throw new IndexOutOfBoundsException("oh-oh");
            }
            Object result = objects[index];
            index++;
            return result;
        }
    }
}

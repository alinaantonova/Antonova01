package ua.hillel.antonova.lesson18;

import java.util.Collection;
import java.util.Iterator;

public class OwnCollection implements Collection {
    private Object[] objects;

    public OwnCollection(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public int size() {
        if  (objects == null)
        {
            return 0;
        }
        else {
            return objects.length;
        }

    }

    @Override
    public boolean isEmpty() {
        if (objects == null)
        {
            return true;
        }
        else {

            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        for(Object obj: objects) {
            if (obj == o) {
                return true;
            }
        }
        return false;
    }


    @Override
    public Iterator iterator() {
        return null;
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
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

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
}

package model.tree;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator<T extends HumanItem<T>> implements Iterator<T> {
    private List<T> list;
    private int index;

    public FamilyTreeIterator(List<T> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}
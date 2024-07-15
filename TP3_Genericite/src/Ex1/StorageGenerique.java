package Ex1;

import java.util.ArrayList;
import java.util.List;

public class StorageGenerique<T> {
    private List<T> elements;

    public StorageGenerique() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T o) {
        elements.add(o);
    }

    public T getElement(int index) {
        return elements.get(index);
    }

    public void removeElement(int index) {
        elements.remove(index);
    }

    public int getSize() {
        return elements.size();
    }
}


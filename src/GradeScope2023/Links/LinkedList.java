package GradeScope2023.Links;

import java.util.Iterator;

public interface LinkedList<E> {
    void addItemToFront(E item);

    void addItemToRear(E item);

    Iterator<E> iterator();
}
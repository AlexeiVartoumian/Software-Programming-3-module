package GradeScope2023.Links;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class LinkedListImpl implements  LinkedList<ListElement>{

    private ListElement head;

    private Iter iter;
    public LinkedListImpl(ListElement head ){
        this.head = head;
        iter = new Iter(this.head);
    }

    @Override
    public void addItemToFront(ListElement item) {

        while (iter.hasNext()){
            iter = new Iter(iter.next());
        }
        iter.getCurEl().setNext(item);
        item.setPrev(iter.getCurEl());
    }

    @Override
    public void addItemToRear(ListElement item) {

        while(iter.hasPrev()){
            iter = new Iter(iter.prev());
        }
        iter.getCurEl().setPrev(item);
        item.setNext(iter.getCurEl());
    }

    @Override
    public Iterator<ListElement> iterator() {
        return new Iter(head);
    }
    class Iter implements Iterator<ListElement>{

        ListElement curEl;

        public Iter(ListElement el){
            this.curEl = el;
        }
        @Override
        public void remove() {
            Iterator.super.remove();
        }

        @Override
        public void forEachRemaining(Consumer<? super ListElement> action) {
            Iterator.super.forEachRemaining(action);
        }

        @Override
        public boolean hasNext() {
            return !(curEl.getNext() == null);
        }

        @Override
        public ListElement next() throws NoSuchElementException {

            try {
                if (hasNext()) {
                    this.curEl = this.curEl.getNext();
                    return curEl;
                }
            } catch (NoSuchElementException e) {
                System.out.println(e);
            }
            return null;
        }
        public boolean hasPrev(){
            return !(curEl.getPrev() == null);
        }

        public ListElement prev() throws NoSuchElementException {

            try {
                if (hasPrev()) {
                    this.curEl = this.curEl.getPrev();
                    return curEl;
                }
            } catch (NoSuchElementException e) {
                System.out.println(e);
            }
            return null;
        }

        public ListElement getCurEl(){
            return this.curEl;
        }
    }
}

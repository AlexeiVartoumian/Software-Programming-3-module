package ExamPrac3.Take2.Q2;

import java.util.Iterator;

public class LinkedList1<T>{

    private ListElement<T> head;
    private  iter iter;


    public LinkedList1(ListElement<T> head){
        this.head = head;
        this.iter = new iter(head);
    }
    public void addToFront(ListElement<T> item){

        while (iter.hasNext()){

            iter.setHead(iter.next());
        }

       iter.getHead().setNext(item);
        item.setPrev(iter.getHead());
    }

    public void addToBack(ListElement<T> item){
        while (iter.hasPrevious()){

            iter.setHead(iter.prev());
        }
        iter.getHead().setPrev(item);
        item.setNext(iter.getHead());
    }
    public class iter implements Iterator<ListElement<T>>  {

        public ListElement<T> head;

        public iter( ListElement<T> head){
            this.head = head;

        }
        @Override
        public boolean hasNext(){
            return !(head.getNext() == null);
        }

        public boolean hasPrevious(){
            return !(head.getPrev() == null);
        }

        @Override
        public ListElement<T> next() {

            if (hasNext()){
                return head.getNext();
            }
            return null;
        }
        public ListElement<T> prev(){
            if (hasPrevious()){
                return  head.getPrev();
            }
            return null;
        }
        public ListElement<T> getHead(){
            return this.head;
        }
        public void setHead(ListElement<T> head){
            this.head = head;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }
    }

}

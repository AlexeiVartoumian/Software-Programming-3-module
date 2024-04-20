package ExamPrac3.Take2.Q2;

public class Main {

    public static void main(String[] args) {


        /*
        Write a class ListElement in Java to represent the elements in a linked list.

        part two create a linked list class that also has an intance of iterator
        that is implemented as a nested class

        also implement the addtoback and addtoFront using this iterator
         */

        ListElement<Integer> h = new ListElement<>(1);
        ListElement<Integer> h2 = new ListElement<>(2);
        ListElement<Integer> h3 = new ListElement<>(3);
        ListElement<Integer> h4 = new ListElement<>(4);
        h.setNext(h2);
        h2.setPrev(h);
        h2.setNext(h3);
        h3.setPrev(h2);
        ListElement<Integer> h5 = new ListElement<>(5);
        LinkedList1<Integer> thing = new LinkedList1<>(h);
        thing.addToBack(h4);
        thing.addToFront(h5);

        ListElement<Integer> thingy = h;
        while (thingy != null){
            System.out.println(thingy.getData());
            thingy = thingy.getNext();
        }
        thingy = h5;
        System.out.println("--------------");
        while (thingy != null){
            System.out.println(thingy.getData());
            thingy = thingy.getPrev();
        }
    }
}

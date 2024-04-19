package GradeScope2023.Links;

public class Main {
    public static void main(String[] args) {

        ListElement h1 = new ListElement(1);
        ListElement h2 = new ListElement(2);
        ListElement h3 = new ListElement(3);
        ListElement h4 = new ListElement(4);
        ListElement h5 = new ListElement(5);

        ListElement h0 = new ListElement(0);
        h1.setNext(h2);
        h2.setPrev(h1);
        h2.setNext(h3);
        h3.setPrev(h2);
        h3.setNext(h4);
        h4.setPrev(h3);

        LinkedListImpl thing = new LinkedListImpl(h1);

        thing.addItemToFront(h5);

        ListElement copy = h1;
        while (copy != null){
            System.out.println(copy.data);
            copy = copy.getNext();
        }

        thing.addItemToRear(h0);
        ListElement copy2 = h5;
        while (copy2 != null){
            System.out.println(copy2.data);
            copy2 = copy2.getPrev();
        }
    }
}

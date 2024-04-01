package ExamPrac3.Q2;

public class LinkedList {

    ListElement head;

    ListElement next;

    public LinkedList( int data){
        this.head = new ListElement(data);
        this.next = null;
    }

    public LinkedList(ListElement el ){
        this.head = el;
    }
    public ListElement getNeighbour(){

        return this.next;
    }
    public void setNext( ListElement next){
        this.next = next;
    }

}

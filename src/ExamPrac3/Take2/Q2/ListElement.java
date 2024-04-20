package ExamPrac3.Take2.Q2;

public class ListElement <T>{

    private T data;
    private ListElement<T> next;
    private ListElement<T> prev;

    public ListElement(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public void setNext(ListElement<T> next) {
        this.next = next;
    }
    public void setPrev(ListElement<T> prev) {
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public ListElement<T> getNext() {
        return next;
    }

    public ListElement<T> getPrev() {
        return prev;
    }
}

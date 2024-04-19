package GradeScope2023.Links;

import java.util.Objects;

public class ListElement {

    Integer data;

    private ListElement next;
    private ListElement prev;

    public ListElement getNext() {
        return next;
    }

    public ListElement getPrev() {
        return prev;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ListElement that = (ListElement) object;
        return Objects.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    public ListElement(Integer data){
        this.data = data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setNext(ListElement next) {
        this.next = next;
    }

    public void setPrev(ListElement prev) {
        this.prev = prev;
    }

    public Integer getData() {
        return data;
    }
}

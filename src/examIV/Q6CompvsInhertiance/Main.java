package examIV.Q6CompvsInhertiance;

public class Main {
    public static void main(String[] args) {

        /*
        For each of the following operations, state whether it is better to use an ArrayList, or a LinkedList,  or whether it makes little difference to the efficiency:

    add(0, item)
    get(index)
    remove(item)
    add(item)
    Provide brief reasons for your answers.
         */

        /*
        add(0, item) -> Linkedlist , because for an incredibly large collection this will be an expensive operation
        for an arrayList taking O(n) time whereas it will be constant for a linkedlist
        get(index) -> arraylist will win slightly here as no matter what a linked list will have to traverse the entire
        list until it finds the element .
        remove(item) -> Linkedlist this is a constant operation similar to add above
        add(item) -> the operation itself will always be constant time in linkedlist

         */
    }
}

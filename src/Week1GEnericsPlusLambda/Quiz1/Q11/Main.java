package Week1GEnericsPlusLambda.Quiz1.Q11;

/**
 * Consider this class:
 *
 * class Node<T> implements Comparable<T> {
 *     public int compareTo(T obj) { }
 *     // ...
 * }
 *     Will the following code compile? If not, why not?
 *
 *         Node<String> node = new Node<>();
 *         Comparable<String> comp = node;
 */
public class Main {
    public static void main(String[] args) {

        //It will compile as Node can be reffered to as type Comparable since it implements it.
    }
}

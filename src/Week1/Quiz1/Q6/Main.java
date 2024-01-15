package Week1.Quiz1.Q6;

import java.util.Comparator;

//What is the following method converted to after type erasure?
//
//public static <T extends Comparable<T>>
//    int findFirstGreaterThan(T[] at, T elem) {
//            // ...
//            }
public class Main {
    public static void main(String[] args) {

        // since Comparable is the upper bound the static method will be type erased to type Comparable.

    }
    public static <T extends Comparable<T>> int findFirstGreaterThan(T[] at , T elem) {
        return 0;
    }
}

package Week1.Quiz1.Q8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;

/**
 * Write a generic method to find the maximal element in the range [begin, end) of a list.
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> someList = new ArrayList<>(List.of(10,2,30,4));
        List<String> names = new ArrayList<>(List.of("tony","silvio","bella","zman"));


        //Comparator<Integer> compareints = (o1,o2) -> o1.compareTo(o2);
        Comparator<Integer> compareints = Integer::compareTo;
        Comparator<String> compareStrings = String::compareTo;
        System.out.println(maximalEL(someList, 0,3,compareints));
        System.out.println(maximalEL(names, 0,3,compareStrings));
    }

    public static <T> T maximalEL(List<T> someList, int start, int end, Comparator<T>comparator){

        T res = someList.get(start);

        for (int i = start+1; i <=end ; i++) {
            res = comparator.compare( res , someList.get(i)) <0 ? someList.get(i) : res;

        }
        return res;
    }
}

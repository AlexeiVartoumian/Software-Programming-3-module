package Week1.Quiz1.Q1;



import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Write a generic method to count the number of elements in a collection that have a specific property
 * (for example, odd integers, prime numbers, palindromes).
 */
public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(List.of("Silvio","Tony", "Paulie", "Pen"));


        Predicate<String> isodd = word -> word.length() % 2 == 1;
        System.out.println(count(names,isodd));
    }

    public static <T> int count(List<T> someList, Predicate<T> func){
        int result = 0;
        for(var obj : someList){
            if (func.test(obj)){
                result+=1;
            }
        }
        return result;
    }
}

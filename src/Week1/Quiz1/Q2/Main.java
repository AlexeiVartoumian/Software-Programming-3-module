package Week1.Quiz1.Q2;


/**
 Will the following class compile? If not, why not?

 public final class Algorithm {
 public static <T> T max(T x, T y) {
 return x > y ? x : y;
 }
 }
 */
public class Main {
    public static void main(String[] args) {

//        The answer is no because the ternary statement inside
//        is evaluating the numerical value with (the > operator).This requires some implicit knowledge about Type T where T
//        is supposed to represent any type. To achieve the intended functionality The Comparator Interface can be Used.
//        It will accept type T for  comparing the two.


    }

}

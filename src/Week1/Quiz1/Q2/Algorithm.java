package Week1.Quiz1.Q2;

// Below wont compile
//public final class Algorithm {
//    public static <T> T max(T x , T y){
//        return x > y ? x : y;
//    }
//}

import java.util.Comparator;

public final class Algorithm{
    public static <T> T max(T x , T y,Comparator<T>comparator ){

        return comparator.compare(x,y) > 0 ? x : y ;
    }
}
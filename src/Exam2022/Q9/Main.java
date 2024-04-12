package Exam2022.Q9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        You are required to write a list class, MeList, that has a method filter that
        takes an anonymous inner class as a formal parameter
         */
        ArrayList<Integer> thingy  =  new ArrayList<>( List.of(0,1,2,3,4,5,6,7,8,9,10));
        MyList<Integer> thing = new MyList<>(thingy);
        thing.filter( i -> i % 3 == 0);
        System.out.println(thing);

//        List<Integer>  empty =  Stream
//                .generate(() -> 0)
//                .limit(thingy.size())
//                .toList();

        List<Integer> empty = new ArrayList<>(Collections.nCopies(thingy.size(), 0));

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i < thingy.size(); i++) {
            int count = i;
            int j = count;
            while (j < empty.size()){
                if (empty.get(count) == 0){
                    primes.add(i);
                }
                empty.set(j, i);

                j+= count;
            }
        }
        System.out.println(thingy);
        System.out.println(empty);
        System.out.println(primes);
    }
}

//class seive implements  Sieve{
//
//
//    @Override
//    Sieve(){
//
//    }
//
//
//}

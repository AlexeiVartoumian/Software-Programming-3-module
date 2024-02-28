package Week1GEnericsPlusLambda.Quiz1.Q4;

import java.util.List;

/**
 * If the compiler erases all type parameters at compile-time, why should you use generics?
 * Provide three reasons with appropriate supporting examples.
 */

public class Main {


    class Item extends box{}
    class Pen extends Item{}

    public static void main(String[] args) {

        /**
         * 1. flexibility. I think im allowed to say that generics is all about
         * type checking specifically at compile time. This allows a given program to
         * for example not having to specify either types or a specific subtype with wildcards
         * below static method will read and only be able to read all subclasses of type box and perform an operation which is
         * useful for creating a utility method for all sub-classes of a given type
         *
         * 2.I make the argument that the question statement does not consider that generics allow the writing of re-usable
         * code. I can for example have an Array method that does operations on any Array and not being restricted to a specific type of array,
         * in other words not having to rewrite the same array method for a specific type.
         *
         * 3. It allows for programmable types for parameters which allow a given function to be applied on a the set of parameters.
         */

    }
    public static <T> int dostuff(List<? extends box> items){
        int count = 0;
        for (var obj : items){
            count+=1;
        }
        return count;
    }
}
class box{
    public box(){};
}
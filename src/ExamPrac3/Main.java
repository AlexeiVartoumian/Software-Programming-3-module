package ExamPrac3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        /*
                /*
        Q715 Points
    Grading comment:
    Suppose that you are forbidden from using printf or Integer.toHexString,
     or indeed any other existing library way of doing it,
     but you still need to display a Java integer in hexadecimal as one to eight digits.
     For instance, you are to display the number 19 (decimal) as the string 13, and -1 must come out as ffffffff.
     Write a Java method called toHex that takes an integer as its argument and
     returns the string form of the hexadecimal representation of that number.
     Explain clearly how your code works, commenting on how it avoids displaying unnecessary leading zeros
     and how negative numbers are handled.
         */
        int num = 500;

        InttoHex thing = new InttoHex(num);

        System.out.println(Arrays.toString(thing.getNumbers()));

        while (num != 0 ) {
            int pow = InttoHex.howmany(num);
            num -= (int) Math.pow(2, pow);
            thing.placer(pow, thing.getNumbers());
        }

        System.out.println(thing.converter(thing.getNumbers()) + "hahaha");

        System.out.println(thing.reader(thing.getActual()));
    }
}

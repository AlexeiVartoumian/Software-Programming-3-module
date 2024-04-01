package Exam1Take1TookTooLong.Q7Recursion;

public class Main {
    public static void main(String[] args) {

        /*
        Q7 Recursion
22 Points
Question 7.1
Q7.17 Points
Grading comment:
Write a recursive method fib which, given an integer n computes and returns the n-th Fibonacci number.
The first two Fibonacci numbers are 1. Every other Fibonacci number is the sum of the previous two Fibonacci numbers.
Ensure you use recursion in your solution.

Question 7.2
Q7.215 Points
Grading comment:
Your Fibonacci method works, but it is very slow for larger numbers! If you examine the recursive calls, you should notice that some Fibonacci numbers are computed more than once.

You are now required to implement a method Memo which takes a function f and returns its memoised version.
The memoised function stores an immutable Map data structure that maps function arguments to return values.

Each time the memoised function is applied to some argument it uses the Map to check if it was previously applied to that argument.  If it was, it returns the return value associated with that argument. Otherwise, it uses the original function f to compute the value and returns it.

For example, in pseudo-code:

var memof = memo(fib)
memof(10)
memof(10)
will not recompute all the Fibonacci numbers up to 10 the second time memof is called.

Implement the method memo.
         */
        System.out.println(fib(6));
    }

    public static  int  fib(int num) {

        if (num == 1 ){
            return 1;
        } else if (num == 0) {
            return 0;
        }
        return fib(num -1) + fib(num-2);

    }

    public static int fib2( int num){

        return num;
    }
}

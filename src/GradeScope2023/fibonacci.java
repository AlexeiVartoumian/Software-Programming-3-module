package GradeScope2023;

public class fibonacci {


    public static int fib(int term){

        if (term == 0 || term == 1){
            return 1;
        }

        return fib(term-1) + fib(term-2);

    }
}

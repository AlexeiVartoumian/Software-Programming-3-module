package Exam2022.Q3;

public class Main {
    public static void main(String[] args) {

            /*
            (a) What is a parameterised type? 5 marks
             How do generics promote type safety?
             Provide an example to illustrate your answer.
             a parameterised type is  an argument that is passed into some function and must explicity obey the rules
             defined by what sort of type the consuming service requires.
             Generics promote type safety by enforcing the above allowing for the flexibility of passing in different
             subtypes during runtime i.e polymorhism but ensuring that those types can be passed in
             for example public interface Stack <T>{}
             means that once Stack is implmeneted T is a upper Bound of the Inehritance heirarchy
             (b) Write the syntax you would use to express a wild card with a lower bound 2 marks
             of some type T.
             <? super T>
             (c) Which overloaded method is called by the following program? 3 marks
             import java.util.Date;
             public class Overload {
             public static void someOverloadedMethod(Object o) {
                System.out.println("call to someOverloadedMethod(Object o)");
                }
                public static void someOverloadedMethod(Date d){
                System.out.println("call to someOverloadedMethod(Date d)");
                }
                public static <T> void methodCaller(T t){
                someOverloadedMethod(t);
                }
                public static void main(String[] args){
                methodCaller(new Date());
                }
                }

                Here it will be the first one Since that is the most generic Method.
             */

    }
}

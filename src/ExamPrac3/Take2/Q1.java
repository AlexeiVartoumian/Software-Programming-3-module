package ExamPrac3.Take2;

public class Q1 {
    public static void main(String[] args) {

        /*
        Briefly explain each of the following Java terms:
         static method, dynamic binding, cast expression, protected, overriding, this
         */

        /*
        Static method : a method belonging to a class that doe not need the instantation of the class to be called
        Dynamic binding : used at runtime for example in the context of dependecy injection where two objects
        wired together typically because one object requires the services of another so as to perform its function.
        cast expression : feature of the Java Language type system. because all objects inherit from type object
        casting is used to explicity determine the type of an object
        protected : access modifier typically used in an inheritance paradigm where an instance is required to be modified.
        protected is where everything excpet the world can see the modified instance.
        overriding: inheritance mechanism where an inheritee writes over an implmentation of a class.
        this : language construct used to point/refer to the object in question.
         */

        /*
        Q1.2 Keywords
5 Points
Grading comment:
List the keywords associated with exceptions in Java, giving a one-sentence description of what each one is for.

Exception : hierarchy of Errors that can occur
checked: Exception that is caught at compile time and is a foreseen error by the programmer i.e reading from file
unchecked: an Exception that can happen at runtime and outside the bounds of the program ie division by zero.
throws: keyword used to denote a method may encounter an exception that if unhandled will cause the program to crash
try/catch: mechanism used to handle errors
         */

        Stack<Integer> stuff = new Stack<>(2);
        stuff.push(1);
        stuff.push(2);
        stuff.push(3);
        stuff.pop();
        stuff.pop();
        stuff.pop();
//        stuff.pop();
//    }
        /*
        Explain the idea of an iterator for a data structure like an ArrayList or LinkedList.
        Iterators are useful when the deletion of data is expected when traversing a collection. it does this
        with a boolean value to see if the end of the list has been reached which is not possible with
        simple loop.
         */
    }
}

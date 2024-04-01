package ExamPrac3.Q1;

public class Main {
    public static void main(String[] args) {
        /*
        Q130 Points
        Question 1.1 Definitions
        Q1.1 Definitions
        12 Points
    Grading comment:
    Briefly explain each of the following Java terms: static method, dynamic binding, cast expression, protected, overriding, this

    static method : A method belonging to a class that does not require the instantiation of the class in order to be executed
    dynamic binding : coupling two objects together at runtime
    cast expression: mechanism used to help the compiler at runtime determine the type of given object
    protected : Inheritance mechanism access modifier used to denote that a sub classes will know about it that thing and
    can use it as can all other classes in the same package.
    overriding : specific implmentation of subclass
    this : referering to the object in question , a self referential mechansim.
Question 1.2 Keywords
Q1.2 Keywords
5 Points
Grading comment:
List the keywords associated with exceptions in Java, giving a one-sentence description of what each one is for.
try - do something in a sandbox style environment
catch - instead of the entire program crashing due to fault catch the specific error causing the problem
finally - whatever happens execute this code
Throws - a signifier that a method can produce a erronoeuous result

Question 1.3
Q1.38 Points
Grading comment:
Write a class Stack in Java. The methods should throw exceptions where appropriate.

Question 1.4
Q1.45 Points
Grading comment:
Use examples to show how client code should use your Stack class from part 1.3) and deal with any exceptions that might occur.
         */

        Stack stack = new Stack( 2);
        stack.push(1);
        stack.push(2);
        //stack.push(3);
        stack.pop();
        stack.pop();
        stack.pop();

    }
}

package Exam2022.Q5;

public class Main {
    public static void main(String[] args) {

        /*
        (a) Why would you prefer property based dependency injection (DI) as against 3 marks
constructor DI? -> property based di  is a looser from of Di in the sense that no re compiltion is required if
a given implementation is changed all that needs amended is the property based file.

(b) The dependency injection design pattern adds (“injects”) a dependency. 3 marks
Briefly describe where and when the dependency does not exist and where
and when it does exist.
The dependency does not exist at compile but it does exist at runtime when it is injected to the calling class.
(c) Suppose that component A depends on component B. Provide Java code con- 3 marks
structs that could cause this dependence. Your answer should be descriptive
and not use code examples.

A is a class and has a hardcoded instance of type b as one of its attributes.
B is a class and has a hardcoded instance of type a as one of tis attributes.
ABove is a circular dependendcy
         */
    }
}

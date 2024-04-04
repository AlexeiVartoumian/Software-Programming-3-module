package examIV.q11;

public class Main {
    public static void main(String[] args) {

        /*
        Briefly explain the phrase Dependency Injection as used in this course. You should ensure that you discuss:

Constructor injection,
Argument injection, and
Setter injection.
Describe the relative advantages and disadvantages of static vs dynamic dependency injection frameworks.

You should provide appropriate examples to illustrate your answer.
         */
        /*
        Dependency Injection can be described as a unit of functionality or service that is required by another unit of functionality or service in order to achieve its responsibility.
For example, suppose we provide There exists a class of that delivers information of users of a given application. It does so from a database with the a method render.
A tightly coupled class will have a hardcoded instance of database and use it directly. The problem with this is they are tightly coupled meaning everything must be changed if a a new feature or implementation is required. This is Constructor injection.

Setter injection is a more flexible version of DI where dependencies can be swapped in and out after injection. both of these methods are types of argument injection since they require arguments to inject the dependency.
         */
    }
}

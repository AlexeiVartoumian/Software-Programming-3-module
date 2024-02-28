package Week1GEnericsPlusLambda.Quiz1.Q9;

/**
 * Will the following class compile? If not, why not?
 */
public class Main {
    public static void main(String[] args) {

        //This class wiIl not compile and im not sure why
        // but I think the reason why is that The generic class type parameter and the generic method type parameter
        //are two different things. One of the reasons a compilation error has occurred is
        // that a static method on a generic class cannot use class-type parameters.
        // The fact they are both called T here is misleading as they are different.
        // here is a working version with the types removed. need to learn about
        //design patterns and revisit this.



    }
}



class Singleton {
    private static Singleton instance = null;
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
//below wont compile
//public class Singleton<T> {
//
//    public static T getInstance() {
//        if (instance == null)
//            instance = new Singleton<T>();
//
//        return instance;
//    }
//
//    private static T instance = null;
//}
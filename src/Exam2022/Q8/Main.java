package Exam2022.Q8;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        /*
        The reflection API allows an executing Java program to examine or “introspect”
upon itself. Complete the following method (using reflection) to list which methods are defined for a class passed as an argument to the method. You should
include in your output the return type (if any) of each method.

         */
    }

    public static void reflect(String cl){
        try {
            Class cls = Class.forName(cl);
// YOUR CODE GOES HERE
            Method[] methods = cls.getDeclaredMethods();
            String res = "";
            for(Method method : methods){
                res += method.getName();
                res += "Methods return type is  " + method.getReturnType();
                res+= " ";

            }
            System.out.println(res);
        }
        catch (Exception ex) {
            System.err.println(ex);
        }
    }
}

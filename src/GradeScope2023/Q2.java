package GradeScope2023;

import java.lang.reflect.Method;

public class Q2 {

    public static void reflect(String cl) {
        try {
            Class cls = Class.forName(cl);

            Method[] methods = cls.getDeclaredMethods();

            for(Method method : methods){

                System.out.println( "method : " + method);
                System.out.println("Return type of method : " + method.getReturnType());
            }


        } catch (ClassNotFoundException e) {
            System.out.println( e);
        }
    }
}

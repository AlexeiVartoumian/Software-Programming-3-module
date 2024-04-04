package examIV.Q10DI;

import java.lang.reflect.Method;

public class Reflection {

    public static void reflect(String cl){
        try {
            Class<?> cls = Class.forName(cl);
            // YOUR CODE GOES HERE
            Method[] thing = cls.getDeclaredMethods();

            for (Method method : thing) {
                String thingy  = method.getReturnType().getName();
                System.out.println( thingy);
            }
        }
        catch (Exception ex) {
            System.err.println(ex);
        }
    }
}

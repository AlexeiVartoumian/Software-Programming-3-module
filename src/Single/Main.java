package Single;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Class.forName;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Singleton singleton = Singleton.getInstance();

        Singleton singleton1 = Singleton.getInstance();

        SingletonLazy lazy = SingletonLazy.getLazyInstance();
        SingletonLazy lazy2 = SingletonLazy.getLazyInstance();

        System.out.println(lazy == lazy2);

        /**
         * Why might you decide to lazy-initialise a singleton instance rather
         *          * than initialise it in its field declaration?
         *          * Provide code examples of both approaches to illustrate your answer.
         *          *
         *          * I would argue that Eager Singletons that is instances that are intitialised in thier field
         *          * is the better approach when you want to use One Instance and Know that you are going to use it a multi-threaded
         *          * environment --> since barring unforeseen incidents in a normal runtime it will guarantee a sinle instance.
         *          * This is useful in the case where the Singleton is a Database that interacts with multiple clients. we do not want
         *          * Concurrently speaking multiple instance of the database to be open --> onlu one connection.
         *          *
         *          * A lazy initialisation is better when we dont know we will need the class and the class itself take a considerable time to load.
         *          * Honestly In this case I think the class itself should be split up but the benefit of this approach is that the class is
         *          created only when needed.
         *
         */
        breakSingleton(lazy2);
        /**
         * FOr part 2 one of the questions was to Break the singleton pattern with reflection.My attempt was
         * with the LazySingelton where the field is set to null.
         * the idea is to allow the setting of the null field and then set it to null inside of a loop
         * creating instances inside of the loop. For proof of concept when the getInstance method is called
         * if the field is null i.e its never been created a print message will say I am null.
         * with this in mind when newInstance is created it will break the Singletonpattern.
         */
    }

    public static List<SingletonLazy> breakSingleton(SingletonLazy breakthis) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        List<SingletonLazy> broken =  new ArrayList<SingletonLazy>();
        Class<?> thing = Class.forName("Single.SingletonLazy");
        Field fieldname = thing.getDeclaredField("lazy");
        fieldname.setAccessible(true);
        for (int i = 0; i < 3; i++) {

            fieldname.set(null, null);

            Constructor<?> cons = thing.getDeclaredConstructor();
            cons.setAccessible(true);
            SingletonLazy singleton = (SingletonLazy) cons.newInstance();
            singleton.getLazyInstance();
            broken.add(singleton);
        }

        return broken;
    }
}
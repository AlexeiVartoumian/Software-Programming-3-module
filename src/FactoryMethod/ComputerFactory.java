package FactoryMethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ComputerFactory implements ProductFactory{

    @Override
    public Computer getProduct(String ClassName, String name,int barcode , double price , String description ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> computer = Class.forName(ClassName);
        Constructor<?> constructor = computer.getDeclaredConstructor(int.class,String.class , double.class,String.class);
        return  (Computer) constructor.newInstance(barcode , name, price , description);
    }
}

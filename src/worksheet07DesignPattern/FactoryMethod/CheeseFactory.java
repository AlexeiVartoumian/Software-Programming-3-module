//package FactoryMethod;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//
//public class CheeseFactory implements ProductFactory{
//
//    @Override
//    public Cheese getProduct(String ClassName, String name,int barcode , double price , String description ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Class<?> computer = Class.forName(ClassName);
//        Constructor<?> constructor = computer.getDeclaredConstructor(int.class,String.class , double.class,String.class);
//        return (Cheese) constructor.newInstance(barcode , name, price , description);
//    }
//}

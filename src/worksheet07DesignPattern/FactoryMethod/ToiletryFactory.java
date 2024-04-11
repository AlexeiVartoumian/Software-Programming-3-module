//package FactoryMethod;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//
//public class ToiletryFactory implements ProductFactory{
//
//    @Override
//    public Toiletry getProduct(String ClassName,String name, int barcode, double price, String description ) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
//
//        Class<?> toiletry = Class.forName(ClassName);
//        Constructor<?> constructor = toiletry.getDeclaredConstructor(int.class,String.class , double.class,String.class);
//        return (Toiletry) constructor.newInstance(barcode , name, price , description);
//    }
//
//}

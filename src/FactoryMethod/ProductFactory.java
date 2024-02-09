package FactoryMethod;

import java.lang.reflect.InvocationTargetException;

public interface ProductFactory {//<T>{


    //<S extends T > playing at bounding casting. can see why Design Patterns are a thing!
    //given string name return class that matches that name with attributes
    Product getProduct(String className , String name , int barcode ,double price , String description) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;
}


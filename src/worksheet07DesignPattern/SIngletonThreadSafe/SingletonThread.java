package worksheet07DesignPattern.SIngletonThreadSafe;

import java.util.function.BinaryOperator;

public class SingletonThread {

    private static volatile SingletonThread instance;

    private SingletonThread(){}

    public static SingletonThread getInstance(){

        if (instance == null){
            synchronized (SingletonThread.class){
                if (instance == null){
                    instance = new SingletonThread();
                }
            }
        }

        return instance;
    }

    public <T> T operation(T i , T x, BinaryOperator<T> operator){
        return operator.apply(i,x);
    }

}

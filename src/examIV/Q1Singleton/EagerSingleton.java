package examIV.Q1Singleton;

public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance(){
        return instance;
    }

    private static double someMethod(int number){
        return number*number;
    }
}

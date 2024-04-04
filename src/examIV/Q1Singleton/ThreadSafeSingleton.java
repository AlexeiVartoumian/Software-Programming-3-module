package examIV.Q1Singleton;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton instance;

    public synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

package examIV.Q1Singleton;

public class DoubleCheckedLockingThreadSafeSingleton {

    private  volatile DoubleCheckedLockingThreadSafeSingleton instance;

    public DoubleCheckedLockingThreadSafeSingleton getInstance(){
        DoubleCheckedLockingThreadSafeSingleton local = instance;
        if (local == null){
            synchronized (this){
                local = instance;
                if (local == null){
                    instance = local = new DoubleCheckedLockingThreadSafeSingleton();
                }
            }
        }
        return local;
    }
}

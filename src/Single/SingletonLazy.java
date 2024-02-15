package Single;

public class SingletonLazy {

    private static  SingletonLazy lazy = null;

    private SingletonLazy(){
    }

    public static SingletonLazy getLazyInstance(){
        if(lazy == null){
            System.out.println("I am null");
            lazy = new SingletonLazy();
        }
        System.out.println("I will execute anyway");
        return lazy;
    }

}

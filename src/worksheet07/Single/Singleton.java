package worksheet07.Single;

public class Singleton {

    private static final Singleton instance = null;
    private Singleton(){
    }
    public static Singleton getInstance(){
        return instance;
    }

}

package Exam2022.Q2;



public class Singleton {


    private static Singleton single;
    private Singleton(){}


    public static Singleton getInstance(){

        //not concurrent safe
        if(single == null){
            single = new Singleton();
            return single;
        }
        return single;
    }
}

package Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Composite;

public class LeafFile extends Document{


    String name;
    String type;
    String message;
    public LeafFile(String name,String type) {
        super(name,type);

    }
    @Override
    public void add(String message){
        this.message += name;
    }

    @Override
    public String read(){
        return this.message;
    }


}

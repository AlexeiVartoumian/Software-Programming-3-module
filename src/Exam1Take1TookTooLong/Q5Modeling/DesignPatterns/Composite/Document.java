package Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Composite;

public abstract class Document {

    private String name;
    private String type;

    public Document(String name, String type){
       this.name = name;
       this.type = type;
    }

    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public void add(Document file){
        throw new UnsupportedOperationException();
    }
    public void add(String message){
        throw new UnsupportedOperationException();
    }
    public void remove(int index){
        throw new UnsupportedOperationException();
    }
    public Document getFile(int index) throws Exception {
        throw new UnsupportedOperationException();
    }
    public String read(){
        throw new UnsupportedOperationException();
    }

}

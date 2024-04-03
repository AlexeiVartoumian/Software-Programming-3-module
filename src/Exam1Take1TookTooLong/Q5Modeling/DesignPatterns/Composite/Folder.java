package Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Composite;

import java.util.ArrayList;

public class Folder extends Document{

    String name;
    String type;
    ArrayList<Document> files;
    public Folder(String name, String type){
        super(name, type);
        files = new ArrayList<>();
    }

    @Override
    public void add( Document file){
        files.add(file);
    }

    @Override
    public void remove(int index){

        try{
            files.remove(files.get(index));
        }catch ( Exception e){
            System.out.println("no such file");
        }
    }
    @Override
    public Document getFile( int index) throws Exception {
        try {
            return files.get(index);
        }catch ( Exception e){
            throw new Exception("some exception" +  e ) ;
        }
    }
    public ArrayList<Document> getFiles(){
        return this.files;
    }
}

package Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Iterator;

import Q5Modeling.DesignPatterns.Composite.Document;
import Q5Modeling.DesignPatterns.Composite.Folder;
import Q5Modeling.DesignPatterns.Composite.LeafFile;
import Q5Modeling.DesignPatterns.Visitor.Visitable;
import Q5Modeling.DesignPatterns.Visitor.Visitor;

import java.util.ArrayList;
import java.util.Objects;

public class TextFileIterator implements  Iterator, Visitable {

    Folder folder;
    String type;
    int curpostion;

    ArrayList<Document> cache = new ArrayList<>();

    public TextFileIterator(Folder document , String type ){

        this.folder = document;
        this.type = type;
        curpostion = 0;
        cache = this.folder.getFiles();
    }
    @Override
    public LeafFile getNext(){
       //basic imple

        while ( hasmore() ){
            if (Objects.equals(cache.get(curpostion).getType(), type)){
                LeafFile thing = (LeafFile) cache.remove(curpostion);
                System.out.println("found this file " +  thing.getName());
                return thing;
            }
            if (hasmore()){
                curpostion+=1;
            }
        }
        System.out.println("no more files of this type");
        return null;

    }
    @Override
    public boolean hasmore(){
        return curpostion < cache.size();
    }

    @Override
    public double accept(Visitor visitor){
        return visitor.visit(this);
    }

}

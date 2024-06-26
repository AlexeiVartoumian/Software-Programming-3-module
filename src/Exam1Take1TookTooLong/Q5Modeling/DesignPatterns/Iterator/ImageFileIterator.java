package Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Iterator;


import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Composite.Document;
import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Composite.Folder;
import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Composite.LeafFile;
import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Visitor.Visitable;
import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Visitor.Visitor;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Dummy class to illustrate visitor pattern
 */
public class ImageFileIterator implements Iterator , Visitable {
    Folder folder;
    String type;
    int curpostion;

    ArrayList<Document> cache = new ArrayList<>();

    public ImageFileIterator(Folder document , String type ){

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

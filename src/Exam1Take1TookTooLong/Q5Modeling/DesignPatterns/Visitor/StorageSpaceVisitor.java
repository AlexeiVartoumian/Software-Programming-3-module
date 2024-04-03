package Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Visitor;

import Q5Modeling.DesignPatterns.Composite.LeafFile;
import Q5Modeling.DesignPatterns.Iterator.ImageFileIterator;
import Q5Modeling.DesignPatterns.Iterator.TextFileIterator;

public class StorageSpaceVisitor implements Visitor{

    public StorageSpaceVisitor(){}
    @Override
    public double visit(ImageFileIterator iterator){

        double size = 0;
        while (iterator.hasmore()){
            if ( iterator.getNext() != null ) {
                size += 1000;
            }
        }
        if (size > 2000 ){
            System.out.println("images are taking too much space");
        }
        return size;
    }
    @Override
    public double visit(TextFileIterator iterator){
        double size = 0;
        double count = 0;
        while (iterator.hasmore()){
            LeafFile thingy = iterator.getNext();
            if ( thingy != null ) {
                size += thingy.getName().length();
                count+=1;
            }
        }
        if (size / count > 20){
            System.out.println("File names on average are too long");
        }
        else{
            System.out.println("file names have acceptable average name length" + size/count);

        }
        return size;
    }
}

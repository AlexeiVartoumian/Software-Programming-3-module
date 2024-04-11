package Exam1Take1TookTooLong.Q5Modeling.DesignPatterns;


import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Composite.Folder;
import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Composite.LeafFile;
import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Iterator.TextFileIterator;
import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Visitor.StorageSpaceVisitor;

public class Main {

    public static void main(String[] args) {

        Folder folder = new Folder( "Main folder", "SomeFolder");

        Folder innerFolder = new Folder("randomfolder" ,"InnerFolder");

        LeafFile txt  = new LeafFile( "somefile","text");
        LeafFile text2 = new LeafFile("somefile2","text");
        LeafFile img = new LeafFile("someimage","image");
        LeafFile audio = new LeafFile("somesound","mp3");
        LeafFile text3 = new LeafFile("somefile3","text");
        LeafFile text4 = new LeafFile("somefile4","text");
        LeafFile text5 = new LeafFile("somefile5","text");
        folder.add(innerFolder);
        folder.add(txt);
        folder.add(img);
        folder.add(audio);
        folder.add(text2);
        folder.add(text3);
        folder.add(text4);
        folder.add(text5);

        TextFileIterator someIterator = new TextFileIterator(folder , "text");

        System.out.println(someIterator.getNext());
        System.out.println(someIterator.getNext());

        StorageSpaceVisitor VisitorDesPattern = new StorageSpaceVisitor();

        VisitorDesPattern.visit(someIterator);
    }
}

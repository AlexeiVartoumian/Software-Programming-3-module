package Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Visitor;


import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Iterator.ImageFileIterator;
import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Iterator.TextFileIterator;

public interface Visitor {


    double visit(ImageFileIterator iterator);

    double visit(TextFileIterator iterator);



}

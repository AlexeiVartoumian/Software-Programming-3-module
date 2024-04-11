package Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Iterator;


import Exam1Take1TookTooLong.Q5Modeling.DesignPatterns.Composite.Document;

public interface Iterator {

    Document getNext();
    boolean hasmore();
}

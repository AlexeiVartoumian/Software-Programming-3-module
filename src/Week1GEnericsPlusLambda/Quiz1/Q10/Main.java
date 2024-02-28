package Week1GEnericsPlusLambda.Quiz1.Q10;

/**
 * Given the following classes:
 * class Shape {  }
 *class Circle extends Shape { }
 * class Rectangle extends Shape {  }
 * class Node<T> { }
 * Will the following code compile? If not, why not?
 * Node<Circle> nc = new Node<>();
 * Node<Shape>  ns = nc;
 */
public class Main {
    public static void main(String[] args) {

        // no just because Circle is a subtype of Shape That does not mean that Node<Circle> is a subtype of Node<Shape>
        // A container holding thre reference of one data type does not inherit from a container of another subtype.
    }
}




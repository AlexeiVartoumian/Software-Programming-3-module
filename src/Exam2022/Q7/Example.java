package Exam2022.Q7;

public class Example {
    public static void main(String[] args) {

              /*
        Which design pattern is implemented by the following code?
You must explain your answer.

Thie is the strategy patern. Each implementation here is delivering a certain kind of algorithm
the context in the main is swapping in and out different implementation and is a behavuoiral pattern.
Different to the visitor pattern which does a similar thing but in a structural fashion.
         */
        Transportation context = new Transportation(new Taxi());
        context.accept_visitor();
        context = new Transportation(new Bus());
        context.accept_visitor();
    }
}
interface Transporter {
    void visit();
}
class Taxi implements Transporter {
    public void visit() {
        System.out.println("Traveling with taxi");
    }
}
class Bus implements Transporter {
    public void visit() {
        System.out.println("Traveling with bus");
    }
}
class Train implements Transporter {
    public void visit() {
        System.out.println("Traveling with train");
    }
}
class Transportation {
    Transporter tporter;
    public Transportation(Transporter t) {
        tporter = t;
    }
    public void accept_visitor() {
        tporter.visit();
    }
}
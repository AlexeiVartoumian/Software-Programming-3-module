package Exam2022.Q2;

public class Main {
    public static void main(String[] args) {

        /*
        (a) Briefly describe two disadvantages of the direct instantiation model that can 4 marks
be solved by using the factory method or factory patterns. ->
A factory pattern is suitable for solving a particaulr type of producer / consymer problem where different consumers
require certatain aspects from the producer. direct instantiation will require shotgun surgery and tight coupling
whenever different consumers are thrown into the mix. Factory pattern also loosely couples the consumers from the producer
allowing extensibility.
 for example there is a button functionality  that is required by a web gui and a gui but need it to do diferrrent thingas.
 Factory pattern will solve for this.

(b) Implementing the singleton pattern often (but not always) requires using 3 marks
what other pattern?
This would be an abstract factory pattern where the constructor is private to prevent further instantiaitns of that product.
Provide an example to illustrate your answer.
(c) What are the relationships between the Strategy and Flyweight patterns? 5 marks

Strategy pattern is concerned with swapping in and out algorithms for assciated  classes at runtime  and is a behavioural pattern
whereas flywieght does a similar thing only for the strucutre.
         */


        //q1
        Gui gui = new Gui();
        Web web = new Web();

        gui.setButton(Factory.produce("gui"));
        web.setButton(Factory.produce("web"));

    }
}

package worksheet07DesignPattern.Q1Take2;

public class Main {
    public static void main(String[] args) {


        ConcreteCreator factory = new ConcreteCreator();

        Product item = factory.createProduct(Type.Electric, "X8086", "pentuim", 99.99);
        Product item2 =  factory.createProduct(Type.MISC , "comedy", "laughtown", 10);
        Product item3 = factory.createProduct(Type.Edible ,"hotdog","smoky",20.00 );

    }
}

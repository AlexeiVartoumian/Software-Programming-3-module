package worksheet07DesignPattern.Q1Take2;

public class ConcreteCreator implements ProductCreator{


    @Override
    public Product createProduct(Type type, String name, String description, double price) {

        return switch(type) {
            case Electric -> new ElectricProduct(type,name , description,price );
            case Cosmetic -> new CosmeticProduct(type,name , description,price);
            case Edible -> new EdibleProduct(type,name , description,price);
            default -> new MiscProduct(Type.MISC,name , description,price);
        };
    }
}

package worksheet07DesignPattern.Q1Take2;

public abstract class Product {

    private String name;
    private Type type;
    private String description;
    double price;

    public Product(Type type){
        this.type = type;
    }
    public Product(Type type, String name , String description, double price){
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

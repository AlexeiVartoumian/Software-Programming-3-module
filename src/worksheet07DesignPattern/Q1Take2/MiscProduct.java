package worksheet07DesignPattern.Q1Take2;

public class MiscProduct extends Product{
    public MiscProduct(Type type) {
        super(type);
    }

    public MiscProduct(Type type, String name, String description, double price) {
        super(type, name, description, price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Type getType() {
        return super.getType();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }
}

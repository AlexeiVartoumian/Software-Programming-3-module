package worksheet07DesignPattern.Q1Take2;

public class CosmeticProduct extends Product implements  ConsumerReaction{
    public CosmeticProduct(Type type, String name, String description, double price) {
        super(type, name, description, price);
    }

    @Override
    public String getName() {
        return super.getName();
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

    @Override
    public String reaction(int number){
        return number <= 0 ? "Ugh!" :
                switch (number){
            case 1,2,3,4,5 -> "meh doesnt make me look good";
            case 6,7,8 -> "looking good!";
            default ->  "wow!";
        };


    }
}

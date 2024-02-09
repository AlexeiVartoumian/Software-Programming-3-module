package FactoryMethod;

public class Toiletry extends Product{

    public Toiletry(String category, int barcode, String name, double price) {
        super(barcode, name, price);
    }

    public Toiletry(String category, int barcode, String name, double price, String description) {
        super(barcode, name, price, description);
    }
}

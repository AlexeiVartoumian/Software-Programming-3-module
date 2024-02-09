package FactoryMethod;

public class Cheese extends Product{


    public Cheese(String category, int barcode, String name, double price) {
        super(barcode, name, price);
    }

    public Cheese(String category, int barcode, String name, double price, String description) {
        super(barcode, name, price, description);
    }
}

package FactoryMethod;

public class Computer extends Product{

    public Computer( int barcode, String name, double price) {
        super(barcode, name, price);
    }

    public Computer(int barcode, String name, double price, String description) {
        super(barcode, name, price, description);
    }
}

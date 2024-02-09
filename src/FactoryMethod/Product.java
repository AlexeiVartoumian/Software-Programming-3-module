package FactoryMethod;

public abstract class Product {

    private int barcode;
    private double price;
    private String name;
    private String description;
    public Product( int barcode ,String name, double price) {
        this(barcode, name, price ,  "");
    }
    public Product(int barcode, String name, double price, String description ){
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getProductName(){
        return this.name;
    };
}

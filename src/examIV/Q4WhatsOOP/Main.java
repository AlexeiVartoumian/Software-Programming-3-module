package examIV.Q4WhatsOOP;

public class Main {
    public static void main(String[] args) {

        /*
        The Abstract Factory design pattern defines a template (or interfaces) for creating similar objects or implementations. Usually, the abstract factory pattern will encapsulate a factory method or more within the actual creation of the product.

In the example code (Q03), you’ll notice the presence of two abstract classes,

Mobile (Product) and
MobileStore (Creator).
One family of concrete product implementations are AppleASeries, AppleBSeries and AppleCSeries,
to be created by the AppleStore, which is the concrete implementation of the creator. Similarly,
another family of products, such as PixelASeries, PixelBSeries and PixelCSeries,
are to be created by GoogleStore, another concrete implementation of MobileStore.

Provide implementations of any classes that are required to enableMobileStoreFactory to instantiate the concrete instance of the abstract factory (MobileStore) based upon the variable specified,
either “Apple” (AppleStore) or “Pixel” (GoogleStore). The factory is then responsible for creating objects of similar types based on the choice — such as “ASeries”, “BSeries”, or “CSeries”. The mobile is then assembled based on this by the MobileStore. You may use the Main class (folder Q03) to test your code.
         */
    }
}

public class Electronics extends Product {

    int warranty;

    void setElectronics() {
        name = "Laptop";
        price = 55000;
        warranty = 2;
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty + " Years");
    }
}
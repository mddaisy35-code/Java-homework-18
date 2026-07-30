public class Clothing extends Product {

    String size;
    String fabric;

    void setClothing() {
        name = "T-Shirt";
        price = 999;
        size = "M";
        fabric = "Cotton";
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Fabric: " + fabric);
    }
}
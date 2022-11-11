public class Clothing  {

    String name;
    double price;
    boolean inStock;

    public Clothing(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    Clothing shirt = new Clothing("Shirt", 10.99, true);
    Clothing pants = new Clothing("Pants", 24.99, false);
    Clothing hat = new Clothing("hat", 12.99, true);
    Clothing af1 = new Clothing("Air Force 1", 84.99, true);


}

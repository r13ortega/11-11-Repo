public class Product {

    String name;

    double price;

    boolean inStock;
    //commit
    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public void print(){
        System.out.println("---- " + this.name + " ----" + this.price + " ---- " + this.inStock);
    }
}

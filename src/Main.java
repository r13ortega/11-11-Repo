import java.util.ArrayList;
import java.util.Scanner;

//commit
public class Main {
    public static Scanner scan = new Scanner(System.in);
    static ArrayList<Product> product = new ArrayList<>();

    public static void main(String[] args) {


    }

    public static void create(){
        System.out.println("Let's add a new Product\n" +
                "Please enter in the (Name) of the Product");
        String name = scan.nextLine();
        System.out.println("Please enter in price of the Product");
        double price = scan.nextDouble();
        System.out.println("Is the item in stock?\n" +
                "(true) or (false)");
        boolean inStock = scan.nextBoolean();
        Product nameProduct = new Product(name, price, inStock);
        product.add(nameProduct);
    }
}

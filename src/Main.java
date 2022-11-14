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
        System.out.println("What kind of product do you have?\n" +
                "Type (1) Toys\n" +
                "Type (2) Electronics\n" +
                "Type (3) Clothing");
        int answerNum = scan.nextInt();
        scan.nextLine();
        switch (answerNum){
            case 1:
                Toys nameToy = new Toys(name, price, inStock);
                product.add(nameToy);
                break;
            case 2:
                Electronics nameElec = new Electronics(name, price, inStock);
                product.add(nameElec);
                break;
            case 3:
                Clothing nameCloth = new Clothing(name, price, inStock);
                product.add(nameCloth);
                break;
        }
    }

    public static void update(){
        System.out.println("Please enter in the  Name of the Product you wish to Update...");
        String name = scan.nextLine();
        for (Product prod: product) {
            if (name.equalsIgnoreCase(prod.name)){
                System.out.println("Please enter in the new Name of the Product");
                String namey = scan.nextLine();
                System.out.println("Is this Product in Stock?\n" +
                        "(true) ir (false)");
                boolean inStock = scan.nextBoolean();
                scan.nextLine();
                System.out.println("What is the price of the Product?");
                double pricey = scan.nextDouble();
                scan.nextLine();
                prod.name = namey;
                prod.inStock = inStock;
                prod.price = pricey;
            }
        }
    }

}

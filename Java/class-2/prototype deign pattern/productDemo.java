
public class productDemo {

    public static void main(String[] args) {
        
    Product product1 = new Product("desktop", 99.9);
    Product product2 = new Product("phone", 10.0);

    System.out.println("Cloned products");

    product1.clone();
    product2.display();

    product1.display();
    product2.display();
    }
}

abstract class ProductProtype{
    public abstract ProductProtype clone();
    public abstract void display();
}

class Product extends ProductProtype{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name; this.price = price;
    }

    @Override
    public ProductProtype clone() {
        return new Product(name, price);
    }
    @Override
    public void display() {
        System.out.println("name is " + name + " price is " + price);
    }
}



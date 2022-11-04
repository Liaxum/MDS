package TP3;

import java.util.ArrayList;

public class Client {
    private final String name;
    private final String nickname;
    private final int id;
    private ArrayList<Product> cart = new ArrayList<Product>();

    public Client(int id, String name, String nickname) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Product> getCart() {
        return this.cart;
    }

    public void addProduct(Product product) {
        this.cart.add(new Product(product.getName(),  product.getDescription(), 1, product.getPrice()));
    }

    public void emptyCart() {
        this.cart = new ArrayList<Product>();
    }

    public Product findProductByName(String name) {
        int i = 0;
        while (i <= this.cart.size() && this.cart.get(i).getName() != name) i++;

        if (i  > this.cart.size()) return null;
        return this.cart.get(i);
    }

    public void removeProduct(String name) {
        Product p = findProductByName(name);
        if (p!= null) this.cart.remove(p);
        else System.out.println("Product not found");
    }

    public void modifyProductQuantity(String name, int quantity) {
        Product product = this.findProductByName(name);
        if (product!= null) {
            product.setQuantity(quantity);
            if (product.getQuantity() == 0)  {
                this.removeProduct(name);
                System.out.println("Product removed because quantity is 0");
            }
        }
        else System.out.println("Product not found");
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + this.name + '\'' +
                ", nickname='" + this.nickname + '\'' +
                ", id=" + this.id +
                ", cart=" + this.cart +
                '}';
    }
}

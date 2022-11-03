package TP3;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("EzStore");

        store.addProduct(new Product("PS5", "Console", 12, 12));
        store.addProduct(new Product("Iphone 14", "iPhone", 12, 12));
        store.addProduct(new Product("Iphone 15", "iPhone", 12, 12));

        System.out.println("Store products: ");
        store.displayProducts();
        System.out.println("Display PS5");
        store.displayProduct("PS5");
        System.out.println();

        System.out.println("Modify Iphone 14 in the product");
        store.editProductQuantity("Iphone 14", 10);
        System.out.println();

        System.out.println("Delete Iphone 15 in the product");
        store.removeProduct("Iphone 15");
        store.displayProducts();
        System.out.println();

        store.addClient(1, "Romain", "Texier");
        store.addClient(2, "Alexis", "Muguet");
        System.out.println("Store clients: ");
        store.displayClients();
        System.out.println("Display Romain");
        store.displayClient("Romain");
        System.out.println();

        store.addProductToClientCart("PS5", "Romain");
        store.addProductToClientCart("Iphone 14", "Romain");
        System.out.println("Add PS5 and Iphone 14 to cart of Romain");
        store.displayClient("Romain");
        store.displayProducts();
        System.out.println();

        store.removeProductFromClientCart("Iphone 14", "Romain");
        System.out.println("Remove Iphone from cart of Romain");
        store.displayClient("Romain");
        store.displayProducts();
        System.out.println();

        store.setQuantityProductIntoCart("PS5", "Romain", 2);
        System.out.println("Modify the quantity of PS5 in the cart of Romain");
        store.displayClient("Romain");
        store.displayProducts();
        System.out.println();

        store.validCart("Romain");
        System.out.println("Cart is valid for Romain");
        store.displayClient("Romain");
        store.displayCommands();
        System.out.println();

        store.changeStatus(1, Status.DELIVERED);
        System.out.println("Change status to delivered");
        store.displayCommands();
        System.out.println();
    }
}

package TP3;

import java.util.ArrayList;

public class Store {
    private final ArrayList<Product> products = new ArrayList<>();
    private final ArrayList<Client> clients = new ArrayList<>();
    private final ArrayList<Command> commands = new ArrayList<>();
    private final String name;

    public Store(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product findProductByName(String name) {
        int i = 0;
        while (i <= this.products.size() && this.products.get(i).getName() != name) i++;

        if (i  > this.products.size()) return null;
        return this.products.get(i);
    }

    public void removeProduct(String name) {
        Product product = findProductByName(name);
        if (product!= null) {
            this.products.remove(product);
        } else System.out.println("Product not found");
    }

    public void displayProduct(String name) {
        Product product = findProductByName(name);
        if (product!= null) System.out.println(product);
        else System.out.println("Product not found");
    }

    public void editProductQuantity(String name, int quantity) {
        Product product = findProductByName(name);
        if (product!= null) {
            product.setQuantity(quantity);
            displayProduct(name);
        } else System.out.println("Product not found");
    }


    public void addClient(int id, String name, String nickname) {
        this.clients.add(new Client(id, name, nickname));
    }

    public void displayClients() {
        for (Client client : clients) {
            System.out.println(client);
        }
        System.out.println();
    }

    public Client findClientByName(String name) {
        int i = 0;
        while (i <= this.clients.size() && this.clients.get(i).getName() != name) i++;

        if (i  > this.clients.size()) return null;
        return this.clients.get(i);
    }

    public void displayClient(String name) {
        Client client = findClientByName(name);
        if (client!= null) System.out.println(client);
        else System.out.println("Client not found");
    }

    public void addProductToClientCart(String nameP, String nameC) {
        Client client = findClientByName(nameC);
        Product product = findProductByName(nameP);
        if (client!= null && product != null) {
            client.addProduct(product);
            product.setQuantity(product.getQuantity() - 1);
        } else System.out.println("Client or Product not found");
    }

    public void removeProductFromClientCart(String nameP, String nameC) {
        Client client = findClientByName(nameC);
        Product product = findProductByName(nameP);
        if (client!= null && product!= null) {
            client.removeProduct(product.getName());
            product.setQuantity(product.getQuantity() + 1);
        }
    }

    public void setQuantityProductIntoCart(String nameP, String nameC, int quantity) {
        Client client = findClientByName(nameC);
        Product product = findProductByName(nameP);
        if (client!= null && product!= null) {
            int oldCartQuantity = client.findProductByName(product.getName()).getQuantity();
            client.modifyProductQuantity(product.getName(), quantity);
            product.setQuantity(product.getQuantity() + (oldCartQuantity - quantity));
        } else System.out.println("Client or Product not found");
    }

    public ArrayList<Command> findAllCommandForClient(String name) {
        ArrayList<Command> comms = new ArrayList<Command>();
        for (Command command : this.commands) {
            if (command.getClient().getName().equals(name)) {
                comms.add(command);
            }
        }
        return comms;
    }

    public Command findCommandById(int id) {
        int i = 0;
        while (i <= this.commands.size() && this.commands.get(i).getId()!= id) i++;

        if (i  > this.commands.size()) return null;
        return this.commands.get(i);
    }

    public void validCart(String name) {
        Client client = this.findClientByName(name);
        if (client != null) {
            if (this.commands.size() != 0)
                this.commands.add(new Command(this.commands.get(this.commands.size() - 1).getId() + 1, client, client.getCart(), Status.INTRANSIT));
            else this.commands.add(new Command(1, client, client.getCart(), Status.INTRANSIT));
            client.emptyCart();
        } else System.out.println("Client not found");
    }

    public void changeStatus(int id, Status status) {
        Command command = this.findCommandById(id);
        if (command!= null) {
            command.setStatus(status);
        } else System.out.println("Command not found");
    }

    public void displayCommands() {
        for (Command command : this.commands) {
            System.out.println(command);
        }
    }

    public void displayCommandsForClient(String name) {
        ArrayList<Command> commdc = this.findAllCommandForClient(name);
        for (Command commd : commdc) {
            System.out.println(commd);
        }
    }
}

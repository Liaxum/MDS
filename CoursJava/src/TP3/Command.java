package TP3;

import java.util.ArrayList;

enum Status {
    INTRANSIT,
    DELIVERED,
}

public class Command {
    private final Client client;
    private final int id;
    private final ArrayList<Product> products;
    private Status status;

    public Command(int id, Client client, ArrayList<Product> products, Status status) {
        this.client = client;
        this.id = id;
        this.products = products;
        this.status = status;
    }

    public int getId() {
        return id;
    }
    public Client getClient() {
        return client;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                ", client=" + client +
                ", products=" + products +
                ", status=" + status +
                '}';
    }
}

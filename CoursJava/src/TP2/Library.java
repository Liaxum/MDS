package TP2;

import java.util.ArrayList;
import java.util.Vector;

public class Library {

    public static Vector<Document> documents;

    public static void main(String[] args) {
        documents = new Vector<>();

        documents.add(new Book(1, "1", "1", 1));
        documents.add(new Dictionary(2, "2", "2", 2));

        allAuthor();
        allDoc();
    }

    public static void allAuthor() {
        for (Document doc : documents) {
            System.out.println("id: " + doc.getId());
            if (doc.getClass() == Book.class) System.out.println("Id: " + doc.getId() + " Author: " + ((Book) doc).getAuthor());
        }
        System.out.println();
    }

    public static void allDoc() {
        for (Document doc : documents) {
            System.out.println(doc);
        }
        System.out.println();
    }
}

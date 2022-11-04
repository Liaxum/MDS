package TP2;

public class Book extends Document{
    private final String author;
    private final int nbPages;


    public Book(int id, String name, String author, int nbPages) {
        super(id, name);
        this.author = author;
        this.nbPages = nbPages;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nbPages=" + nbPages + ", " +
                super.toString() +
                '}';
    }
}

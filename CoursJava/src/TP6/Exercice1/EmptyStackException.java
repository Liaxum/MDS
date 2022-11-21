package TP6.Exercice1;

public class EmptyStackException extends Exception {

    public EmptyStackException() {
        super("Error: Stack is empty");
    }

    public EmptyStackException(String message) {
        super(message);
    }
}

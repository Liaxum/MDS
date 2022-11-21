package TP6.Exercice1;

public class Main {
    public static void main(String[] args) throws EmptyStackException {
        Value v = new Value("myValue", 0);

        LIFOStack stack = new LIFOStack();

        stack.push(v);

        try {
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.peek());

        } catch (EmptyStackException e) {
            System.out.print(e.getMessage());
        }

    }
}

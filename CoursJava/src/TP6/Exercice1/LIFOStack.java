package TP6.Exercice1;

import java.util.ArrayList;

public class LIFOStack implements Stack {
    private final ArrayList<Value> collections = new ArrayList<Value>();


    @Override
    public boolean empty() {
        return collections.isEmpty();
    }

    @Override
    public void push(Value v) {
        collections.add(v);
    }

    @Override
    public Value pop() throws EmptyStackException {
        if (this.empty()) throw new EmptyStackException();
        return this.collections.remove(this.collections.size() - 1);

    }

    @Override
    public Value peek() throws EmptyStackException {
        if (this.empty()) throw new EmptyStackException();
        return this.collections.get(this.collections.size() - 1);
    }
}

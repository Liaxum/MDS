package TP6;

public class Value {
    private String name;
    private int value;

    public Value(String name, int value) {
        this.name = name;
        this.value = value
    }

    @Override
    public String toString() {
        return '<' + this.name + ';' + this.value + '>';
    }
}

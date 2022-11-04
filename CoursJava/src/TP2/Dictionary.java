package TP2;

public class Dictionary extends Document {
    private final String language;
    private final int nbVolumes;

    public Dictionary(int id, String name, String language, int nbVolumes) {
        super(id, name);
        this.language = language;
        this.nbVolumes = nbVolumes;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "language='" + language + '\'' +
                ", nbVolumes=" + nbVolumes + ", " +
                super.toString() +
                '}';
    }
}

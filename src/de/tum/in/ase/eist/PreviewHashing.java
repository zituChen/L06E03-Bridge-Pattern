package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {

    private SimpleHashAlgorithm implementation;

    private static final int UPPER_LIMIT = 1000;

    public PreviewHashing() {
        this.implementation = new SimpleHashAlgorithm();
    }

    public SimpleHashAlgorithm getImplementation() {
        return implementation;
    }

    public String hashDocument(String string) {
        if (string.length() > UPPER_LIMIT) {
            throw new IllegalArgumentException();
        } else {
            return implementation.calculateHashCode(string);
        }
    }


}

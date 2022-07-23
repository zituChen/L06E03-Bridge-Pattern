package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing {

    private CryptoSecureHashAlgorithm implementation;
    private SimpleHashAlgorithm simpleHashAlgorithm;

    public CryptoSecureHashAlgorithm getImplementation() {
        return implementation;
    }

    public EnterpriseHashing() {
        this.implementation = new CryptoSecureHashAlgorithm();
    }

    @Override
    public String hashDocument(String string) {
        return implementation.calculateHashCode(string);
    }


}

package org.animal.refined.model;

public class Mouton extends Animal {

    protected Mouton() {
        super("mouton");
        this.setDescription("je suis un animal domestique, docile");
        this.setNourriture("je suis herbivore");
    }

    @Override
    public void mouvoir() {
        print("je marche avec 4 pates sur la terre ferme");
    }

    @Override
    public void crier() {
        faireLeCri("je bêle", "mbêêêêêê !!!");
    }
}

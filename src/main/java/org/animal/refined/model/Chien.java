package org.animal.refined.model;

public class Chien extends Animal {

    protected Chien() {
        super("chien");
        this.setDescription("je suis un animal domestique, agressif");
        this.setNourriture("je suis carnivore");
    }

    @Override
    public void mouvoir() {
        print("je marche avec 4 pates sur la terre ferme");
    }

    @Override
    public void crier() {
        faireLeCri("j'aboie", "waf waf !!!");
    }
}

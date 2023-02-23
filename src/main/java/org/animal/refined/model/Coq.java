package org.animal.refined.model;

public class Coq extends Animal {

    protected Coq() {
        super("coq");
        this.setDescription("je suis un animal domestique, peureux");
        this.setNourriture("je me nourris de graines");
    }

    @Override
    public void mouvoir() {
        print("je marche avec 2 pates sur la terre ferme");
    }

    @Override
    public void crier() {
        faireLeCri("je chante", "cocoriricôôô !!!");
    }
}

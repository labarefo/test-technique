package org.animal.refined.model;

public class Poisson extends Animal {

    protected Poisson() {
        super("poisson");
        this.setDescription("je suis un animal qui vit dans l'eau, je suis souvent appâté");
        this.setNourriture("je me nourris de plactons");
    }

    @Override
    public void mouvoir() {
        print("je nage dans l'eau");
    }

}

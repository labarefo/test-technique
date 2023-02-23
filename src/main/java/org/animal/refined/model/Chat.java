package org.animal.refined.model;

public class Chat extends Animal {

    protected Chat() {
        super("chat");
        this.setDescription("je suis un animal domestique, je chasse à l'affui");
        this.setNourriture("je suis carnivore");
    }

    @Override
    public void mouvoir() {
        print("je marche avec pates sur la terre ferme");
    }

    @Override
    public void crier() {
        faireLeCri("je miaule", "miaou miaou !!!");
    }
}

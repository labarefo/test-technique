package org.animal.refined.model;

import java.util.Arrays;
import java.util.Objects;

public abstract class Animal {

    private final String nom;
    private String description;
    private String nourriture;

    private boolean faim;

    private boolean soif;

    private boolean vivant;


    public Animal(String nom) {
        this.nom = nom;
        setFaim(false);
        setSoif(false);
        setVivant(true);
    }

    public abstract void mouvoir();

    public void crier() {
        print("je ne sais pas faire.");
    }

    protected void faireLeCri(String ... cris) {
        if(Objects.nonNull(cris)){
            Arrays.stream(cris).forEach(
                    cri -> print(cri)
            );
        }
    }

    protected void print(String str) {
        System.out.println(String.format("==> %s", str));
    }

    public void presenteToi() {
        System.out.println(String.format("---------------------- %s -------------------", nom));
        print(description);
        print(nourriture);
        mouvoir();
        crier();
    }
    public static Animal chien() {
        return new Chien();
    }
    public static Animal chat() {
        return new Chat();
    }
    public static Animal mouton() {
        return new Mouton();
    }
    public static Animal coq() {
        return new Coq();
    }
    public static Animal poisson() {
        return new Poisson();
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNourriture() {
        return nourriture;
    }

    public void setNourriture(String nourriture) {
        this.nourriture = nourriture;
    }

    public boolean aFaim() {
        return faim;
    }

    public void setFaim(boolean faim) {
        this.faim = faim;
    }

    public boolean aSoif() {
        return soif;
    }

    public void setSoif(boolean soif) {
        this.soif = soif;
    }

    public boolean isVivant() {
        return vivant;
    }

    public void setVivant(boolean vivant) {
        this.vivant = vivant;
    }
}

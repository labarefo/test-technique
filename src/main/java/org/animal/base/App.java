package org.animal.base;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("---------------------- poisson -------------------");
        presenterAnimal("poisson");
        deplacement("poisson");
        cri("poisson");
    }

    private static void cri(String animal) {
        if(animal.equals("chien")){
            System.out.println("==>j'aboie");
            System.out.println("==>waf waf !!!");
        } else if(animal.equals("chat")){
            System.out.println("==>je miaule");
            System.out.println("==>miaou miaou !!!");
        } else if(animal.equals("mouton")){
            System.out.println("==>je bêle");
            System.out.println("==>mbêêêêêê !!!!!");
        } else if(animal.equals("coq")) {
            System.out.println("==>je chante");
            System.out.println("==>cocoriricôôô !!!");
        } else if(animal.equals("poisson")) {
            System.out.println("==>je ne sais pas crier !!!");
        }
    }

    private static void deplacement(String animal) {
        if(animal.equals("chien")){
            System.out.println("==>je marche à 4 pates sur la terre ferme");
        } else if(animal.equals("chat")){
            System.out.println("==>je marche à 4 pates sur la terre ferme");
        } else if(animal.equals("mouton")){
            System.out.println("==>je marche à 4 pates sur la terre ferme");
        } else if(animal.equals("coq")) {
            System.out.println("==>je marche à 2 pates sur la terre ferme");
        } else if(animal.equals("poisson")) {
            System.out.println("==>je nage dans l'eau");
        }
    }

    private static void presenterAnimal(String animal) {
        if(animal.equals("chien")){
            System.out.println("==>je suis un animal domestique");
            System.out.println("==>je suis carnivore");
        } else if(animal.equals("chat")){
            System.out.println("==>je suis un animal domestique");
            System.out.println("==>je suis carnivore");
        } else if(animal.equals("mouton")){
            System.out.println("==>je suis un animal domestique");
            System.out.println("==>je suis herbivore");
        } else if(animal.equals("coq")) {
            System.out.println("==>je suis un animal domestique");
            System.out.println("==>je me nourris de graines");
        } else if(animal.equals("poisson")) {
            System.out.println("==>je suis un animal qui vit dans l'eau");
            System.out.println("==>je me nourris de plactons");
        }
    }

}

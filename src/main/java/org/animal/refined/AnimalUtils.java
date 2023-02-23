package org.animal.refined;

import org.animal.refined.model.Animal;

import java.util.Collection;
import java.util.Random;

public class AnimalUtils {

    public static void setRandomFaim(Animal animal) {
        Random random = new Random();
        boolean b = random.nextBoolean();
        animal.setFaim(b);
    }

    public static void setRandomSoif(Animal animal) {
        Random random = new Random();
        boolean b = random.nextBoolean();
        animal.setSoif(b);
    }

    public static void changeRandomSoifFaim(Collection<Animal> animals) {
        animals.forEach(a -> {
            if (a.aFaim() || a.aSoif()) {
                a.setVivant(false);
            } else {
                setRandomFaim(a);
                setRandomSoif(a);
            }
        });
    }

    public static boolean tousVivants(Collection<Animal> animals) {
        return animals.stream().allMatch(Animal::isVivant);
    }

    public static void alimenterAnimaux(Collection<Animal> animals) {
        // TODO si l'animal a faim ou a soif , l'alimenter

    }

    public static void routinePrincipal(Collection<Animal> animals) {
        // TODO Alimenter les animaux si besoin pour ne que le programme ne s'arrête pas
        System.out.println("Début du test, tous les animaux sont vivants");
        while (tousVivants(animals)) {
            changeRandomSoifFaim(animals);
        }
        System.out.println("Fin du test, au moins un animal est mort");
    }
}


/**
 * TODO - Commentaire pour l'examinateur -
 *  Les fonctions setRandomFaim et setRandomSoif peuvent être mise en private
 *
 * TODO si l'animal a faim ou a soif , l'alimenter
 *         animals.stream().filter(Animal::aSoif).
 *                 forEach(a -> {
 *                     a.setSoif(false);
 *                 });
 *         animals.stream().filter(Animal::aFaim).
 *                 forEach(a -> {
 *                     a.setFaim(false);
 *                 });
 *
 *  Pour le TODO Alimenter les animaux si besoin pour ne que le programme ne s'arrête pas ajouter cette ligne après changeRandomSoifFaim(animals);
 *              alimenterAnimaux(animals);
 *
 */

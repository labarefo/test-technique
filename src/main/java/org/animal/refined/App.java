package org.animal.refined;

import org.animal.refined.model.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Animal> animaux = new ArrayList<>();
        animaux.add(Animal.chien());
        animaux.add(Animal.chat());
        animaux.add(Animal.mouton());
        animaux.add(Animal.coq());
        animaux.add(Animal.poisson());

        animaux.forEach(Animal::presenteToi);

        AnimalUtils.routinePrincipal(animaux);
    }
}

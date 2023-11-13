package org.animal.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    void should_success_present_poisson() {
        Assertions.assertEquals(App.Animal.presenterAnimal("poisson"), """
                        ==>je suis un animal qui vit dans l'eau
                        ==>je me nourris de plactons
                        """);
    }

    @Test
    void should_success_deplacement_poisson() {
        Assertions.assertEquals(App.Animal.deplacement("poisson"), "==>je nage dans l'eau");
    }

    @Test
    void should_success_cri_poisson() {
        Assertions.assertEquals(App.Animal.cri("poisson"), "==>je ne sais pas crier !!!");
    }

    @Test
    void should_fails_when_animal_unknown() {
        Assertions.assertEquals(App.Animal.presenterAnimal("hibou"), "Animal inconnu");
        Assertions.assertEquals(App.Animal.deplacement("hibou"), "Animal inconnu");
        Assertions.assertEquals(App.Animal.cri("hibou"), "Animal inconnu");
    }


}

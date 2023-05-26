package org.animal.base;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("---------------------- poisson -------------------");
        System.out.println(Animal.presenterAnimal("poisson"));
        System.out.println(Animal.deplacement("poisson"));
        System.out.println(Animal.cri("poisson"));
    }

    static class Animal {

        public static String cri(String animal) {
            return switch (animal) {
                case "chien" -> """
                        ==>j'aboie
                        ==>waf waf !!!
                        """;
                case "chat" -> """
                        ==>je miaule
                        ==>miaou miaou !!!
                        """;
                case "mouton" -> """
                        ==>je bêle
                        ==>mbêêêêêê !!!!!
                        """;
                case "coq" -> """
                        ==>je chante
                        ==>cocoriricôôô !!!
                        """;
                case "poisson" -> "==>je ne sais pas crier !!!";
                default -> "Animal inconnu";
            };
        }

        public static String deplacement(String animal) {
            return switch (animal) {
                case "chien", "chat", "mouton" -> "==>je marche à 4 pates sur la terre ferme";
                case "coq" -> "==>je marche à 2 pates sur la terre ferme";
                case "poisson" -> "==>je nage dans l'eau";
                default -> "Animal inconnu";
            };
        }

        public static String presenterAnimal(String animal) {
            return switch (animal) {
                case "chien", "chat" ->
                        """
                        ==>je suis un animal domestique
                        ==>je suis carnivore
                        """;
                case "mouton" ->
                        """
                        ==>je suis un animal domestique
                        ==>je suis herbivore
                        """;
                case "coq" ->
                        """
                        ==>je suis un animal domestique
                        ==>je me nourris de graines
                        """;
                case "poisson" ->
                        """
                        ==>je suis un animal qui vit dans l'eau
                        ==>je me nourris de plactons
                        """;
                default -> "Animal inconnu";
            };
        }
    }


}

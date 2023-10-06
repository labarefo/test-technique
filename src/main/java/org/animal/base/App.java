package org.animal.base;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("---------------------- chat -------------------");
        System.out.println(Animal.presenterAnimal("chat"));
        System.out.println(Animal.deplacement("chat"));
        System.out.println(Animal.cri("chat"));
    }

    static class Animal {

        public static String cri(String animal) {
            return switch (animal) {
                case "chat" -> """
                        ==>je miaule
                        ==>miaou miaou !!!
                        """;
                default -> "Animal inconnu";
            };
        }

        public static String deplacement(String animal) {
            return switch (animal) {
                case "chat" -> "==>je marche à 4 pates sur la terre ferme";
                default -> "Animal inconnu";
            };
        }

        public static String presenterAnimal(String animal) {
            return switch (animal) {
                case "chat" ->
                        """
                        ==>je suis un animal domestique
                        ==>je suis carnivore
                        """;
                default -> "Animal inconnu";
            };
        }
    }


}

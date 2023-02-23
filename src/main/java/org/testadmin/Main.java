package org.testadmin;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Les notions attendues que l'on veut faire ressortir
 *
 */

public class Main {

    // TODO utiliser ce logger pour afficher les informations sur l'administrateur
    private final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        Admin admin = new Admin();
        /** Voici les informations que nous voulons pour admin, il faut les peupler avec :
         * name = "DUPUIS"
         * surname = "Romain"
         * address = "1 rue des 4 Chapeaux"
         * country = "FRANCE"
         * gender = Gender.MALE
         * date = "22-05-2000"
         */
        System.out.println(admin.name + admin.surname + admin.role + admin.address + admin.country + admin.gender + admin.birthday + admin.email);
    }
}

// TODO - Commentaire pour l'examinateur - System a remplacer par logger.info par exemple et utiliser toString plutôt que l'énumération de tous ses attributs

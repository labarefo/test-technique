package org.testadmin;

public class Admin extends User {

    String role = Role.ADMIN.getLibelle();
}

/** TODO - Commentaire pour l'examinateur -
 * role a modifier en enum
 * la variable role ne doit pas pouvoir être modifiée et donc peut être passée en final et ne doit pas avoir de setter
 */

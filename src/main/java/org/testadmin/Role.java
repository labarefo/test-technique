package org.testadmin;

public enum Role {
    GUEST("invité"),
    ADMIN("administrateur"),
    COMMERCIAL("commercial");

    private final String libelle;


    Role(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return libelle;
    }
}

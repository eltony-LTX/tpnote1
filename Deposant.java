/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote1;

/**
 *
 * @author Ltxny
 */
class Deposant extends Personne {
    private String civilite;
    private String adresseMessagerie;
    private Adresse adresse;
    
    
    public Deposant ( String nom, String prenom, Adresse adresse) {
        super(nom,prenom);
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
}
    public String toString () {
String chaine = "";

chaine = chaine + this.nom + " " + this.prenom + " " + this.adresse;
return chaine;
}
}

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
public class Personne {
    private String nom;
    private String prenom;
    private String chaine;
    private Integer taille;
    
    
    public Personne(String nom, String prenom) {

this.nom = validate(nom, 50);
this.prenom = validate(prenom, 30);
}
private String validate (String chaine, Integer taille) {
if (taille <= chaine.length()) {
        return chaine;
} else {
    chaine = chaine.substring(0, taille);
}
        
}

   
    @Override
    public String toString() {
    return this.nom + " " + this.prenom; }
}






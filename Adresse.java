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
public class Adresse {
   
    private String numero;
    private String voie;
    private String ville;
    private String codePostal;
    private String bp;
    private String lieuDit;
    private String cedex;
    

        public Adresse (String numero, String voie, String ville, String codePostal, String bp, String lieuDit, String cedex) {
            this.numero = numero;
            this.voie = voie;
            this.ville = ville;
            this.codePostal = codePostal;
            this.bp = bp;
            this.lieuDit = lieuDit;
            this.cedex = cedex;
}

        private String validate (String chaine, Integer taille) {
            int count = 0;
     for(int i = 0; i < chaine.length(); i++) {  
            if(chaine.charAt(i) != ' ')  {
                count++;
            }
        }
    if ( count > taille) {
        System.out.println("Trop long!!");
    } else {
return chaine; }
        return null;
}
}

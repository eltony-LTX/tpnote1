/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote1_maxime_pilard;

/**
 *
 * @author maxim
 */
public class Traitement {
public static void main(String[] args) {
Adresse adresseD1 = new Adresse("56", "Remont", "Versailles", "78000", "77, rue albert sarraut", "Chez moi", "78000  VERSAILLES CEDEX");
Adresse adresseD2 = new Adresse("65", "yves le coz", "Versailles", "78000", "77, rue albert sarraut", "Chez moi", "78000  VERSAILLES CEDEX");
Adresse adresse1 = new Adresse("77", "Albert Sarraut", "Versailles", "78000", "77, rue albert sarraut", "Chez moi", "78000  VERSAILLES CEDEX");
Adresse adresse2 = new Adresse("56", "Moliere", "Versailles", "78000", "77, rue albert sarraut", "Chez moi", "78000  VERSAILLES CEDEX");
Deposant deposant1 = new Deposant("Maxime", "Pilard", adresseD1);
Deposant deposant2 = new Deposant("Baudouin", "Clouet", adresseD2);
Architecte architecte1 = new Architecte("Koueta", "Berthony", "Yvelines", true, adresse1, "06.31.47.10.35");
Architecte architecte2 = new Architecte("Louarassi", "Rayan", "Yvelines", false , adresse2, "06.31.47.125.35");
System.out.print(architecte1.toString()+"\n");
System.out.print(architecte2.toString()+"\n");
deposant1.setCivilite("Femme");
deposant2.setCivilite("Homme");
deposant1.setAdresseMessagerie("maxime.pilard@esme.fr");
deposant2.setAdresseMessagerie("baudouin.clouet@esme.fr");
System.out.print(deposant1.toString()+"\n");
System.out.print(deposant2.toString()+"\n");
}
}
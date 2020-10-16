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
class Architecte extends Personne   {
    private String conseilRegional;
    private boolean inscriptionOrdre;
    private Adresse Adresse;
    private String telephone;
    private String tout;


public Architecte(String nom, String prenom, String conseilRegional, boolean
inscriptionOrdre,Adresse adresse, String telephone)
{
super(nom, prenom);
this.conseilRegional = conseilRegional;
this.inscriptionOrdre = inscriptionOrdre;
this.adresse = adresse;
if (telephoneValide(telephone))
{ this.telephone = telephone; }
else
{ this.telephone = ""; }
Maj_conseilRegional();
}
private boolean telephoneValide(String telephone){
    int count = 0;
     for(int i = 0; i < telephone.length(); i++) {
            if(telephone.charAt(i) != ' ')  {
                count++;
            }
        }
    if ( count != 10) {
        System.out.println("Trop long!!");
        return false;
    } else {
return true; }

}
	  public void Maj_conseilRegional() {
	    if (this.getConseilRegional() == null)this.setConseilRegional("Conseil regional non renseigne");
	  }


	  public String toString() {
	    String chaine = "";
	    chaine = chaine + this.conseilRegional + " ";
	    if (this.inscriptionOrdre) chaine = chaine + "inscrit";
	    else chaine = chaine + "pas inscrit";
	    chaine = chaine + " " + this.telephone;
	    return chaine;
	  }

public String getConseilRegional () {
        return conseilRegional;
        }

 public void setConseilRegional( String conseilRegional ){
            this.conseilRegional = conseilRegional;
        }

public boolean isInscriptionOrdre () {
        return inscriptionOrdre;
        }

 public void setInscriptionOrdre( boolean inscriptionOrdre ){
            this.inscriptionOrdre = inscriptionOrdre;
        }

 public Personne.Adresse getAdresse () {
        return Adresse;
        }

 public void setAdresse (Personne.Adresse Adresse) {
        this.Adresse = Adresse;
        }

  public String getTelephone () {
        return telephone;
        }

  public void setTelephone (String telephone) {
        this.telephone = telephone;
        }
}

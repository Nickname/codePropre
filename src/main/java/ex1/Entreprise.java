package ex1;

import java.util.Date;

/**
 * @author ETY15
 *
 */
public class Entreprise {

	/** siret : int */
	private int siret;
	/** nom : String */
	private String nom;
	/** adresse : String */
	private String adresse;
	/** dateCreation : Date */
	private Date dateCreation;
	
	/** CAPITAL_MAX : int */
	private static final int CAPITAL_MAX = 3000000;
	
	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}
	
	/** Affiche le statut de l'entreprise
	 *  
	 */
	public void afficherStatut(){
		// TODO non implémenté
	}
	
}

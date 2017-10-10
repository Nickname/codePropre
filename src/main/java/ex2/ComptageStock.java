package ex2;

import java.util.Date;

public class ComptageStock {

	/** nb : int */
	private int nb;
	/** resultat : int */
	private int resultat;
	/** dateDebutComptage : Date */
	private Date dateDebutComptage;
	/** dateFinComptage : String */
	private Date dateFinComptage;
	
	/**
	 * @param montant
	 */
	public void ajouterElement(int montant){
		nb++;
		resultat += montant;
	}
	
	/**
	 * @param typeComptage
	 */
	public void afficherStatutComptage(TypeComptage typeComptage){
		if (typeComptage != null) {
			if (typeComptage.equals(TypeComptage.SOMME)){
				this.afficherSomme();
			} else if (typeComptage.equals(TypeComptage.MOYENNE)){
				this.afficherMoyenne();
			}
		}
		
		this.afficherDateDebutComptage();
		
		this.afficherDateFinComptage();
	}
	
	/** Affiche la somme
	 * 
	 */
	public void afficherSomme() {
		System.out.println("Ce comptage est de type SOMME");
		System.out.println("Nombre d'élements "+nb);
		
		System.out.println("Résultat "+resultat);
	}
	
	/** Affiche la moyenne
	 * 
	 */
	public void afficherMoyenne() {
		System.out.println("Ce compte est de type MOYENNE");
		System.out.println("Nombre d'élements "+nb);
		
		System.out.println("Résultat "+resultat/nb);
	}
	
	/** Affiche la dateDebutComptage
	 * 
	 */
	public void afficherDateDebutComptage() {
		if (dateDebutComptage!=null){
			System.out.println(DateUtil.toString(dateDebutComptage, DateUtil.FORMAT_DDMMYYYY_HHMMSS));
		}
	}
	
	/** affiche état du compte en fonction de la dateFinComptage
	 * void
	 */
	public void afficherDateFinComptage() {
		if (dateFinComptage!=null){
			System.out.println("Le comptage est clos depuis le " + DateUtil.toString(dateFinComptage, DateUtil.FORMAT_DDMMYYYY_HHMMSS));
			if (nb==0){
				System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
			}
			else {
				System.out.println("Le comptage est clos et est OK.");
			}
		}
		else {
			System.out.println("Le compte est actif.");
		}
	}
}

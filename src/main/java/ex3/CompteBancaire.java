package ex3;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;
	
	private List<CompteBancaire> listCompte = new ArrayList<>();
	
	public CompteBancaire(double solde) {
		this.solde = solde;
	}
	
	public boolean ouvrirUnCompte(TypeCompte type, double solde) {
		if (type.equals(TypeCompte.CC)) {
			listCompte.add(new CompteCourant(solde, -100.00));
			return true;
		} else if (type.equals(TypeCompte.LA)) {
			listCompte.add(new LivretA(solde, 5));
			return true;
		}
		return false;
	}
	
	/** Getter for type
	 * @return the type
	 */
	public String getType() {
		return listCompte.stream()
						.map(c -> c.getType())
						.collect(Collectors.joining(", "));
	}
	
	public List<CompteBancaire> getComptes() {
		return this.listCompte;
	}
	
	public class CompteCourant extends CompteBancaire {	
		
		/** decouvert : un découvert est autorisé seulement pour les comptes courants */
		private double decouvert;
		
		/**
		 * @param solde
		 * @param decouvert
		 * @param type
		 */
		public CompteCourant(double solde, double decouvert) {
			super(solde);
			this.decouvert = decouvert;
		}
		
		/** Ajoute un montant au solde
		 * @param montant
		 */
		public void ajouterMontant(double montant){
			this.solde += montant;
		}
		
		/** Ajoute un montant au solde
		 * @param montant
		 */
		public void debiterMontant(double montant){
			if (this.solde - montant > decouvert){
				this.solde = solde - montant;
			}
		}
		
	}

	public class LivretA extends CompteBancaire {
		
		/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
		private double tauxRemuneration;
		
		/** Ce constructeur est utilisé pour créer un compte de type Livret A
		 * @param type = LA
		 * @param solde représente le solde du compte
		 * @param decouvert  représente le découvert autorisé
		 * @param tauxRemuneration  représente le taux de rémunération du livret A
		 */
		public LivretA(double solde, double tauxRemuneration) {
			super(solde);
			this.tauxRemuneration = tauxRemuneration;
		}
		
		/** Getter for solde
		 * @return the solde
		 */
		public double getSolde() {
			return solde;
		}
		
		/** Setter
		 * @param solde the solde to set
		 */
		public void setSolde(double solde) {
			this.solde = solde;
		}
		
		/** Getter for tauxRemuneration
		 * @return the tauxRemuneration
		 */
		public double getTauxRemuneration() {
			return tauxRemuneration;
		}
		
		/** Setter
		 * @param tauxRemuneration the tauxRemuneration to set
		 */
		public void setTauxRemuneration(double tauxRemuneration) {
			this.tauxRemuneration = tauxRemuneration;
		}
		
		/** Ajoute un montant au solde
		 * @param montant
		 */
		public void debiterMontant(double montant){
			if (this.solde - montant > 0){
				this.solde = solde - montant;
			}
		}
		
		public void appliquerRemuAnnuelle(){
			this.solde = solde + solde*tauxRemuneration/100;
		}
		
	}
	
}

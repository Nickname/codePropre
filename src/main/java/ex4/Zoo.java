package ex4;

import ex4.animal.*;
import ex4.enclot.*;

public class Zoo {

	private String nom;
	private Enclot savaneAfricaine = new SavaneAfricaine();
	private Enclot zoneCarnivore = new ZoneCarnivore();
	private Enclot fermeReptile = new FermeReptile();
	private Enclot aquarium = new Aquarium();
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(Animal animal){
		if (animal instanceof Mammifere) {
			if (animal.getType().equals(Comportement.CARNIVORE)) {
				zoneCarnivore.addAnimal(animal);
			} else if (animal.getType().equals(Comportement.HERBIVORE)) {
				savaneAfricaine.addAnimal(animal);
			}
		} else if (animal instanceof Reptile){
			fermeReptile.addAnimal(animal);
		}
		else if (animal instanceof Poisson){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}

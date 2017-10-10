package ex4.animal;

public class Animal {
	protected String nom;
	protected Comportement type;
	
	protected Animal(String nom, Comportement type) {
		this.nom = nom;
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Comportement getType() {
		return type;
	}

	public void setType(Comportement type) {
		this.type = type;
	}
	
}

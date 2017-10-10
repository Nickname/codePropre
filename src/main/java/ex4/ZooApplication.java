package ex4;

import ex4.animal.*;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Mammifere("Gazelle", Comportement.HERBIVORE));
		zoo.addAnimal(new Mammifere("Zèbre", Comportement.HERBIVORE));
		zoo.addAnimal(new Mammifere("Lion", Comportement.CARNIVORE));
		zoo.addAnimal(new Mammifere("Panthère", Comportement.CARNIVORE));
		zoo.addAnimal(new Poisson("Requin blanc", Comportement.HERBIVORE));
		zoo.addAnimal(new Poisson("Truite dorée", Comportement.HERBIVORE));
		zoo.addAnimal(new Reptile("Boa constrictor", Comportement.CARNIVORE));
		zoo.addAnimal(new Reptile("Python", Comportement.CARNIVORE));
		
		zoo.afficherListeAnimaux();
	}

}

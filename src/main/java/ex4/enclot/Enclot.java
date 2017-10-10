package ex4.enclot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ex4.animal.Animal;

public class Enclot {

	protected List<Animal> animals = new ArrayList<>();

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void afficherListeAnimaux(){
		String strName = this.animals.stream()
							.map(Animal::getNom)
							.collect(Collectors.joining(", "));
		System.out.println(strName);
	}
	
	public int compterAnimaux(){
		return animals.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return animals.size() * 0.2;
	}
}

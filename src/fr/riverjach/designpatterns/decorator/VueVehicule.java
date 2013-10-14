package fr.riverjach.designpatterns.decorator;

public class VueVehicule implements ComposantGraphiqueVehicule {

	@Override
	public void affiche() {
		System.out.println("Affichage du véhicule");

	}

}

package fr.riverjach.designpatterns.abstractfactory;

public interface FabriqueVehicule {
	Automobile creeAutomobile(String modele, String couleur, int puissance,
			double espace);

	Scooter creeScooter(String modele, String couleur, int puissance);

}

package fr.riverjach.designpatterns.abstractfactory;

public class FabriqueVehiculeElectrique implements FabriqueVehicule {

	@Override
	public Automobile creeAutomobile(String modele, String couleur,
			int puissance, double espace) {
		return new AutomobileElectrique(modele, couleur, puissance, espace);
	}

	@Override
	public Scooter creeScooter(String modele, String couleur, int puissance) {
		return new ScooterElectrique(modele, couleur, puissance);
	}

}

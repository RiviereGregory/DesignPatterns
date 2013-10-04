package fr.riverjach.designpatterns.abstractfactory;

public class FabriqueVehiculeEssence implements FabriqueVehicule {

	@Override
	public Automobile creeAutomobile(String modele, String couleur,
			int puissance, double espace) {
		return new AutomobileEssence(modele, couleur, puissance, espace);
	}

	@Override
	public Scooter creeScooter(String modele, String couleur, int puissance) {
		return new ScooterEssence(modele, couleur, puissance);
	}

}

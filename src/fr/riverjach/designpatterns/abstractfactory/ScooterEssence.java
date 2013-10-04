package fr.riverjach.designpatterns.abstractfactory;

public class ScooterEssence extends Scooter {

	public ScooterEssence() {
		super();
	}

	public ScooterEssence(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Automobile essence de modele : " + getModele()
				+ " de couleur : " + getCouleur() + " de puissance : "
				+ getPuissance());

	}

}

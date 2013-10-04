package fr.riverjach.designpatterns.abstractfactory;

public class ScooterElectrique extends Scooter {

	public ScooterElectrique() {
		super();
	}

	public ScooterElectrique(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Automobile électrique de modele : " + getModele()
				+ " de couleur : " + getCouleur() + " de puissance : "
				+ getPuissance());

	}

}

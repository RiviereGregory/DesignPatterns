package fr.riverjach.designpatterns.abstractfactory;

public class AutomobileEssence extends Automobile {


	public AutomobileEssence(String modele, String couleur, int puissance,
			double espace) {
		super(modele, couleur, puissance, espace);
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Automobile essence de modele : " + getModele()
				+ " de couleur : " + getCouleur() + " de puissance : "
				+ getPuissance() + " d'espace : " + getEspace());

	}

}

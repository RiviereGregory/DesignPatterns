package fr.riverjach.designpatterns.abstractfactory;

public class AutomobileElectrique extends Automobile {


	public AutomobileElectrique(String modele, String couleur, int puissance,
			double espace) {
		super(modele, couleur, puissance, espace);
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Automobile électrique de modele : " + getModele()
				+ " de couleur : " + getCouleur() + " de puissance : "
				+ getPuissance() + " d'espace : " + getEspace());

	}

}

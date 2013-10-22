package fr.riverjach.designpatterns.strategy;

import java.util.List;

public class DessinTroisVehiculesLigne implements DessinCatalogue {

	@Override
	public void dessine(List<VueVehicule> contenu) {
		int compteur;
		System.out.println("Dessine les vehicules avec trois vehicules par ligne");
		compteur = 0;
		for (VueVehicule vueVehicule : contenu) {
			vueVehicule.dessine();
			compteur++;
			if (compteur == 3) {
				System.out.println();
				compteur = 0;
			} else {
				System.out.print(" ");
			}
		}
		if (compteur != 0) {
			System.out.println();
		}
		System.out.println();

	}

}

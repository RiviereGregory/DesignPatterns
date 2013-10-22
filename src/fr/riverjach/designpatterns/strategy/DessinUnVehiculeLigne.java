package fr.riverjach.designpatterns.strategy;

import java.util.List;

public class DessinUnVehiculeLigne implements DessinCatalogue {

	@Override
	public void dessine(List<VueVehicule> contenu) {
		System.out.println("Dessine les vehicules avec un vehicule par ligne");
		for (VueVehicule vueVehicule : contenu) {
			vueVehicule.dessine();
			System.out.println();
		}
		System.out.println();

	}

}

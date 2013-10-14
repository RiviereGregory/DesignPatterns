package fr.riverjach.designpatterns.facade;

import java.util.ArrayList;
import java.util.List;

public class ComposantCatalogue implements Catalogue {

	// remplace la base de données
	protected Object[] descriptionsVehicule = { "Berline 5 portes", 6000, "Compact 3 portes", 4000,
			"Espace 5 portes", 8000, "Break 5 portes", 7000, "Coupé 2 portes", 9000,
			"Utilitaire 3 portes", 5000

	};

	@Override
	public List<String> retrouveVehicules(int prixMin, int prixMax) {
		int index, taille;
		List<String> resultat = new ArrayList<>();
		taille = descriptionsVehicule.length / 2;
		for (index = 0; index < taille; index++) {
			int prix = (Integer) descriptionsVehicule[2 * index + 1];
			if ((prix >= prixMin) && (prix <= prixMax)) {
				resultat.add((String) descriptionsVehicule[2 * index]);
			}
		}
		return resultat;
	}

}

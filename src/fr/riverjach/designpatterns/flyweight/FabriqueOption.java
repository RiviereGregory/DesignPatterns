package fr.riverjach.designpatterns.flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FabriqueOption {
	// Dictionnaire des options
	protected Map<String, OptionVehicule> options = new TreeMap<>();

	public OptionVehicule getOptions(String nom) {
		OptionVehicule resultat;
		if (options.containsKey(nom)) {
			return options.get(nom);
		} else {
			resultat = new OptionVehicule(nom);
			options.put(nom, resultat);
		}

		return resultat;

	}

}

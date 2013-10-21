package fr.riverjach.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class ChariotOption {
	protected List<OptionVehicule> options = new ArrayList<>();

	public Memento ajouteOption(OptionVehicule optionVehicule) {
		MementoImpl resultat = new MementoImpl();
		resultat.setEtat(options);
		options.removeAll(optionVehicule.getOptionsIncompatibles());
		options.add(optionVehicule);
		return resultat;
	}

	public void annule(Memento memento) {
		MementoImpl mementoImplInstance;

		try {
			mementoImplInstance = (MementoImpl) memento;
		} catch (ClassCastException e) {
			return;
		}
		options = mementoImplInstance.getEtat();
	}

	public void affiche() {
		System.out.println("Contenu du chariot des options");
		for (OptionVehicule option : options) {
			option.affiche();
		}
		System.out.println();
	}
}

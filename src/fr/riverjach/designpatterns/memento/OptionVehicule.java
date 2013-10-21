package fr.riverjach.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class OptionVehicule {
	protected String nom;
	protected List<OptionVehicule> optionsIncompatibles = new ArrayList<>();

	public OptionVehicule(String nom) {
		this.nom = nom;
	}

	public void ajouteOptionIncompatible(OptionVehicule optionIncompatible) {
		if (!optionsIncompatibles.contains(optionIncompatible)) {
			optionsIncompatibles.add(optionIncompatible);
			optionIncompatible.ajouteOptionIncompatible(this);
		}
	}

	public void affiche() {
		System.out.println("option : " + getNom());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<OptionVehicule> getOptionsIncompatibles() {
		return optionsIncompatibles;
	}

	public void setOptionsIncompatibles(List<OptionVehicule> optionsIncompatibles) {
		this.optionsIncompatibles = optionsIncompatibles;
	}
}

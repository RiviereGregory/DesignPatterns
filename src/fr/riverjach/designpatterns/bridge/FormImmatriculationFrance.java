package fr.riverjach.designpatterns.bridge;

import java.util.regex.Pattern;

public class FormImmatriculationFrance extends FormulaireImmatriculation {

	public FormImmatriculationFrance(FormulaireImpl implantation) {
		super(implantation);
	}

	public void affiche() {
		System.out.println("Modele Plaque française (AA123AA)");
		super.affiche();

	}

	@Override
	public boolean controleSaisie(String plaque) {
		// retourne vrai si la plaque est de type aa123aa
		return Pattern.matches("[A-Za-z]{2}[0-9]{3}[A-Za-z]{2}", plaque);
	}

}

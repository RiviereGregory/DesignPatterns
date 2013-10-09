package fr.riverjach.designpatterns.bridge;

import java.util.regex.Pattern;

public class FormImmatriculationLuxembourg extends FormulaireImmatriculation {

	public FormImmatriculationLuxembourg(FormulaireImpl implantation) {
		super(implantation);
	}

	public void affiche() {
		System.out.println("Modele Plaque luxembourgeoise (AA1234 ou 12345)");
		super.affiche();

	}

	@Override
	public boolean controleSaisie(String plaque) {
		// retourne vrai si la plaque est de type AA1234 ou 12345
		return Pattern.matches("[A-Za-z]{2}[0-9]{4}", plaque)
				|| Pattern.matches("[0-9]{5}", plaque);
	}

}

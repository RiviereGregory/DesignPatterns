package fr.riverjach.designpatterns.bridge;

public class FormImmatriculationLuxembourg extends FormulaireImmatriculation {

	public FormImmatriculationLuxembourg(FormulaireImpl implantation) {
		super(implantation);
	}

	@Override
	public boolean controleSaisie(String plaque) {
		return plaque.length() == 5;
	}

}

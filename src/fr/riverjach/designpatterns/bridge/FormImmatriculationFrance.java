package fr.riverjach.designpatterns.bridge;

public class FormImmatriculationFrance extends FormulaireImmatriculation {

	public FormImmatriculationFrance(FormulaireImpl implantation) {
		super(implantation);
	}

	@Override
	public boolean controleSaisie(String plaque) {
		return plaque.length() == 7;
	}

}

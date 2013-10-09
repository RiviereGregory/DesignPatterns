package fr.riverjach.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class SocieteMere extends Societe {
	protected List<Societe> filiales = new ArrayList<>();

	@Override
	public double calculeCoutEntretien() {
		double cout = 0.0;
		for (Societe filiale : filiales) {
			cout = cout + filiale.calculeCoutEntretien();
		}
		return cout + getNbVehicule() * getCoutUnitVehicule();
	}

	@Override
	public boolean ajouteFiliale(Societe filiale) {
		return filiales.add(filiale);
	}

}

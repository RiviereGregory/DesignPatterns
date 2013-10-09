package fr.riverjach.designpatterns.composite;

public class SocieteSansFiliale extends Societe {

	@Override
	public double calculeCoutEntretien() {
		return getNbVehicule() * getCoutUnitVehicule();
	}

	@Override
	public boolean ajouteFiliale(Societe filiale) {
		return false;
	}

}

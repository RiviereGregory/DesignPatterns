package fr.riverjach.designpatterns.visitor;

public class VisiteurCalculeCoutEntretien implements Visiteur {

	@Override
	public void visite(SocieteSansFiliale societe) {
		System.out.println("cout entretien de la société " + societe.getNom() + " : "
				+ calculeCoutEntretien(societe));

	}

	@Override
	public void visite(SocieteMere societe) {
		System.out.println("cout entretien du groupe " + societe.getNom() + " : " + calculeCoutEntretien(societe));
	}

	public double calculeCoutEntretien(Societe societe) {
		double cout = 0.0;
		if (societe instanceof SocieteMere) {
			SocieteMere filiale2 = (SocieteMere)societe;
			for (Societe filiale : filiale2.getFiliales()) {
				cout = cout + calculeCoutEntretien(filiale);
			}
		}
		return cout + societe.getNbVehicule() * Societe.getCoutUnitVehicule();
	}

}

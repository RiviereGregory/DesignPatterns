package fr.riverjach.designpatterns.visitor;

public class SocieteSansFiliale extends Societe {

	public SocieteSansFiliale(String nom, String email, String adresse) {
		super(nom, email, adresse);
	}

	@Override
	public boolean ajouteFiliale(Societe filiale) {
		return false;
	}

	@Override
	public void accepteVisiteur(Visiteur visiteur) {
		visiteur.visite(this);
	}

}

package fr.riverjach.designpatterns.visitor;

public abstract class Societe {
	protected String nom, email, adresse;

	protected static double coutUnitVehicule = 5.0;
	protected int nbVehicule;

	public void ajouteVehicule() {
		nbVehicule = nbVehicule + 1;
	}

	public Societe(String nom, String email, String adresse) {
		super();
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
	}

	public abstract boolean ajouteFiliale(Societe filiale);

	public abstract void accepteVisiteur(Visiteur visiteur);

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNbVehicule() {
		return nbVehicule;
	}

	public static double getCoutUnitVehicule() {
		return coutUnitVehicule;
	}

}

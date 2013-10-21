package fr.riverjach.designpatterns.mediator;

public abstract class Controle {
	protected String valeur = "";
	protected Formulaire directeur;
	protected String nom;

	public Controle(String nom) {
		setNom(nom);
	}

	public abstract void saisie();

	public void modifie() {
		getDirecteur().controleModifie(this);
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public Formulaire getDirecteur() {
		return directeur;
	}

	public void setDirecteur(Formulaire directeur) {
		this.directeur = directeur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}

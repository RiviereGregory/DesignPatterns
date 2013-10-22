package fr.riverjach.designpatterns.state;

public class Produit {
	protected String nom;

	public Produit(String nom) {
		super();
		this.nom = nom;
	}

	public void affiche() {
		System.out.println("Produit : " + getNom());
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}

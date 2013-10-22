package fr.riverjach.designpatterns.observer;

public class VueVehicule implements Observateur {
	protected Vehicule vehicule;
	protected String texte = "";

	public VueVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
		vehicule.ajoute(this);
		metAJourTexte();
	}

	@Override
	public void actualise() {
		metAJourTexte();
		this.redessine();
	}

	protected void metAJourTexte() {
		texte = "Description : " + vehicule.description + " Prix : " + vehicule.prix;
	}

	public void redessine() {
		System.out.println(texte);
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

}

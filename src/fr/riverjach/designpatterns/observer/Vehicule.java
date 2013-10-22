package fr.riverjach.designpatterns.observer;

public class Vehicule extends Sujet {
	protected String description;
	protected Double prix;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		this.notifie();
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
		this.notifie();
	}

}

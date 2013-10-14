package fr.riverjach.designpatterns.decorator;

public abstract class Decorateur implements ComposantGraphiqueVehicule {
	protected ComposantGraphiqueVehicule composant;

	public Decorateur(ComposantGraphiqueVehicule composant) {
		this.composant = composant;
	}

	public void affiche() {
		getComposant().affiche();
	}

	public ComposantGraphiqueVehicule getComposant() {
		return composant;
	}

	public void setComposant(ComposantGraphiqueVehicule composant) {
		this.composant = composant;
	}

}

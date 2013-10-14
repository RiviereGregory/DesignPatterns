package fr.riverjach.designpatterns.decorator;

public class MarqueDecorateur extends Decorateur {

	public MarqueDecorateur(ComposantGraphiqueVehicule composant) {
		super(composant);
	}

	protected void afficheLogo() {
		System.out.println("Logo de la marque");
	}

	public void affiche() {
		super.affiche();
		this.afficheLogo();
	}

}

package fr.riverjach.designpatterns.decorator;

public class ModeleDecorateur extends Decorateur {

	public ModeleDecorateur(ComposantGraphiqueVehicule composant) {
		super(composant);
	}

	protected void afficheInfosTechniques() {
		System.out.println("Informations techniques du modèle");
	}

	public void affiche() {
		super.affiche();
		this.afficheInfosTechniques();
	}

}

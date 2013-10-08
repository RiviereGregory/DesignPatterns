package fr.riverjach.designpatterns.singleton;

public class Main {

	public static void main(String[] args) {
		// initialisation du vendeur
		Vendeur vendeur = Vendeur.instance();
		vendeur.setNom("Vendeur auto");
		vendeur.setAdresse("Marseille");
		vendeur.setEmail("vendeur@vendeur.com");

		// Affiche le vendeur
		affiche();

	}

	public static void affiche() {
		Vendeur vendeur = Vendeur.instance();
		vendeur.affiche();
	}

}

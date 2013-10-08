package fr.riverjach.designpatterns.prototype;

public class Main {

	public static void main(String[] args) {
		// initialisation de la liasse vierge
		LiasseVierge liasseVierge = LiasseVierge.instance();
		liasseVierge.ajoute(new BonDeCommande());
		liasseVierge.ajoute(new CertificatCession());
		liasseVierge.ajoute(new DemandeImmatriculation());

		// Création d'une nouvelle liasse pour 2 clients
		LiasseClient liasseClient1 = new LiasseClient("Martin");
		LiasseClient liasseClient2 = new LiasseClient("Dupont");

		liasseClient1.affiche();
		liasseClient2.affiche();

	}

}

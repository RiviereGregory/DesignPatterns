package fr.riverjach.designpatterns.state;

public class Main {

	public static void main(String[] args) {
		Commande commande = new Commande();
		commande.ajouteProduit(new Produit("Véhicule 1"));
		commande.ajouteProduit(new Produit("Accessoire 2"));
		commande.affiche();
		// Passe en commande Validee
		commande.etatSuivant();
		commande.ajouteProduit(new Produit("Accessoire 3"));
		// Efface la commande
		commande.efface();
		commande.affiche();

		Commande commande2 = new Commande();
		commande2.ajouteProduit(new Produit("Véhicule 11"));
		commande2.ajouteProduit(new Produit("Accessoire 21"));
		commande2.affiche();
		// Passe en commande Validee
		commande2.etatSuivant();
		commande2.affiche();
		// Passe en commande livree
		commande2.etatSuivant();
		// n'efface pas la commande car livrée
		commande2.efface();
		commande2.affiche();

	}

}

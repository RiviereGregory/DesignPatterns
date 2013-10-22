package fr.riverjach.designpatterns.state;

import java.util.ArrayList;
import java.util.List;

public class Commande {
	protected List<Produit> produits = new ArrayList<>();
	protected EtatCommande etatCommande;

	public Commande() {
		etatCommande = new CommandeEnCours(this);
	}

	public void ajouteProduit(Produit produit) {
		etatCommande.ajouteProduit(produit);
	}

	public void retireProduit(Produit produit) {
		etatCommande.retireProduit(produit);
	}

	public void efface() {
		etatCommande.efface();
	}

	public void etatSuivant() {
		etatCommande = etatCommande.etatSuivant();
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public void affiche() {
		System.out.println("Contenu de la commande");
		for (Produit produit : produits) {
			produit.affiche();
		}
		System.out.println();
	}
}

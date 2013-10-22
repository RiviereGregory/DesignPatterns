package fr.riverjach.designpatterns.state;

public class CommandeEnCours extends EtatCommande {

	public CommandeEnCours(Commande commande) {
		super(commande);
	}

	@Override
	public void ajouteProduit(Produit produit) {
		commande.getProduits().add(produit);

	}

	@Override
	public void efface() {
		commande.getProduits().clear();

	}

	@Override
	public void retireProduit(Produit produit) {
		commande.getProduits().remove(produit);

	}

	@Override
	public EtatCommande etatSuivant() {
		return new CommandeValidee(commande);
	}

}

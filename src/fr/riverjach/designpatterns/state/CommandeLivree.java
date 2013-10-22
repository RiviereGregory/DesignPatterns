package fr.riverjach.designpatterns.state;

public class CommandeLivree extends EtatCommande {

	public CommandeLivree(Commande commande) {
		super(commande);
	}

	@Override
	public void ajouteProduit(Produit produit) {

	}

	@Override
	public void efface() {

	}

	@Override
	public void retireProduit(Produit produit) {

	}

	@Override
	public EtatCommande etatSuivant() {
		return this;
	}

}

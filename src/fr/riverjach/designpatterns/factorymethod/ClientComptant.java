package fr.riverjach.designpatterns.factorymethod;

public class ClientComptant extends Client {

	public ClientComptant() {
	}

	@Override
	protected Commande creeCommande(double montant) {
		return new CommandeComptant(montant);
	}

}

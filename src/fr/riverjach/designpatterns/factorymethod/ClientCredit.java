package fr.riverjach.designpatterns.factorymethod;

public class ClientCredit extends Client {

	public ClientCredit() {
	}

	@Override
	protected Commande creeCommande(double montant) {
		return new CommandeCredit(montant);
	}

}

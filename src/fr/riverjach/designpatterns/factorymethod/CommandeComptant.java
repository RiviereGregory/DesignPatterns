package fr.riverjach.designpatterns.factorymethod;

public class CommandeComptant extends Commande {

	public CommandeComptant(double montant) {
		super(montant);
	}

	@Override
	public boolean valide() {
		return true;
	}

	@Override
	public void paye() {
		System.out.println("Le paiement de la commande au comptant de : " + getMontant()
				+ " est effectué.");

	}

}

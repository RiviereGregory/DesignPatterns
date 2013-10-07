package fr.riverjach.designpatterns.factorymethod;

public class CommandeCredit extends Commande {

	public CommandeCredit(double montant) {
		super(montant);
	}

	@Override
	public boolean valide() {
		// V�rifie pour le cr�dit que le montant est comprit entre 1000 et 5000 euros
		return (getMontant() >= 1000.0) && (getMontant() <= 5000.0);
	}

	@Override
	public void paye() {
		System.out.println("Le paiement de la commande au cr�dit de : " + getMontant()
				+ " est effectu�.");

	}

}

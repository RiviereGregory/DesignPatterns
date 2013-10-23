package fr.riverjach.designpatterns.templatemethod;

public class CommandeFrance extends Commande {

	@Override
	protected void calculeTva() {
		setMontantTva(getMontantHt() * 0.196);
	}

}

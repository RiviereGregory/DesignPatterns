package fr.riverjach.designpatterns.templatemethod;

public class CommandeLuxembourg extends Commande {

	@Override
	protected void calculeTva() {
		setMontantTva(getMontantHt() * 0.15);
	}

}

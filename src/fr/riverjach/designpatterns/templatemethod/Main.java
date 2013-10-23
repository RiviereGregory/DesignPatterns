package fr.riverjach.designpatterns.templatemethod;

public class Main {

	public static void main(String[] args) {
		Commande commandeFrance = new CommandeFrance();
		commandeFrance.setMontantHt(10000);
		commandeFrance.calculeMontantTtc();
		commandeFrance.affiche();

		Commande commandeLuxembourg = new CommandeLuxembourg();
		commandeLuxembourg.setMontantHt(10000);
		commandeLuxembourg.calculeMontantTtc();
		commandeLuxembourg.affiche();

	}

}

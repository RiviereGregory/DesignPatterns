package fr.riverjach.designpatterns.command;

public class Main {

	public static void main(String[] args) {
		Vehicule vehicule1 = new Vehicule("A01", 1, 1000.0);
		Vehicule vehicule2 = new Vehicule("A11", 6, 2000.0);
		Vehicule vehicule3 = new Vehicule("Z03", 2, 3000.0);

		Catalogue catalogue = new Catalogue();
		catalogue.ajoute(vehicule1);
		catalogue.ajoute(vehicule2);
		catalogue.ajoute(vehicule3);

		System.out.println("Affichage du catalogue initial ");
		catalogue.affiche();
		System.out.println();

		CommandeSolder commandeSolder = new CommandeSolder(10, 5, 0.1);
		catalogue.lanceCommandeSolder(commandeSolder);
		System.out.println("Affichage catalogue après execution de la première commande");
		catalogue.affiche();
		System.out.println();

		CommandeSolder commandeSolder2 = new CommandeSolder(10, 5, 0.5);
		catalogue.lanceCommandeSolder(commandeSolder2);
		System.out.println("Affichage catalogue après execution de la seconde commande");
		catalogue.affiche();
		System.out.println();

		catalogue.annuleCommandeSolder(1);
		System.out.println("Affichage catalogue après annulation de la première commande");
		catalogue.affiche();
		System.out.println();

		catalogue.retablitCommandeSolder(1);
		System.out.println("Affichage catalogue après retablissement de la première commande");
		catalogue.affiche();
		System.out.println();

	}

}

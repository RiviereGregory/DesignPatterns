package fr.riverjach.designpatterns.flyweight;

public class Main {

	public static void main(String[] args) {
		FabriqueOption fabrique = new FabriqueOption();
		VehiculeCommande vehicule = new VehiculeCommande();
		vehicule.ajouteOptions("air bag", 80, fabrique);
		vehicule.ajouteOptions("direction assist�e", 90, fabrique);
		vehicule.ajouteOptions("vitres �lectriques", 85, fabrique);

		VehiculeCommande vehicule2 = new VehiculeCommande();
		vehicule2.ajouteOptions("air bag", 70, fabrique);
		vehicule2.ajouteOptions("direction assist�e", 100, fabrique);
		vehicule2.ajouteOptions("vitres �lectriques", 80, fabrique);
		vehicule2.ajouteOptions("radio mp3", 70, fabrique);

		System.out.println("Vehicule 1");
		vehicule.afficheOptions();

		System.out.println("Vehicule 2");
		vehicule2.afficheOptions();

	}

}

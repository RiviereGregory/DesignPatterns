package fr.riverjach.designpatterns.flyweight;

public class Main {

	public static void main(String[] args) {
		FabriqueOption fabrique = new FabriqueOption();
		VehiculeCommande vehicule = new VehiculeCommande();
		vehicule.ajouteOptions("air bag", 80, fabrique);
		vehicule.ajouteOptions("direction assistée", 90, fabrique);
		vehicule.ajouteOptions("vitres électriques", 85, fabrique);

		VehiculeCommande vehicule2 = new VehiculeCommande();
		vehicule2.ajouteOptions("air bag", 70, fabrique);
		vehicule2.ajouteOptions("direction assistée", 100, fabrique);
		vehicule2.ajouteOptions("vitres électriques", 80, fabrique);
		vehicule2.ajouteOptions("radio mp3", 70, fabrique);

		System.out.println("Vehicule 1");
		vehicule.afficheOptions();

		System.out.println("Vehicule 2");
		vehicule2.afficheOptions();

	}

}

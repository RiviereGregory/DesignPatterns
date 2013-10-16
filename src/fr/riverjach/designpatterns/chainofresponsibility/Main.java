package fr.riverjach.designpatterns.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		ObjetBase vehicule1 = new Vehicule("Auto++ KT500 Vehicule d'occasion en bon état ");
		System.out.println(vehicule1.donneDescription());

		ObjetBase modele1 = new Modele("Le vehicule est spacieux et confortable", "KT400");
		ObjetBase vehicule2 = new Vehicule(null);
		vehicule2.setSuivant(modele1);
		System.out.println(vehicule2.donneDescription());

		ObjetBase marque1 = new Marque("La marque des autos", "de grande qualité", "Auto++");
		ObjetBase modele2 = new Modele(null, "KT700");
		modele2.setSuivant(marque1);
		ObjetBase vehicule3 = new Vehicule(null);
		vehicule3.setSuivant(modele2);
		System.out.println(vehicule3.donneDescription());

		ObjetBase vehicule4 = new Vehicule(null);
		System.out.println(vehicule4.donneDescription());

	}

}

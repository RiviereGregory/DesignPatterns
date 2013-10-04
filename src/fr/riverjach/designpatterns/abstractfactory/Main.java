package fr.riverjach.designpatterns.abstractfactory;

import java.util.Scanner;

public class Main {

	public static int nbAutos = 3;
	public static int nbScooters = 3;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		FabriqueVehicule fabrique = null;

		Automobile[] autos = new Automobile[nbAutos];
		Scooter[] scooters = new Scooter[nbScooters];
		boolean choixOk = false;
		while (!choixOk) {

			System.out
					.println("Voulez-vous utiliser des Vehicules électriques (1) ou essence (2) : ");

			String choix = reader.next();
			if (choix.equals("1")) {
				fabrique = new FabriqueVehiculeElectrique();
				choixOk = true;
			} else if (choix.equals("2")) {
				fabrique = new FabriqueVehiculeEssence();
				choixOk = true;
			} else {
				System.out.println("Erreur de saisie");
			}
		}

		for (int index = 0; index < nbAutos; index++) {
			autos[index] = fabrique.creeAutomobile("standard", "jaune", 6 + index, 3.2);

		}
		for (int index = 0; index < nbScooters; index++) {
			scooters[index] = fabrique.creeScooter("classique", "rouge", 2 + index);

		}

		for (Automobile auto : autos) {
			auto.afficheCaracteristiques();
		}
		for (Scooter scooter : scooters) {
			scooter.afficheCaracteristiques();
		}

		reader.close();

	}

}

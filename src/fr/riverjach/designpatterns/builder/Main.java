package fr.riverjach.designpatterns.builder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ConstructeurLiasseVehicule constructeur = null;

		boolean choixOk = false;
		while (!choixOk) {

			System.out.println("Voulez-vous construire des liasses HTML (1) ou PDF (2) : ");

			String choix = reader.next();
			if (choix.equals("1")) {
				constructeur = new ConstructeurLiasseVehiculeHtml();
				choixOk = true;
			} else if (choix.equals("2")) {
				constructeur = new ConstructeurLiasseVehiculePdf();
				choixOk = true;
			} else {
				System.out.println("Erreur de saisie");
			}
		}

		Vendeur vendeur = new Vendeur(constructeur);
		System.out.println("Voulez-vous entrer le nom du client  : ");

		String nomC = reader.next();

		Liasse liasse = vendeur.contruit(nomC);
		liasse.imprime();

		reader.close();

	}

}

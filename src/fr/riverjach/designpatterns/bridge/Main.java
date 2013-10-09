package fr.riverjach.designpatterns.bridge;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choix = "";
		Boolean choixValide = true;

		while (!"Q".equalsIgnoreCase(choix)) {
			System.out.println("**************** Menu *****************");
			System.out.println("* 1 - Immatriculation Luxembourgeoise *");
			System.out.println("* 2 - Immatriculation Française       *");
			System.out.println("* Q - Quitter                         *");
			System.out.println("***************************************");
			System.out.println("Choix : ");

			choix = scanner.next();
			choixValide = true;

			switch (choix.toUpperCase()) {
			case "Q":
				break;

			case "1":
				FormImmatriculationLuxembourg formulaire1 = null;
				while (choixValide) {
					System.out.println("type de document à céer (a) HTML ou (b) Applet : ");
					choix = scanner.next();
					if ("a".equalsIgnoreCase(choix)) {
						formulaire1 = new FormImmatriculationLuxembourg(new FormHtmlImpl());
						choixValide = false;

					} else if ("b".equalsIgnoreCase(choix)) {
						formulaire1 = new FormImmatriculationLuxembourg(new FormAppletImpl());
						choixValide = false;
					} else {
						System.out.println("Erreur de saisie");
					}
				}
				formulaire1.affiche();
				gereSaisieDocument(formulaire1);
				break;

			case "2":
				FormImmatriculationFrance formulaire2 = null;
				while (choixValide) {
					System.out.println("type de document à céer (a) HTML ou (b) Applet : ");
					choix = scanner.next();
					if ("a".equalsIgnoreCase(choix)) {
						formulaire2 = new FormImmatriculationFrance(new FormHtmlImpl());
						choixValide = false;

					} else if ("b".equalsIgnoreCase(choix)) {
						formulaire2 = new FormImmatriculationFrance(new FormAppletImpl());
						choixValide = false;
					} else {
						System.out.println("Erreur de saisie");
					}
				}
				formulaire2.affiche();
				gereSaisieDocument(formulaire2);
				break;
			default:
				break;
			}

			System.out.println();

		}

		scanner.close();

	}

	public static void gereSaisieDocument(FormulaireImmatriculation formulaire) {
		if (formulaire.gereSaisie()) {
			formulaire.genereDocument();
		} else {
			System.out.println("Erreur de saisie");
		}
	}

}

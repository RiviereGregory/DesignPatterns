package fr.riverjach.designpatterns.bridge;

public class Main {

	public static void main(String[] args) {
		FormImmatriculationLuxembourg formulaire1 = new FormImmatriculationLuxembourg(
				new FormHtmlImpl());
		formulaire1.affiche();
		if (formulaire1.gereSaisie()) {
			formulaire1.genereDocument();
		}
		System.out.println();
		FormImmatriculationFrance formulaire2 = new FormImmatriculationFrance(new FormAppletImpl());
		formulaire2.affiche();
		if (formulaire2.gereSaisie()) {
			formulaire2.genereDocument();
		}

	}

}

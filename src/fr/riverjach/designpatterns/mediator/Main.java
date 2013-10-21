package fr.riverjach.designpatterns.mediator;

public class Main {

	public static void main(String[] args) {
		Formulaire formulaire = new Formulaire();
		formulaire.ajouteControle(new ZoneSaisie("Nom"));
		formulaire.ajouteControle(new ZoneSaisie("Prénom"));

		PopupMenu menu = new PopupMenu("Coemprunteur");
		menu.ajouteOption("Sans coemprunteur");
		menu.ajouteOption("Avec coemprunteur");
		formulaire.ajouteControle(menu);
		formulaire.setMenuCoemprunteur(menu);

		Bouton bouton = new Bouton("OK");
		formulaire.ajouteControle(bouton);
		formulaire.setBoutonOK(bouton);

		formulaire.ajouteControleCoemprunteur(new ZoneSaisie("Nom du coemprunteur"));
		formulaire.ajouteControleCoemprunteur(new ZoneSaisie("Préom du coemprunteur"));

		formulaire.saisie();

	}

}

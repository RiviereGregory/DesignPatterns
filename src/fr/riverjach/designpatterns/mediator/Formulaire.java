package fr.riverjach.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Formulaire {
	protected List<Controle> controles = new ArrayList<>();
	protected List<Controle> controlesCoemprunteur = new ArrayList<>();
	protected PopupMenu menuCoemprunteur;
	protected Bouton boutonOK;
	protected boolean enCours = true;

	public void ajouteControle(Controle controle) {
		controles.add(controle);
		controle.setDirecteur(this);
	}

	public void ajouteControleCoemprunteur(Controle controle) {
		controlesCoemprunteur.add(controle);
		controle.setDirecteur(this);
	}

	public void setMenuCoemprunteur(PopupMenu menuCoemprunteur) {
		this.menuCoemprunteur = menuCoemprunteur;
	}

	public void setBoutonOK(Bouton boutonOK) {
		this.boutonOK = boutonOK;
	}

	public void controleModifie(Controle controle) {
		if (controle == menuCoemprunteur) {
			if (controle.getValeur().equalsIgnoreCase("avec coemprunteur")) {
				for (Controle elementCoemprunteur : controlesCoemprunteur) {
					elementCoemprunteur.saisie();
				}
			}
		}

		if (controle == boutonOK) {
			enCours = false;
		}
	}

	public void saisie() {
		while (true) {
			for (Controle controle : controles) {
				controle.saisie();
				if (!enCours) {
					return;
				}
			}
		}
	}
}

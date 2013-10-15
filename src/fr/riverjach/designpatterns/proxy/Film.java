package fr.riverjach.designpatterns.proxy;

public class Film implements Animation {

	@Override
	public void dessine() {
		System.out.println("Affichage du film");

	}

	@Override
	public void clic() {

	}

	public void charge() {
		System.out.println("Chargement du film");
	}

	public void joue() {
		System.out.println("Lecture du film");
	}

}

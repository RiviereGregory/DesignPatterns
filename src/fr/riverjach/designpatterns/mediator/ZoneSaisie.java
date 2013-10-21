package fr.riverjach.designpatterns.mediator;

import java.util.Scanner;

public class ZoneSaisie extends Controle {
	Scanner reader = new Scanner(System.in);

	public ZoneSaisie(String nom) {
		super(nom);
	}

	@Override
	public void saisie() {
		System.out.println("Saisie de : " + getNom());
		setValeur(reader.nextLine());
		this.modifie();
	}

}

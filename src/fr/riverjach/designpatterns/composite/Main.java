package fr.riverjach.designpatterns.composite;

public class Main {

	public static void main(String[] args) {
		Societe societe1 = new SocieteSansFiliale();
		societe1.ajouteVehicule();
		Societe societe2 = new SocieteSansFiliale();
		societe2.ajouteVehicule();
		societe2.ajouteVehicule();
		Societe groupe = new SocieteMere();
		groupe.ajouteFiliale(societe1);
		groupe.ajouteFiliale(societe2);
		groupe.ajouteVehicule();
		System.out.println("cout d'entretien total du groupe : " + groupe.calculeCoutEntretien());
		System.out.println("cout d'entretien societe1 : " + societe1.calculeCoutEntretien());
		System.out.println("cout d'entretien societe2 : " + societe2.calculeCoutEntretien());

	}

}

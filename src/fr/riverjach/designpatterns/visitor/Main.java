package fr.riverjach.designpatterns.visitor;

public class Main {

	public static void main(String[] args) {
		Societe societe1 = new SocieteSansFiliale("société1", "info@societe1.com",
				"rue de la société1");
		Societe societe2 = new SocieteSansFiliale("société2", "info@societe2.com",
				"rue de la société2");
		Societe groupe1 = new SocieteMere("groupe1", "info@groupe1.com", "rue du groupe1");

		groupe1.ajouteFiliale(societe1);
		groupe1.ajouteFiliale(societe2);

		Societe societe3 = new SocieteSansFiliale("société3", "info@societe3.com",
				"rue de la société3");
		Societe groupe2 = new SocieteMere("groupe2", "info@groupe2.com", "rue du groupe2");

		groupe2.ajouteFiliale(groupe1);
		groupe2.ajouteFiliale(societe3);

		groupe2.accepteVisiteur(new VisiteurMailingCommercial());

		System.out.println();
		societe1.ajouteVehicule();
		societe2.ajouteVehicule();
		societe2.ajouteVehicule();
		groupe1.ajouteVehicule();
		groupe1.accepteVisiteur(new VisiteurCalculeCoutEntretien());

		System.out.println();

		societe3.ajouteVehicule();
		societe3.ajouteVehicule();
		societe3.ajouteVehicule();
		groupe2.ajouteVehicule();
		groupe2.accepteVisiteur(new VisiteurCalculeCoutEntretien());

	}

}

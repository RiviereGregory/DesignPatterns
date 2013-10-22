package fr.riverjach.designpatterns.strategy;

public class Main {

	public static void main(String[] args) {
		VueCatalogue vueCatalogue1 = new VueCatalogue(new DessinTroisVehiculesLigne());
		vueCatalogue1.dessine();
		VueCatalogue vueCatalogue2 = new VueCatalogue(new DessinUnVehiculeLigne());
		vueCatalogue2.dessine();

	}

}

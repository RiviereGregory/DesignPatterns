package fr.riverjach.designpatterns.observer;

public class Main {

	public static void main(String[] args) {
		Vehicule vehicule = new Vehicule();
		vehicule.setDescription("Vehicule bon marché");
		vehicule.setPrix(5000.0);
		System.out.println();
		VueVehicule vueVehicule = new VueVehicule(vehicule);
		vueVehicule.redessine();
		System.out.println();

		vehicule.setPrix(4500.0);
		System.out.println();

		VueVehicule vueVehicule2 = new VueVehicule(vehicule);
		vueVehicule2.redessine();
		System.out.println();
		vehicule.setPrix(5500.0);
		System.out.println();
		System.out.println();

		vehicule.setDescription("Vehicule comme neuf");

	}

}

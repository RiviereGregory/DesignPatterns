package fr.riverjach.designpatterns.decorator;

public class Main {

	public static void main(String[] args) {
		VueVehicule vueVehicule = new VueVehicule();
		ModeleDecorateur modeleDecorateur = new ModeleDecorateur(vueVehicule);
		MarqueDecorateur marqueDecorateur = new MarqueDecorateur(modeleDecorateur);

		marqueDecorateur.affiche();

	}

}

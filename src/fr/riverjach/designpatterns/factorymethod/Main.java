package fr.riverjach.designpatterns.factorymethod;

public class Main {

	
	public static void main(String[] args) {
		Client client;
		client = new ClientComptant();
		client.nouvelleCommande(2000.0);
		client.nouvelleCommande(10000.0);
		client = new ClientCredit();
		client.nouvelleCommande(2000.0);
		client.nouvelleCommande(10000.0);

	}

}

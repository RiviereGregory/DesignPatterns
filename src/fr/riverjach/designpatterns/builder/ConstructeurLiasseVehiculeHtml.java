package fr.riverjach.designpatterns.builder;

public class ConstructeurLiasseVehiculeHtml extends ConstructeurLiasseVehicule {

	public ConstructeurLiasseVehiculeHtml() {
		liasse = new LiasseHtml();
	}

	@Override
	public void contruireBonDeCommande(String nomClient) {
		String document;
		document = "<HTML>Bon de commande Client : " + nomClient + "</HTML>";
		liasse.ajouteDocument(document);
	}

	@Override
	public void construitDemandeImmatriculation(String nomDemandeur) {
		String document;
		document = "<HTML>Demande d'immatriculation Demandeur : " + nomDemandeur + "</HTML>";
		liasse.ajouteDocument(document);
	}

}

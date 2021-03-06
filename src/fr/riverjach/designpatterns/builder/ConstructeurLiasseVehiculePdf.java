package fr.riverjach.designpatterns.builder;

public class ConstructeurLiasseVehiculePdf extends ConstructeurLiasseVehicule {

	public ConstructeurLiasseVehiculePdf() {
		super(new LiassePdf());
	}

	@Override
	public void contruireBonDeCommande(String nomClient) {
		String document;
		document = "<PDF>Bon de commande Client : " + nomClient + "</PDF>";
		getLiasse().ajouteDocument(document);
	}

	@Override
	public void construitDemandeImmatriculation(String nomDemandeur) {
		String document;
		document = "<PDF>Demande d'immatriculation Demandeur : " + nomDemandeur + "</PDF>";
		getLiasse().ajouteDocument(document);
	}

}

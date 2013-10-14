package fr.riverjach.designpatterns.facade;

import java.util.List;

public class WebServiceAutoImpl implements WebServiceAuto {
	protected Catalogue catalogue = new ComposantCatalogue();
	protected GestionDocument gestionDocument = new ComposantGestionDocument();

	@Override
	public String document(int index) {
		return gestionDocument.document(index);
	}

	@Override
	public List<String> chercheVehicules(int prixMoyen, int ecartMax) {
		return catalogue.retrouveVehicules(prixMoyen - ecartMax, prixMoyen + ecartMax);
	}

}

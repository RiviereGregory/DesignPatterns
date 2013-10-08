package fr.riverjach.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class LiasseClient extends Liasse {

	public LiasseClient(String informations) {
		setDocuments(new ArrayList<Document>());
		LiasseVierge liasseVierge = LiasseVierge.instance();
		List<Document> documentsVierges = liasseVierge.getDocuments();
		for (Document document : documentsVierges) {
			Document copieDocument = document.duplique();
			copieDocument.remplit(informations);
			getDocuments().add(copieDocument);
		}
	}

	public void affiche() {
		for (Document document : getDocuments()) {
			document.affiche();
		}
	}

	public void imprime() {
		for (Document document : getDocuments()) {
			document.imprime();
		}
	}
}

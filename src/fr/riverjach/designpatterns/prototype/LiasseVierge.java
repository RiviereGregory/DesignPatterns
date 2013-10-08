package fr.riverjach.designpatterns.prototype;

import java.util.ArrayList;

public class LiasseVierge extends Liasse {
	private static LiasseVierge instance = null;

	private LiasseVierge() {
		setDocuments(new ArrayList<Document>());
	}

	public static LiasseVierge instance() {
		if (instance == null) {
			instance = new LiasseVierge();
		}
		return instance;

	}

	public void ajoute(Document doc) {
		getDocuments().add(doc);
	}

	public void retire(Document doc) {
		getDocuments().remove(doc);
	}
}

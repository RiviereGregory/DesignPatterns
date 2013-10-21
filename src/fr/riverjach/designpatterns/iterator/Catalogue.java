package fr.riverjach.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public abstract class Catalogue<TElement extends Element, TIterateur extends Iterateur<TElement>> {
	protected List<TElement> contenu = new ArrayList<>();

	protected abstract TIterateur creeIterateur();

	public TIterateur recherche(String motCleRequete) {
		TIterateur resultat = creeIterateur();
		resultat.setMotCleRequete(motCleRequete, contenu);
		return resultat;
	}
}

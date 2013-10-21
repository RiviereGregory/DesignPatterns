package fr.riverjach.designpatterns.iterator;

public class CatalogueVehicule extends Catalogue<Vehicule, IterateurVehicule> {

	public CatalogueVehicule() {
		// Collection viendrait d'une véritable base de données dans un véritable applicatif
		contenu.add(new Vehicule("vehicule bon marche"));
		contenu.add(new Vehicule("petit vehicule bon marche"));
		contenu.add(new Vehicule("vehicule grande qualite"));
		contenu.add(new Vehicule("vehicule tres bon marche"));
		contenu.add(new Vehicule("vehicule bon marche de grande qualite"));
	}

	@Override
	protected IterateurVehicule creeIterateur() {
		return new IterateurVehicule();
	}

}

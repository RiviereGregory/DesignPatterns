package fr.riverjach.designpatterns.iterator;

public class CatalogueVehicule extends Catalogue<Vehicule, IterateurVehicule> {

	public CatalogueVehicule() {
		// Collection viendrait d'une v�ritable base de donn�es dans un v�ritable applicatif
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

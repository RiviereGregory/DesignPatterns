package fr.riverjach.designpatterns.builder;

public class Vendeur {
	protected ConstructeurLiasseVehicule constructeur;

	public Vendeur() {

	}

	public Vendeur(ConstructeurLiasseVehicule constructeur) {
		super();
		this.constructeur = constructeur;
	}

	public Liasse contruit(String nomClient) {

		constructeur.contruireBonDeCommande(nomClient);
		constructeur.construitDemandeImmatriculation(nomClient);
		Liasse liasse = constructeur.resultat();

		return liasse;

	}

	@Override
	public String toString() {
		return "Vendeur [constructeur=" + constructeur + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((constructeur == null) ? 0 : constructeur.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendeur other = (Vendeur) obj;
		if (constructeur == null) {
			if (other.constructeur != null)
				return false;
		} else if (!constructeur.equals(other.constructeur))
			return false;
		return true;
	}

	public ConstructeurLiasseVehicule getConstructeur() {
		return constructeur;
	}

	public void setConstructeur(ConstructeurLiasseVehicule constructeur) {
		this.constructeur = constructeur;
	}
}

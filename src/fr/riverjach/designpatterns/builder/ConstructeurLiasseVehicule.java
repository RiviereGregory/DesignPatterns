package fr.riverjach.designpatterns.builder;

public abstract class ConstructeurLiasseVehicule {

	protected Liasse liasse;

	public ConstructeurLiasseVehicule() {
	}

	public ConstructeurLiasseVehicule(Liasse liasse) {
		super();
		this.liasse = liasse;
	}

	public abstract void contruireBonDeCommande(String nomClient);

	public abstract void construitDemandeImmatriculation(String nomDemandeur);

	public Liasse resultat() {
		return liasse;
	}

	@Override
	public String toString() {
		return "ConstructeurLiasseVehicule [liasse=" + liasse + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((liasse == null) ? 0 : liasse.hashCode());
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
		ConstructeurLiasseVehicule other = (ConstructeurLiasseVehicule) obj;
		if (liasse == null) {
			if (other.liasse != null)
				return false;
		} else if (!liasse.equals(other.liasse))
			return false;
		return true;
	}

	public Liasse getLiasse() {
		return liasse;
	}

	public void setLiasse(Liasse liasse) {
		this.liasse = liasse;
	}

}

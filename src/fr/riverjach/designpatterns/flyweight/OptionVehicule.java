package fr.riverjach.designpatterns.flyweight;

public class OptionVehicule {
	protected String nom;
	protected String description;
	protected int prixStandard;

	public OptionVehicule(String nom) {
		super();
		this.nom = nom;
		this.description = "Description de " + nom;
		this.prixStandard = 100;
	}

	public void affiche(int prixDeVente) {
		System.out.println("Option");
		System.out.println("Nom : " + getNom());
		System.out.println(getDescription());
		System.out.println("Prix standard : " + getPrixStandard());
		System.out.println("Prix de vente : " + prixDeVente);

	}

	@Override
	public String toString() {
		return "OptionVehicule [nom=" + nom + ", description=" + description + ", prixStandard="
				+ prixStandard + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + prixStandard;
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
		OptionVehicule other = (OptionVehicule) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prixStandard != other.prixStandard)
			return false;
		return true;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrixStandard() {
		return prixStandard;
	}

	public void setPrixStandard(int prixStandard) {
		this.prixStandard = prixStandard;
	}

}

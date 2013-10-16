package fr.riverjach.designpatterns.chainofresponsibility;

public class Marque extends ObjetBase {
	protected String description1, description2;
	protected String nom;

	public Marque(String description1, String description2, String nom) {
		super();
		this.description1 = description1;
		this.description2 = description2;
		this.nom = nom;
	}

	@Override
	protected String getDescription() {
		if ((description1 != null) && (description2 != null)) {
			return "Marque " + nom + " : " + description1 + " " + description2;
		} else if (description1 != null) {
			return "Marque " + nom + " : " + description1;
		} else {
			return null;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description1 == null) ? 0 : description1.hashCode());
		result = prime * result + ((description2 == null) ? 0 : description2.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
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
		Marque other = (Marque) obj;
		if (description1 == null) {
			if (other.description1 != null)
				return false;
		} else if (!description1.equals(other.description1))
			return false;
		if (description2 == null) {
			if (other.description2 != null)
				return false;
		} else if (!description2.equals(other.description2))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Marque [description1=" + description1 + ", description2=" + description2 + ", nom="
				+ nom + "]";
	}

	public String getDescription1() {
		return description1;
	}

	public void setDescription1(String description1) {
		this.description1 = description1;
	}

	public String getDescription2() {
		return description2;
	}

	public void setDescription2(String description2) {
		this.description2 = description2;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}

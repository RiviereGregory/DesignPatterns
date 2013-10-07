package fr.riverjach.designpatterns.abstractfactory;

public abstract class Scooter {
	protected String modele;
	protected String couleur;
	protected int puissance;

	public Scooter(String modele, String couleur, int puissance) {
		super();
		this.modele = modele;
		this.couleur = couleur;
		this.puissance = puissance;
	}

	public abstract void afficheCaracteristiques();

	@Override
	public String toString() {
		return "Scooter [modele=" + modele + ", couleur=" + couleur
				+ ", puissance=" + puissance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((couleur == null) ? 0 : couleur.hashCode());
		result = prime * result + ((modele == null) ? 0 : modele.hashCode());
		result = prime * result + puissance;
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
		Scooter other = (Scooter) obj;
		if (couleur == null) {
			if (other.couleur != null)
				return false;
		} else if (!couleur.equals(other.couleur))
			return false;
		if (modele == null) {
			if (other.modele != null)
				return false;
		} else if (!modele.equals(other.modele))
			return false;
		if (puissance != other.puissance)
			return false;
		return true;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

}
